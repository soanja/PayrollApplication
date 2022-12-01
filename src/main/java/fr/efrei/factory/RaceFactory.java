package fr.efrei.factory;

import fr.efrei.domain.Name;
import fr.efrei.domain.Race;
import fr.efrei.util.Helper;

public class RaceFactory {

    public static Race createRace(String description){
        String id = Helper.generateId();

        if (Helper.isNullOrEmpty(description)){
            return null;
        }

        Race race = new Race.Builder().setId(id) //referring to the BUILDER class inside the Race class
                .setDescription(description)
                .build();

        return race;
    }


}
