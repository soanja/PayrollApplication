package fr.efrei.views;

import fr.efrei.domain.Employee;
import fr.efrei.domain.Name;
import fr.efrei.domain.Gender;
import fr.efrei.factory.GenderFactory;
import fr.efrei.factory.NameFactory;
import fr.efrei.domain.Race;
import fr.efrei.factory.RaceFactory;
import fr.efrei.repository.GenderRepository;
import fr.efrei.repository.RaceRepository;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        //it is a singleton we can't have new RaceRepository
        RaceRepository repository = RaceRepository.getRepository();

        //we can have update, delete etc.
        System.out.println(repository.getAll());

        //we have to print in a table format w/ titles

        //menu : add, update, delete, show all, search,exit
        new Menu().loadObject();

    }
}
