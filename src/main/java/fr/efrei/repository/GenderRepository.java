package fr.efrei.repository;

import fr.efrei.domain.Gender;
import fr.efrei.domain.Name;

import java.util.ArrayList;
import java.util.List;

public class GenderRepository implements iGenderRepository{

    private static GenderRepository repository = null;
    private List<Gender> genderDB = null;

    private GenderRepository() {
        genderDB = new ArrayList<Gender>();
    }

    public static GenderRepository getRepository() {
        if (repository == null){
            return new GenderRepository();
        }
        return repository;
    }


    @Override
    public Gender create(Gender gender) {
        boolean success = genderDB.add(gender); //indeed, add method returns a boolean
        if (success){
            return gender;
        }
        else {
            return null;
        }
    }


    @Override
    public Gender read(String s) {
        for (Gender r : genderDB){
            if (String.valueOf(r.getIdGender()).equals(s)){
                return r;
            }
        }
        return null; //return null if we don't find the object in the list
    }

    @Override
    public Gender update(Gender gender) {
        Gender oldGender = read(String.valueOf(gender.getIdGender()));
        if (gender != null){
            genderDB.remove(oldGender); //take the object away from the data structure
            genderDB.add(gender);
            return gender;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Gender genderToDelete = read(s);
        if (genderToDelete == null) {
            return false;
        }
        genderDB.remove(genderToDelete);
        return true;
    }

    @Override
    public List<Gender> getAll() {
        return genderDB;
    }


}
