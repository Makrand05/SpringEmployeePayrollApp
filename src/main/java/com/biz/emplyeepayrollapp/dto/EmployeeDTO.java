package com.biz.emplyeepayrollapp.dto;

import com.biz.emplyeepayrollapp.entity.Employee;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class EmployeeDTO {
    @NotEmpty(message = "Please enter name")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "Please Enter valid Name")
    public String name;

    @Min(value = 5000,message = "Salary should be more that 5000")
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
