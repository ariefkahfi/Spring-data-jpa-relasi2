package com.entity;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Arief on 8/26/2017.
 */
@Entity
@Table(name="t_emp")
public class Employee {

    @Id
    @Column(name="id_emp")
    private int id;

    @Column(name="emp_name")
    private String name;


    @ManyToMany
    @Cascade({CascadeType.MERGE})
    @JoinTable(name = "dept_emp",joinColumns = @JoinColumn(name="id_emp"),inverseJoinColumns = @JoinColumn(name="id_dept"))
    private List<Department> departments;

    public Employee() {
    }


    public Employee(int id, String name, List<Department> departments) {
        this.id = id;
        this.name = name;
        this.departments = departments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
