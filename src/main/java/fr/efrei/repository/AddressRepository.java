package Repository;

import java.util.List;
import java.util.ArrayList;
import domain.Address;

public class AddressRepository implements IAddressRepository{
    private static AddressRepository repository = null;
    private List<Address> AddressDB = null;
    
    private AddressRepository(){
        AddressDB = new ArrayList<>();
    }

    public static AddressRepository getRepository(){
        if (repository == null){
            return new AddressRepository();
        }
        return repository;
    }

    @Override
    public List<Address> getAll() {
        return AddressDB;
    }

    @Override
    public Address create(Address add) {
        boolean success = AddressDB.add(add);
        if (success){
            return add;
        }
        else{
            return null;
        }
    }

    @Override
    public Address read(String s) {
        for(Address add: AddressDB){
            if (add.getId().equals(s)){
                return add;
            }
        }
        return null;
    }

    @Override
    public Address update(Address add) {
        Address old = read(add.getId());
        if (add != null){
            AddressDB.remove(old);
            AddressDB.add(add);
            return add;
        }
        return null;
    }

    @Override
    public boolean delete(String str) {
        Address address = read(str);
        if (address == null){
            return false;
        }
        AddressDB.remove(address);
        return true;
    }

    
}
