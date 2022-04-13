package com.biz.emplyeepayrollapp.service;

import com.biz.emplyeepayrollapp.dto.EmployeeDTO;
import com.biz.emplyeepayrollapp.dto.ResponseDTO;
import com.biz.emplyeepayrollapp.entity.Employee;

import java.util.List;

public interface IEmployeePayrollService {

    //Get all employee data
    List<Employee>getEmployeePayrollData();

    //Get employee data using employee id
    Employee getEmployeePayrollDataByID(int empId);

    Employee cretaeEmployeeData(EmployeeDTO responseDTO);

    Employee updateEmployeeData(EmployeeDTO employeeDTO);

    void deleteEmployeeData(int empId);
}
