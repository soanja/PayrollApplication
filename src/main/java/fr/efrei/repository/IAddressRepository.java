package Repository;
import java.util.List;

import domain.Address;

public interface IAddressRepository extends IRepository<Address, String>{
    public List<Address> getAll(); 

    

    public Address create(Address add);
    public Address read(String id);
    public Address update(Address add);
    public boolean delete(String id);
}
