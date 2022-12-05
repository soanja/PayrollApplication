package fr.efrei.views;

import fr.efrei.domain.Name;
import fr.efrei.factory.NameFactory;
import fr.efrei.domain.Race;
import fr.efrei.factory.RaceFactory;
import fr.efrei.repository.RaceRepository;

import java.util.NoSuchElementException;

public class Main {

    //populate, load, init
    public static void loadObject(){
        //the constructor is private, so we can't access therefore we access the Factory

        Name name1 = NameFactory.createName("Sam", "Pondevie");
        Name name2 = NameFactory.createName("Emma", "Simone","Deste");
        Name error = NameFactory.createName("Kruben", "Naidoo");

        Race race1 = RaceFactory.createRace("Indian");
        Race race2 = RaceFactory.createRace("Asian");
        Race race3 = RaceFactory.createRace("SpaceMan");

    }


    public static void main(String[] args) {

        //it is a singleton we can't have new RaceRepository
        RaceRepository repository = RaceRepository.getRepository();

        //we can have update, delete etc.
        System.out.println(repository.getAll());

    }
}
