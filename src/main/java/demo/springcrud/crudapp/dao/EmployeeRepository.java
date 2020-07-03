package demo.springcrud.crudapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.springcrud.crudapp.entity.Employee;

//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// No need for any code
}
