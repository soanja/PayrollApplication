package fr.efrei.factory;
import fr.efrei.domain.Address;
import fr.efrei.util.Helper;

public class AddressFactory {
    public static Address createAdress(String streetAdress, String postalAdress, String state, String country, String zipCode, int streetnumber, String name){

        String id = Helper.generateId();
        if (Helper.isNullOrEmpty(zipCode) || Helper.isNullOrEmpty(streetAdress) || Helper.isNullOrEmpty(postalAdress) ||
                Helper.isNullOrEmpty(state) || Helper.isNullOrEmpty(country) || Helper.isNullOrEmpty(String.valueOf(streetnumber)) || Helper.isNullOrEmpty(name)){
            return null;
        }


        Address adress = new Address.Builder().setCountry(country).setName(name).setPostalAdress(postalAdress).setState(state).setStreetAdress(streetAdress).setStreetnumber(streetnumber).setZipCode(zipCode).setID(id).build();
        return adress;
    }
}