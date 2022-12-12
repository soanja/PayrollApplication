package fr.efrei.repository;

import fr.efrei.domain.Position;

import java.util.ArrayList;
import java.util.List;

public class PositionRepository implements IPositionRepository {

    private static PositionRepository repository = null;
    private List<Position> positionDB = null;

    private PositionRepository() {
        positionDB = new ArrayList<Position>();
    }

    public static PositionRepository getRepository() {
        if (repository == null){
            return new PositionRepository();
        }
        return repository;
    }


    @Override
    public Position create(Position position) {
        boolean success = positionDB.add(position); //indeed, add method returns a boolean
        if (success){
            return position;
        }
        else {
            return null;
        }
    }


    @Override
    public Position read(String s) {
        for (Position p : positionDB){
            if (p.getPositionCode().equals(s)){
                return p;
            }

        }
        return null; //return null if we don't find the object in the list
    }

    @Override
    public Position update(Position position1, Position position2) {
        Position oldPosition = read(position1.getPositionCode());
        if (position1 != null){
            positionDB.remove(oldPosition); //take the object away from the data structure
            positionDB.add(position2);
            return position2;
        }
        return null;
    }


    @Override
    public boolean delete(String s) {
        Position positionToDelete = read(s);
        if (positionToDelete == null) {
            return false;
        }
        positionDB.remove(positionToDelete);
        return true;
    }

    @Override
    public List<Position> getAll() {
        return positionDB;
    }

}