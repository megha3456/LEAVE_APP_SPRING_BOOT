package com.krishna.leaveApp.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmpDaoService {

	public static int empCount = 5;

	// instance of ArrayList
	private static List<Employee> emp = new ArrayList<>();
	
	static {
		emp.add(new Employee(1, "Krishnaveni", "Govinda Rao", "sunkarikrishna@gmail.com", "Jr.Lecturer", "9966521415", "23"));
		emp.add(new Employee(2, "Megha Kumari", "Shashi Shekhar", "meghajha@gmail.com", "Jr.Lecturer", "1122334455", "24"));
		emp.add(new Employee(3, "Harika", "Prasad Rao", "harika@gmail.com", "Jr.Lecturer", "2484657782", "25"));
		emp.add(new Employee(4, "Pratikhya", "Rama Krishna", "pratikhya@gmail.com", "Jr.Lecturer", "48689524789", "23"));
		emp.add(new Employee(5, "Raj Aryan", "J.N.Prasad", "raj@gmail.com", "Jr.Lecturer", "2587423398", "26"));
	}
	
	// method that retrieve all employees from the list
		public List<Employee> findAll() {
			return emp;
		}
		
		//method that add the employee in the list
		public Employee save(Employee empl) {
			if(empl.getEmpId()==null) {
				empl.setEmpId(++empCount);
			}
			
			emp.add(empl);
			return empl;
		}
		
		// method that find a particular employee from the list
		public Employee findOne(int id) {
			for(Employee empl:emp) {
				if(empl.getEmpId()==id)
					return empl;
			}
			return null;
		}
}
		
