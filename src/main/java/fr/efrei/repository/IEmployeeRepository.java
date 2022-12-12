package fr.efrei.repository;

import fr.efrei.domain.Name;
import fr.efrei.domain.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee, String> {
    public List<Employee> getAll();

}
