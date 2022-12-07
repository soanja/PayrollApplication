package fr.efrei.repository;

import fr.efrei.domain.Race;
import fr.efrei.domain.Name;

import java.util.ArrayList;
import java.util.List;

public class NameRepository implements iNameRepository{

    private static NameRepository repository = null;
    private List<Name> nameDB = null;

    private NameRepository() {
        nameDB = new ArrayList<Name>();
    }

    public static NameRepository getRepository() {
        if (repository == null){
            return new NameRepository();
        }
        return repository;
    }


    @Override
    public Name create(Name name) {
        boolean success = nameDB.add(name); //indeed, add method returns a boolean
        if (success){
            return name;
        }
        else {
            return null;
        }
    }


    @Override
    public Name read(String s) {
        for (Name r : nameDB){
            if (r.getLastName().equals(s)){
                return r;
            }
        }
        return null; //return null if we don't find the object in the list
    }

    @Override
    public Name update(Name name) {
        Name oldName = read(name.getLastName());
        if (name != null){
            nameDB.remove(oldName); //take the object away from the data structure
            nameDB.add(name);
            return name;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Name nameToDelete = read(s);
        if (nameToDelete == null) {
            return false;
        }
        nameDB.remove(nameToDelete);
        return true;
    }

    @Override
    public List<Name> getAll() {
        return nameDB;
    }


}
