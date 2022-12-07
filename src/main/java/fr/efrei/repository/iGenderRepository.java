package fr.efrei.repository;

import fr.efrei.domain.Gender;

import java.util.List;

public interface iGenderRepository extends IRepository<Gender, String> {
    //create, read, update, delete: override these 4 methods
    public List<Gender> getAll();
}
