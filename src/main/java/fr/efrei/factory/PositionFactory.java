package fr.efrei.factory;


import fr.efrei.domain.Position;
import fr.efrei.util.Helper;

public class PositionFactory {
    public static Position createPosition(String status){
        boolean positionFilled = true;

        String positionCode = Helper.generateId();


        if(Helper.isNullOrEmpty(status)){
            return null;
        }

        Position position = new Position.Builder().setPositionCode(positionCode) //referring to the BUILDER class inside the Race class
                .setPositionFilled(positionFilled).setStatusPosition(status)
                .build();

        return position;
    }

}