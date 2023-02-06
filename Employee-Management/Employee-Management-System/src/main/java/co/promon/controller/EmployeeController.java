package co.promon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.promon.dto.EmployeeRequest;
import co.promon.dto.EmployeeResponse;
import co.promon.service.EmployeeService;
import co.promon.service.EmployeeServiceImpl;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private static final Logger log = LoggerFactory
			.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	private EmployeeService employeeservice;
	
	@PostMapping("/add")
    public EmployeeResponse addEmployee(@RequestBody EmployeeRequest request) {
        log.info("[Request] : {}", request);
       // ResponseDTO responseDTO = new ResponseDTO("Employee is Added!",
                EmployeeResponse responseDTO = employeeservice.addEmployee(request);
        return responseDTO;
    }
}
