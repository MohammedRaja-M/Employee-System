package co.promon.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import co.promon.dto.EmployeeRequest;
import co.promon.dto.EmployeeResponse;
import co.promon.entity.Employee;


public interface EmployeeRepo extends JpaRepository<Employee , Integer> {

	EmployeeResponse saveAll(EmployeeRequest employeeRequest);

	//EmployeeResponse save(EmployeeRequest employeeRequest);

}
