package com.rays.streamAPI;


public class Employee1 {

    private String name;
    private int departmentId;

    public Employee1(String name, int departmentId) {
        this.name = name;
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }
}