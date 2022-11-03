package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(((ResultSet) rs).getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersandPosts() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME " +
                "FROM USERS U JOIN POSTS P on U.ID = P.USER_ID " +
                "GROUP BY U.ID " +
                "HAVING COUNT(*) >=2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        String exceptedString = "John, Smith";
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;
        while (rs.next()) {
            stringBuilder.append(rs.getString("FIRSTNAME")).append(", ").append(rs.getString("LASTNAME"));
            System.out.println("User list :" + stringBuilder); // User list that fulfill the requirements
            counter ++;
        }
        rs.close();
        statement.close();
        assertEquals(exceptedString, stringBuilder.toString());
    }

}