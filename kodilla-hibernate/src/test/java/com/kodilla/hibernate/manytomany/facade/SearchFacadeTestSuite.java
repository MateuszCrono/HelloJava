package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static junit.framework.Assert.assertEquals;

class SearchFacadeTestSuite {


    @Autowired
    private SearchFacade searchFacade;
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testFindAnyCompany() {

        //Given
        Company company1 = new Company("Company1");
        Company company2 = new Company("Kampania2");
        Company company3 = new Company("Company3");
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        //When

        List<Company> companies = searchFacade.findAnyCompany("C");

        //Then
        try {
            assertEquals(2, companies.size());
        } finally {
            //ClenUp
            companyDao.deleteAll();
        }
    }

    @Test
    void testFindAnyEmployee() {

        //Given
        Employee employee1 = new Employee("Andrzej", "lastname1");
        Employee employee2 = new Employee("Ewa", "lastname2");
        Employee employee3 = new Employee("Andrzej", "lastname3");
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        //When

        List<Employee> employees = searchFacade.findAnyEmployee("Ewa");

        //Then
        try {
            Assertions.assertEquals(1, employees.size());
        } finally {
            //ClenUp
            employeeDao.deleteAll();
        }
    }
}