package fr.efrei.domain;

public class Address {
    private String id;
    private String streetAdress;
    private String postalAdress;
    private String state;
    private String country;
    private String zipCode;
    private int streetnumber;
    private String name;

    private Address(Builder build){
        this.id = id;
        this.streetAdress = build.streetAdress;
        this.postalAdress = build.postalAdress;
        this.state = build.state;
        this.country = build.country;
        this.zipCode = build.zipCode;
        this.streetnumber = build.streetnumber;
        this.name = build.name;
    }





    @Override
    public String toString() {
        return "Adress [streetAdress=" + streetAdress + ", postalAdress=" + postalAdress + ", state=" + state
                + ", country=" + country + ", zipCode=" + zipCode + ", streetnumber=" + streetnumber + ", name=" + name
                + "]";
    }





    public static class Builder{
        private String id;
        private String streetAdress;
        private String postalAdress;
        private String state;
        private String country;
        private String zipCode;
        private int streetnumber;
        private String name;


        public Builder setID(String id){
            this.id = id;
            return this;
        }
        public Builder setStreetAdress(String streetAdress) {
            this.streetAdress = streetAdress;
            return this;
        }
        public Builder setPostalAdress(String postalAdress) {
            this.postalAdress = postalAdress;
            return this;
        }
        public Builder setState(String state) {
            this.state = state;
            return this;
        }
        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }
        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public Builder setStreetnumber(int streetnumber) {
            this.streetnumber = streetnumber;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Address address){
            this.id = address.id;
            this.country = address.country;
            this.name = address.name;
            this.postalAdress = address.postalAdress;
            this.state = address.state;
            this.streetAdress = address.streetAdress;
            this.streetnumber = address.streetnumber;
            this.zipCode = address.zipCode;

            return this;
        }

        public Address build(){
            return new Address(this);
        }


    }



    public String getStreetAdress() {
        return streetAdress;
    }



    public String getPostalAdress() {
        return postalAdress;
    }



    public String getState() {
        return state;
    }



    public String getCountry() {
        return country;
    }



    public String getZipCode() {
        return zipCode;
    }



    public int getStreetnumber() {
        return streetnumber;
    }



    public String getName() {
        return name;
    }





    public String getId() {
        return id;
    }

}