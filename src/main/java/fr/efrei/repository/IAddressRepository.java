package fr.efrei.repository;
import java.util.List;
import fr.efrei.domain.Address;

public interface IAddressRepository extends IRepository<Address, String>{
    public List<Address> getAll();

}