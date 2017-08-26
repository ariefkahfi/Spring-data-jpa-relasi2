package com.services;

import com.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Arief on 8/26/2017.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer>{
}
