package fr.efrei.repository;

import fr.efrei.domain.Position;

import java.util.List;

public interface IPositionRepository extends IRepository<Position, String> {

    //create, read, update, delete: override these 4 methods

    public List<Position> getAll();
}