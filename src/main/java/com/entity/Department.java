package com.entity;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Arief on 8/26/2017.
 */
@Entity
@Table(name="t_depart")
public class Department {

    @Id
    @Column(name="id_depart")
    private int id;


    @Column(name="depart_name")
    private String name;



    @ManyToMany(mappedBy = "departments")
    private List<Employee> employees;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="city_depart",joinColumns = @JoinColumn(name="id_depart"),inverseJoinColumns = @JoinColumn(name="id_city"))
    @Cascade({org.hibernate.annotations.CascadeType.MERGE})
    private List<City> cities;


    public Department(int id, String name, List<Employee> employees, List<City> cities) {
        this.id = id;
        this.name = name;
        this.employees = employees;
        this.cities = cities;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public Department() {
    }

    public Department(int id, String name, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
