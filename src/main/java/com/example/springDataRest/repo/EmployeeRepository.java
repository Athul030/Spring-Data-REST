package com.example.springDataRest.repo;

import com.example.springDataRest.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //Spring Data Rest will make these endpoints available for free by taking the
    // plural form of the Type mentioned in the JpaRepository and changing the first letter to smallerCase

    // '/employees' for POST and GET
    // '/employees/{employeeId} GET,PUT and DELETE for an exiting employee

}
