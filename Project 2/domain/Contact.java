public class Contact {

    private String cellphoneNumber;
    private String email;
    private String homeNumber;


    //default constructor
    public Contact() {
    }

    //add another constructor later -- KEEP PRIVATE CONSTRUCTORS
    private Contact(Contact.Builder builder){
        this.cellphoneNumber = builder.cellphoneNumber;
        this.email = builder.email;
        this.homeNumber = builder.homeNumber;
    }

    //getters but no setters, to have protected classes. NO SETTERS => IMMUTABILITY
    public void setcellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public void sethomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
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