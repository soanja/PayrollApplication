package fr.efrei.factory;

import fr.efrei.domain.Contact;
import fr.efrei.domain.Race;
import fr.efrei.util.Helper;

public class ContactFactory {


    public static Contact createContact(String cellphoneNumber, String email, String homeNumber){
        if (Helper.isNullOrEmpty(cellphoneNumber) ||
                Helper.isNullOrEmpty(email) ||
                Helper.isNullOrEmpty(homeNumber)){
            return null;  //convention so that you couldn't create the object
        }

        Contact contact = new Contact.Builder().setcellphoneNumber(cellphoneNumber)
                .setemail(email)
                .sethomeNumber(homeNumber)
                .build();
        return contact;
    }

    public static Contact createContact(String cellphoneNumber, String homeNumber){ //for Employee with no middle Contacts
        if (Helper.isNullOrEmpty(cellphoneNumber) ||
                Helper.isNullOrEmpty(homeNumber)){
            return null;  //convention so that you couldn't create the object
        }

        Contact contact = new Contact.Builder().setcellphoneNumber(cellphoneNumber)
                .sethomeNumber(lastContact)
                .build();
        return contact;
    }
}
