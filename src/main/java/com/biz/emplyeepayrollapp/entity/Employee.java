package com.biz.emplyeepayrollapp.entity;

import com.biz.emplyeepayrollapp.dto.EmployeeDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private long id;
    private String name;
    private long salary;

    public Employee(long id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int id, EmployeeDTO name) {
        this.id = id;
        this.name = name.name;
        this.salary = name.salary;
    }
}
