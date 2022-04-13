package com.biz.emplyeepayrollapp.service;

import com.biz.emplyeepayrollapp.dto.EmployeeDTO;
import com.biz.emplyeepayrollapp.dto.ResponseDTO;
import com.biz.emplyeepayrollapp.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollServiceimpl implements IEmployeePayrollService{
    /**
     * Get the all employee data
     * @return list
     */
    @Override
    public List<Employee> getEmployeePayrollData() {
       List<Employee> employeeList=new ArrayList<>();
       employeeList.add(new Employee(1,new EmployeeDTO("Makrand",560000)));
       return employeeList;

    }

    /**
     * getting the employee data by using ID
     * @param empId employee Id
     * @return employee object having one data
     */
    @Override
    public Employee getEmployeePayrollDataByID(int empId) {
       return new Employee(2,new EmployeeDTO("Sam",570000));
    }

    @Override
    public Employee cretaeEmployeeData(EmployeeDTO employeeDTO) {
        return new Employee(3,employeeDTO);
    }

    @Override
    public Employee updateEmployeeData(EmployeeDTO employeeDTO) {
        return null;
    }

    @Override
    public void deleteEmployeeData(int empId) {

    }
}
