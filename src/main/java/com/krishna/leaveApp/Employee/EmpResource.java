package com.krishna.leaveApp.Employee;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(EmpResource.BASE_URI)
public class EmpResource {

	@Autowired
	private EmpDaoService service;

	public static final String BASE_URI = "restfulboot/leaveApp/k1/emps";

	@GetMapping("/emp")
	public List<Employee> retrieveAllEmployees() {
		return service.findAll();
	}

	// Exception Handling
	@GetMapping("/emp/{id}")
	public Employee retrieveEmp(@PathVariable int id) {
		Employee emp = service.findOne(id);
		if (emp == null)
			throw new EmpNotFoundException("id: " + id);
		return emp;
	}

	@RequestMapping(value = "/empInsert/{id}", method = RequestMethod.PUT)
	public boolean insertEmp(@PathVariable final int id, @RequestBody Employee empl) {
		System.out.println("id: " + empl.getEmpId() + " Name: " + empl.getName());
		return true;
	}

	@RequestMapping(value = "/empDelete/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean deleteContact(@PathVariable final int id, @RequestBody Employee empl) {
		System.out.println("id: " + empl.getEmpId() + " Name: " + empl.getName());
		return true;
	}

//	@RequestMapping(value = "/empUpdate/{id}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Boolean> updateContact(@PathVariable final int id, @RequestBody Employee employee) {
//		System.out.println("id: " + employee.getEmpId() + "Name: " + employee.getName());
//		// here logic for check data present
//
//			for (Employee empl : emp) {
//				if (employee.contains(id))
//					return new ResponseEntity<Boolean>(true, HttpStatus.OK);
//				// delete if it found
//				return new ResponseEntity<Boolean>(false, HttpStatus.NOT_FOUND);
//
//			}
//	}

	@RequestMapping(value = "/searchContact/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> searchContact(@PathVariable final int id) {
		HttpHeaders header = new HttpHeaders();
		if (id<=5) {
			Employee emp = null;	
			emp.getEmpId();
			emp.getName();
			header.add("Found", "Found Record");
			return new ResponseEntity<Employee>(emp, header, HttpStatus.OK);
		}

		header.add("Found", "Record Not Found");
		return new ResponseEntity<Employee>(header, HttpStatus.NOT_FOUND);
	}
}
