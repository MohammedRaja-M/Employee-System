package co.promon.dto;

import co.promon.enums.Department;
import co.promon.enums.Gender;

public class EmployeeRequest {
	private String firstName;
	private String lastName;
	private String mobileNumber;
    private String emailId;
    private Integer age;
	private Gender gender;
	private Department department;
}
