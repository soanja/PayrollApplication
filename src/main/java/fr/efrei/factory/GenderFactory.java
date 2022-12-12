package fr.efrei.factory;

import fr.efrei.domain.Gender;
import fr.efrei.util.Helper;

public class GenderFactory {
    public static Gender createGender(String descriptionGender){

        String id = Helper.generateId();
        if(Helper.isNullOrEmpty(id) || Helper.isNullOrEmpty(descriptionGender) ) {
            return null;
        }

        Gender gender = new Gender.Builder().setIdGender(id).
                setDescriptionGender(descriptionGender).build();

        return gender;
    }

    public static Gender createGender(){
        String id = Helper.generateId();
        if(Helper.isNullOrEmpty(id) ) {
            return null;
        }

        Gender gender = new Gender.Builder().setIdGender(id).build();

        return gender;
    }

}
