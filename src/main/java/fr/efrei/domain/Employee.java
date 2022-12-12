package fr.efrei.domain;


import java.awt.*;

public class Employee {

    private String employeeNumber;
    //private String employeeNumber;
    private Name employeeName;
    private Gender genderEmployee;
    private Race raceEmployee;

    private Address addressEmployee;
    private Position positionEmployee;
    private Contact contactEmployee;

    private String jobEmployee;

    //private String raceiD;

    private Employee() {}

    //add another constructor later
    private Employee(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.employeeName = builder.employeeName;
        this.genderEmployee = builder.genderEmployee;
        this.raceEmployee = builder.raceEmployee;
        this.jobEmployee = builder.jobEmployee;
        this.contactEmployee = builder.contactEmployee;
        this.addressEmployee = builder.addressEmployee;
        this.positionEmployee = builder.positionEmployee;
    }

    //our getters
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public Name getEmployeeName() {
        return employeeName;
    }

    public Gender getGenderEmployee() {
        return genderEmployee;
    }
    public String getJobEmployee() {
        return jobEmployee;
    }

    public Address getAddress() {
        return addressEmployee;
    }

    public Position getPosition() {
        return positionEmployee;
    }

    public Contact getContact() {
        return contactEmployee;
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
                ", jobEmployee=" + jobEmployee +
                '}';
    }


    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {
        private String employeeNumber;
        private Name employeeName;
        private Gender genderEmployee;
        private Race raceEmployee;
        private Address addressEmployee;
        private Position positionEmployee;
        private Contact contactEmployee;

        private String jobEmployee;

        public Builder setEmployeeNumber(String employeeNumber) {
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

        public Builder setJobEmployee(String jobEmployee) {
            this.jobEmployee = jobEmployee;
            return this; //return the Builder object
        }


        public Builder setContactEmployee(Contact contactEmployee) {
            this.contactEmployee = contactEmployee;
            return this; //return the Builder object
        }

        public Builder setAddressEmployee(Address addressEmployee) {
            this.addressEmployee = addressEmployee;
            return this;
        }

        public Builder setPositionEmployee(Position positionEmployee) {
            this.positionEmployee = positionEmployee;
            return this;
        }

        public Builder copy(Employee employee) {
            this.employeeNumber = employee.employeeNumber;
            this.employeeName = employee.employeeName;
            this.raceEmployee = employee.raceEmployee;
            this.genderEmployee = employee.genderEmployee;
            this.jobEmployee = employee.jobEmployee;
            return this; //return the Builder object
        }

        //build a race object -- like copy constructor in C++
        public Employee build() {
            return new Employee(this);
        }

    }
}
