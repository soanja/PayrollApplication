package fr.efrei.domain;

public class Employee {

    private int employeeNumber;
    //private String employeeNumber;
    private Name employeeName;
    private Gender genderEmployee;
    private Race raceEmployee;

    //private String raceiD;

    private Employee() {}

    //add another constructor later
    private Employee(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.employeeName = builder.employeeName;
        this.genderEmployee = builder.genderEmployee;
        this.raceEmployee = builder.raceEmployee;
    }

    //our getters
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public Name getEmployeeName() {
        return employeeName;
    }

    public Gender getGenderEmployee() {
        return genderEmployee;
    }

    public Race getRaceEmployee() {
        return raceEmployee;
        //return raceId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", employeeName=" + employeeName +
                ", genderEmployee=" + genderEmployee +
                ", raceEmployee=" + raceEmployee +
                '}';
    }


    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {
        private int employeeNumber;
        private Name employeeName;
        private Gender genderEmployee;
        private Race raceEmployee;

        public Builder setEmployeeNumber(int employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this; //return the Builder object
        }

        public Builder setEmployeeName(Name employeeName) {
            this.employeeName = employeeName;
            return this; //return the Builder object
        }

        public Builder setGenderEmployee(Gender genderEmployee) {
            this.genderEmployee = genderEmployee;
            return this; //return the Builder object
        }

        public Builder setRaceEmployee(Race raceEmployee) {
            this.raceEmployee = raceEmployee;
            return this; //return the Builder object
        }

        public Builder copy(Employee employee) {
            this.employeeNumber = employee.employeeNumber;
            this.employeeName = employee.employeeName;
            this.raceEmployee = employee.raceEmployee;
            this.genderEmployee = employee.genderEmployee;
            return this; //return the Builder object
        }

        //build a race object -- like copy constructor in C++
        public Employee build() {
            return new Employee(this);
        }

    }
}
