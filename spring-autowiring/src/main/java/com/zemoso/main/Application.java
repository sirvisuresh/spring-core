package com.zemoso.main;

import com.zemoso.config.AppConfig;
import com.zemoso.service.EmployeeAutowire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeAutowire employeeAutowire = ctx.getBean("employeebean", EmployeeAutowire.class);
        employeeAutowire.setName("Suresh Choudhary");
        System.out.println("Employee Name=" + employeeAutowire.getEmployee().getName());

    }

}
