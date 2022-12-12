//package fr.efrei.domain;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    //default constructor
    public Name() {
    }

    //add another constructor later -- KEEP PRIVATE CONSTRUCTORS
    private Name(Name.Builder builder){
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }

    //getters but no setters, to have protected classes. NO SETTERS => IMMUTABILITY
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static class Builder {
        private String firstName;
        private String middleName;
        private String lastName;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        //copy method



        //build method
        public Name build() {
            return new Name(this);
        }


    }
}
