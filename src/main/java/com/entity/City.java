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
@Table(name="t_city")
public class City {

    @Id
    @Column(name="id_city")
    private int id;


    @Column(name="city_name")
    private String name;


    @ManyToMany(mappedBy = "cities")
    private List<Department> departmentList;

    public City() {
    }

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public City(int id, String name, List<Department> departmentList) {
        this.id = id;
        this.name = name;
        this.departmentList = departmentList;
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

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City city = (City) o;

        if (id != city.id) return false;
        if (name != null ? !name.equals(city.name) : city.name != null) return false;
        return departmentList != null ? departmentList.equals(city.departmentList) : city.departmentList == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (departmentList != null ? departmentList.hashCode() : 0);
        return result;
    }
}
