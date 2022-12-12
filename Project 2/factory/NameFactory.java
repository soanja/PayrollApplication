package fr.efrei.factory;

import fr.efrei.domain.Name;
import fr.efrei.domain.Race;
import fr.efrei.util.Helper;

public class NameFactory {
    public static Name createName(String firstName, String middleName, String lastName){
        if (Helper.isNullOrEmpty(firstName) ||
                Helper.isNullOrEmpty(middleName) ||
                Helper.isNullOrEmpty(lastName)){
            return null;  //convention so that you couldn't create the object
        }

        Name name = new Name.Builder().setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();
        return name;
    }

    public static Name createName(String firstName, String lastName){ //for Employee with no middle names
        if (Helper.isNullOrEmpty(firstName) ||
                Helper.isNullOrEmpty(lastName)){
            return null;  //convention so that you couldn't create the object
        }

        Name name = new Name.Builder().setFirstName(firstName)
                .setLastName(lastName)
                .build();
        return name;
    }
}
