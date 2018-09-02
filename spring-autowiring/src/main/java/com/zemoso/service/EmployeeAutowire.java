package com.zemoso.service;

import com.zemoso.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;


public class EmployeeAutowire {

    @Autowired
    private Employee employee;

    @Autowired
    public void setEmployee(Employee emp){
        this.employee=emp;
    }
    public Employee getEmployee(){
        return this.employee;
    }

    public void setName(String str)
    {
        this.employee.setName(str);
    }

}
