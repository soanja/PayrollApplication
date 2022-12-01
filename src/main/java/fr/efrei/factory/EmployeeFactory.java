package fr.efrei.factory;

import fr.efrei.domain.Name;
import fr.efrei.domain.Gender;
import fr.efrei.domain.Race;
import fr.efrei.domain.Employee;
import fr.efrei.util.Helper;

public class EmployeeFactory {

    public static Employee createEmployee(int employeeNumber, Name employeeName, Gender genderEmployee, Race raceEmmployee){
        int employeeNumb = Integer.parseInt(Helper.generateId());

        if (Helper.isNullOrEmpty(employeeName.getFirstName())){
            return null;
        }

        if (Helper.isNullOrEmpty(employeeName.getMiddleName())){
            return null;
        }

        if (Helper.isNullOrEmpty(employeeName.getLastName())){
            return null;
        }


        //referring to the BUILDER class inside the Race class
        Employee employee = new Employee.Builder().setEmployeeNumber(employeeNumber)
                .setEmployeeName(employeeName).setGenderEmployee(genderEmployee).setRaceEmployee(raceEmmployee)
                .build();

        return employee;
    }
}
