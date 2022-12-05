package fr.efrei.repository;

import fr.efrei.domain.Name;
import fr.efrei.domain.Race;

import java.util.List;

public interface iNameRepository extends IRepository<Name, String>  {
    //create, read, update, delete: override these 4 methods

    public List<Name> getAll();

}
