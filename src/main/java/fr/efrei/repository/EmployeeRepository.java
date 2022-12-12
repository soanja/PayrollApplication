package fr.efrei.repository;

import java.util.*;

public class EmployeeRepository IEmployeeRepository{
    private static EmployeeRepository getRepository(){
        if(repository == null)
    }

    @Override
    public Employee read(String employeeNumber){
        //linear search or sequential search

        for (Employee e : employeeDB){
            if(e.getEmployeeNumber().equals)
        }

        //with lambda expression, we either chose the one above or the lambda expression
        employeeDB.stream().filter(e -> e.getEmployeeNumber().equals(employeeNumber)).findAny().orElse(null);
        return employee;
    }



}
