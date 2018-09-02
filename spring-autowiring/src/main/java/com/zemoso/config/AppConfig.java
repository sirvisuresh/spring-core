package com.zemoso.config;

import com.zemoso.model.Employee;
import com.zemoso.service.EmployeeAutowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.zemoso.model")
@Configuration
public class AppConfig {

    @Autowired
    private Employee emp;

    @Bean(name = "employeebean")
    public EmployeeAutowire getEmployeeWireByType()
    {
        return new EmployeeAutowire();
    }


}