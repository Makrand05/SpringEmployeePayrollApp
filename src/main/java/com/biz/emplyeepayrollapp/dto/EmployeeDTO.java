package com.biz.emplyeepayrollapp.dto;

import com.biz.emplyeepayrollapp.entity.Employee;

public class EmployeeDTO {

    public String name;

    public long salary;


    public EmployeeDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
