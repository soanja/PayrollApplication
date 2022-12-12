package fr.efrei.factory;

import fr.efrei.domain.*;
import fr.efrei.util.Helper;

public class EmployeeFactory {

    public static Employee createEmployee(Name employeeName, Gender genderEmployee, Race raceEmployee, String jobEmployee
    , Address employeeAddress, Contact employeeContact, Position employeePosition){

        if (Helper.isNullOrEmpty(employeeName.getFirstName())){
            return null;
        }

        if (Helper.isNullOrEmpty(employeeName.getMiddleName())){
            return null;
        }

        if (Helper.isNullOrEmpty(employeeName.getLastName())){
            return null;
        }

        String employeeNumber = Helper.generateId();
        //referring to the BUILDER class inside the Race class
        Employee employee = new Employee.Builder().setEmployeeNumber(employeeNumber)
                .setEmployeeName(employeeName).setGenderEmployee(genderEmployee).setRaceEmployee(raceEmployee).setJobEmployee(jobEmployee).
                setAddressEmployee(employeeAddress).setPositionEmployee(employeePosition).setContactEmployee(employeeContact).build();

        return employee;
    }
}

