package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.*;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Mock
    private static Statistics statisticsMock;

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Starting tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for Statistics")
    class ForumStatisticsTests {
        @Test
        void testZeroPosts() {
            //Given
            statisticsMock = mock(Statistics.class);
            ForumStatistics forumStatistics = new ForumStatistics();
            List<String> userListMock = new ArrayList<>();
            userListMock.add("David87");
            when(statisticsMock.usersNames()).thenReturn(userListMock);
            when(statisticsMock.postsCount()).thenReturn(0);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(0, forumStatistics.getPostCount());
        }

        @Test
        void testThousandPosts() {
            //Given
            statisticsMock = mock(Statistics.class);
            ForumStatistics forumStatistics = new ForumStatistics();
            List<String> userListMock = new ArrayList<>();
            userListMock.add("David87");
            when(statisticsMock.postsCount()).thenReturn(1000);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(1000, forumStatistics.getPostCount());
        }

        @Test
        void testZeroComments() {
            //Given
            statisticsMock = mock(Statistics.class);
            ForumStatistics forumStatistics = new ForumStatistics();
            List<String> userListMock = new ArrayList<>();
            userListMock.add("David87");
            when(statisticsMock.commentsCount()).thenReturn(0);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(0, forumStatistics.getCommentCount());
        }

        @Test
        void testCommentsOverPosts() {
            //Given
            statisticsMock = mock(Statistics.class);
            ForumStatistics forumStatistics = new ForumStatistics();
            List<String> userListMock = new ArrayList<>();
            userListMock.add("David87");
            userListMock.add("Marcelini65");
            when(statisticsMock.commentsCount()).thenReturn(100);
            when(statisticsMock.postsCount()).thenReturn(50);
            when(statisticsMock.usersNames()).thenReturn(userListMock);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(100, forumStatistics.getCommentCount());
            assertEquals(50,forumStatistics.getPostCount());
            assertEquals(2.0, forumStatistics.getCommentPostAverage());
        }

        @Test
        void testCommentsBelowPosts() {
            //Given
            statisticsMock = mock(Statistics.class);
            ForumStatistics forumStatistics = new ForumStatistics();
            List<String> userListMock = new ArrayList<>();
            userListMock.add("David87");
            userListMock.add("Marcelini65");
            when(statisticsMock.commentsCount()).thenReturn(50);
            when(statisticsMock.postsCount()).thenReturn(100);
            when(statisticsMock.usersNames()).thenReturn(userListMock);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(50, forumStatistics.getCommentCount());
            assertEquals(100,forumStatistics.getPostCount());
            assertEquals(0.5, forumStatistics.getCommentPostAverage());
        }

        @Test
        void testZeroUsers() {
            //Given
            statisticsMock = mock(Statistics.class);
            ForumStatistics forumStatistics = new ForumStatistics();
            when(statisticsMock.commentsCount()).thenReturn(50);
            when(statisticsMock.postsCount()).thenReturn(100);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(0, forumStatistics.getUserCount());
        }

        @Test
        void testHundredUsers() {
            //Given
            statisticsMock = mock(Statistics.class);
            ForumStatistics forumStatistics = new ForumStatistics();
            List<String> userListMock = new ArrayList<>();
            for(int i=0; i<100; i++){
                userListMock.add("User");
            }
            when(statisticsMock.commentsCount()).thenReturn(50);
            when(statisticsMock.postsCount()).thenReturn(100);
            when(statisticsMock.usersNames()).thenReturn(userListMock);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(100, forumStatistics.getUserCount());
        }

    }
}
