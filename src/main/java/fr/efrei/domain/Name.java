package fr.efrei.domain;

public class Name {
    private String lastName;
    private String middleName;
    private String firstName;

    private Name(){}

    private Name(Builder builder){
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName= builder.lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    public static class Builder{
        private String lastName;
        private String middleName;
        private String firstName;

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        //copy

        //build method
        public Name build(){
            //calls constructor that returns a builder object
            return new Name(this);
        }
    }
}
