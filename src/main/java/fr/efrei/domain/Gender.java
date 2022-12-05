package fr.efrei.domain;

public class Gender {
    private int idGender;
    private String descriptionGender;

    private Gender(){}

    private Gender(Gender.Builder builder){
        this.idGender = builder.idGender;
        this.descriptionGender = builder.descriptionGender;
    }

    public int getLastName() {
        return idGender;
    }

    public String getMiddleName() {
        return descriptionGender;
    }


    @Override
    public String toString() {
        return "Gender{" +
                "id Gender='" + idGender + '\'' +
                ", description gender='" + descriptionGender + '\'' +
                '}';
    }

    public static class Builder{
        private int idGender;
        private String descriptionGender;

        public Gender.Builder setLastName(int idGender) {
            this.idGender = idGender;
            return this;
        }

        public Gender.Builder setMiddleName(String descriptionGender) {
            this.descriptionGender = descriptionGender;
            return this;
        }


        //copy

        //build method
        public Gender build(){
            //calls constructor that returns a builder object
            return new Gender(this);
        }
    }






}
