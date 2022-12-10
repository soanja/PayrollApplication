package fr.efrei.repository;

import fr.efrei.domain.Contact;

import java.util.List;

public interface IContactRepository extends IRepository<Contact, String> {
    //create, read, update, delete: override these 4 methods

    public List<Contact> getAll();
}
