package co.promon.service;

import co.promon.dto.EmployeeRequest;
import co.promon.dto.EmployeeResponse;

public interface EmployeeService {

	// EmployeeResponse addEmployee(EmployeeRequest employeeRequest);

	EmployeeResponse addEmployee(EmployeeRequest request);
	
	
}
