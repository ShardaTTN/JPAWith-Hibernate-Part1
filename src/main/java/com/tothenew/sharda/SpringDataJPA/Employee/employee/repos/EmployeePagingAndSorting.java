package com.tothenew.sharda.SpringDataJPA.Employee.employee.repos;

import com.tothenew.sharda.SpringDataJPA.Employee.employee.entities.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;

public interface EmployeePagingAndSorting extends PagingAndSortingRepository<Employee, Integer> {

}
