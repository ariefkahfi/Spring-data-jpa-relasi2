package com.services;

import com.entity.City;
import com.entity.Department;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Arief on 8/26/2017.
 */
@Repository
public interface DepartmentRepository extends CrudRepository<Department,Integer> {

}
