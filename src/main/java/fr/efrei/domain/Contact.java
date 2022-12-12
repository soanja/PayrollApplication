package fr.efrei.domain;
public class Contact {

    private String cellphoneNumber;
    private String email;
    private String homeNumber;


    //default constructor
    private Contact() {
    }

    //add another constructor later -- KEEP PRIVATE CONSTRUCTORS
    private Contact(Contact.Builder builder){
        this.cellphoneNumber = builder.cellphoneNumber;
        this.email = builder.email;
        this.homeNumber = builder.homeNumber;
    }

    //getters but no setters, to have protected classes. NO SETTERS => IMMUTABILITY
    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "cellphoneNumber='" + cellphoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                '}';
    }

    public static class Builder {
        private String cellphoneNumber;
        private String email;
        private String homeNumber;

        public Builder setcellphoneNumber(String cellphoneNumber) {
            this.cellphoneNumber = cellphoneNumber;
            return this;
        }

        public Builder setemail(String email) {
            this.email = email;
            return this;
        }

        public Builder sethomeNumber(String homeNumber) {
            this.homeNumber = homeNumber;
            return this;
        }

        //copy method



        //build method
        public Contact build() {
            return new Contact(this);
        }


    }

}