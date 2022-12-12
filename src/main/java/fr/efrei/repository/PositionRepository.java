package za.cput.repository;

import za.cput.domain.Position;

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
    public Position read(int s) {
        for (Position p : positionDB){
            if (p.getPositionCode() == s){
                return p;
            }

        }
        return null; //return null if we don't find the object in the list
    }

    @Override
    public Position update(Position position) {
        Position oldPosition = read(position.getPositionCode());
        if (position != null){
            positionDB.remove(oldPosition); //take the object away from the data structure
            positionDB.add(position);
            return position;
        }
        return null;
    }

    @Override
    public boolean delete(int s) {
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
