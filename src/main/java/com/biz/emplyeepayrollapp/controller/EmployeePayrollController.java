package com.biz.emplyeepayrollapp.controller;

import com.biz.emplyeepayrollapp.dto.EmployeeDTO;
import com.biz.emplyeepayrollapp.dto.ResponseDTO;
import com.biz.emplyeepayrollapp.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<Spring> getEmployeePayrollData(){
        Employee employee=null;
        employee=new Employee(1,new EmployeeDTO("Makrand",600000));
        ResponseDTO responseDTO=new ResponseDTO("Get call Success", employee);
        return new ResponseEntity(responseDTO,HttpStatus.OK);
    }

    @GetMapping("get/{empId}")
    public ResponseEntity<String> getEmployeePayrollDataById(@PathVariable("empId") int empId){
        Employee employee=null;
        employee=new Employee(1,new EmployeeDTO("Makrand",600000));
        ResponseDTO responseDTO=new ResponseDTO("Get call Success", employee);
        return new ResponseEntity(responseDTO,HttpStatus.OK);
        //return new ResponseEntity("Get call Success for Id : "+empId, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createEmployeeData(@RequestBody EmployeeDTO employeeDTO){
        Employee employee=null;
        employee=new Employee(1,employeeDTO);
        ResponseDTO responseDTO=new ResponseDTO("Create Employee Data", employee);
        return new ResponseEntity(responseDTO,HttpStatus.OK);
       // return new ResponseEntity("create Employee Data"+employeeDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeeData(@RequestBody EmployeeDTO employeeDTO){
        Employee employee=null;
        employee=new Employee(1,employeeDTO);
        ResponseDTO responseDTO=new ResponseDTO("Update Employee Data",employee);
        return new ResponseEntity(responseDTO,HttpStatus.OK);
        //return new ResponseEntity("Update Employee Data"+employeeDTO+" "+ empId,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        Employee employee=null;
        employee=new Employee(1,new EmployeeDTO("Makrand",600000));
        ResponseDTO responseDTO=new ResponseDTO("Delete Employee Data Deleted id"+empId , employee);
        return new ResponseEntity(responseDTO,HttpStatus.OK);
        //return new ResponseEntity("Delete Success for Id : " + empId, HttpStatus.OK);
    }
}
