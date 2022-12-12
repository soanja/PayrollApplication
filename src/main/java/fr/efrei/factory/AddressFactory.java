package factory;


import domain.Address;
import util.Helper;

public class AddressFactory {
    public static Address createAdress(String streetAdress, String postalAdress, String state, String country, String zipCode, int streetnumber, String name){

        String id = Helper.generateID();
        if (Helper.isNullorEmpty(zipCode) || Helper.isNullorEmpty(streetAdress) || Helper.isNullorEmpty(postalAdress) || 
        Helper.isNullorEmpty(state) || Helper.isNullorEmpty(country) || Helper.isNullorEmpty(streetnumber) || Helper.isNullorEmpty(name)){
            return null;
        }


        Address adress = new Address.Builder().setCountry(country).setName(name).setPostalAdress(postalAdress).setState(state).setStreetAdress(streetAdress).setStreetnumber(streetnumber).setZipCode(zipCode).setID(id).build();
        return adress;
    }
}