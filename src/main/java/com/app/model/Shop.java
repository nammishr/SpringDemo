package com.app.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;


@Entity
public class Shop {

    @Id
    @Column(name="shopname")
    private String name;

    @Column(name="employees")
    private List<String> employees;

    public Shop(String name, List<String> employees) {
        this.name = name;
        this.employees = employees;
    }

    public Shop(){ };


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }
}
