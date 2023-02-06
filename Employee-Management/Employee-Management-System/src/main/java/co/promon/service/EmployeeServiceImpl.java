package co.promon.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.promon.dto.EmployeeRequest;
import co.promon.dto.EmployeeResponse;
import co.promon.repo.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService{
	
	private static final Logger log = LoggerFactory
			.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
    private EmployeeRepo employeeRepo;


	@Override
	public EmployeeResponse addEmployee(EmployeeRequest employeeRequest) {
        log.info("Inside EmployeeServiceImpl class addEmployee() method!");
        //employeeRepo.save(employeeRequest);
        EmployeeResponse employeeResponse = employeeRepo.saveAll(employeeRequest);
		return employeeResponse;
    }    
}
