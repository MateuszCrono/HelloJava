package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
        Company company2 = new Company("Company2");
        Company company3 = new Company("Company3");

        //When
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        long c1 = company1.getId();
        long c2 = company2.getId();
        long c3 = company3.getId();

        List<Company> companies = searchFacade.findAnyCompany("C");

        //Then
        try {
            Assertions.assertEquals(3, companies.size());
        } finally {
            //ClenUp
            companyDao.deleteAll();
        }
    }

    @Test
    void testFindAnyEmployee() {

        //Given
        Employee employee1 = new Employee("firstname1", "lastname1");
        Employee employee2 = new Employee("firstname2", "lastname2");
        Employee employee3 = new Employee("firstname3", "lastname3");

        //When
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        List<Employee> employees = searchFacade.findAnyEmployee("name");

        //Then
        try {
            Assertions.assertEquals(3, employees.size());
        } finally {
            //ClenUp
            employeeDao.deleteAll();
        }
    }
}