package fr.efrei.domain;

public class Gender {
    private String idGender;
    private String descriptionGender;

    private Gender(){}

    private Gender(Gender.Builder builder){
        this.idGender = builder.idGender;
        this.descriptionGender = builder.descriptionGender;
    }

    public String getIdGender() {
        return idGender;
    }

    public String getDescriptionGender() {
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
        private String idGender;
        private String descriptionGender;

        public Gender.Builder setIdGender(String idGender) {
            this.idGender = idGender;
            return this;
        }

        public Gender.Builder setDescriptionGender(String descriptionGender) {
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
