package com.randhir.model;

/**
 * Created by randhir on 13/7/17.
 */
public class Emp
{

    public Emp(int id,int salary,String name)
    {
        this.id=id;
        this.salary=salary;
        this.name=name;
    }
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int salary;
    private String name;
}
