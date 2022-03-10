package com.tothenew.sharda.SpringDataJPA.Employee.employee.repos;

import com.tothenew.sharda.SpringDataJPA.Employee.employee.entities.Employee;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findByName(String name);

    List<Employee> findByAgeBetween(int age1, int age2);

    List<Employee> findByNameLike(String name);


}
