package fr.efrei.repository;

import fr.efrei.domain.Address;
import fr.efrei.domain.Employee;
import fr.efrei.domain.Gender;

import java.util.*;

public class EmployeeRepository implements IEmployeeRepository{

    private static List<Employee> employeeDB = null;
    private static EmployeeRepository repository = null;

    private EmployeeRepository(){
        employeeDB = new ArrayList<>();
    }


    public static EmployeeRepository getRepository(){
        if (repository == null){
            return new EmployeeRepository();
        }
        return repository;
    }


    @Override
    public List<Employee> getAll() {
        return employeeDB;
    }

    @Override
    public Employee read(String s) {
        for(Employee employee: employeeDB){
            if (employee.getEmployeeNumber().equals(s)){
                return employee;
            }
        }
        //with lambda expression, we either chose the one above or the lambda expression does the same as above
        //employeeDB.stream().filter(e -> e.getEmployeeNumber().equals(employeeNumber)).findAny().orElse(null);

        return null;
    }


    @Override
    public Employee create(Employee employee) {
        boolean success = employeeDB.add(employee);
        if (success){
            return employee;
        }
        else{
            return null;
        }
    }


    @Override
    public Employee update(Employee employee1, Employee employee2) {
        Employee old = read(employee1.getEmployeeNumber());
        if (employee1 != null){
            employeeDB.remove(old);
            employeeDB.add(employee2);
            return employee2;
        }
        return null;
    }

    @Override
    public boolean delete(String str) {
        Employee employee = read(str);
        if (employee == null){
            return false;
        }
        employeeDB.remove(employee);
        return true;
    }



}
