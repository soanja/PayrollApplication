package za.cput.factory;

import za.cput.domain.Position;
import za.cput.util.Helper;

public class PositionFactory {
    public static Position createPosition(int positionCode){
        boolean positionFilled = true;

        if (positionCode != 0){
            return null;
        }

        Position position = new Position.Builder().setPositionCode(positionCode) //referring to the BUILDER class inside the Race class
                .setPositionFilled(positionFilled)
                .build();

        return position;
    }

}
