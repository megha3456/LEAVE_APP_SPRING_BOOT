package com.krishna.leaveApp.Employee;

public class Employee {

	private Integer EmpId;
	private String Name;
	private String FatherName;
	private String Email;
	private String Role;
	private String MobileNo;
	private String Age;
	
	// getter and setter methods
	public Integer getEmpId() {
		return EmpId;
	}
	public void setEmpId(Integer empId) {
		EmpId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	
	
	// default constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// parameterized constructor
	public Employee(Integer empId, String name, String fatherName, String email, String role, String mobileNo,
			String age) {
		super();
		EmpId = empId;
		Name = name;
		FatherName = fatherName;
		Email = email;
		Role = role;
		MobileNo = mobileNo;
		Age = age;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", Name=" + Name + ", FatherName=" + FatherName + ", Email=" + Email
				+ ", Role=" + Role + ", MobileNo=" + MobileNo + ", Age=" + Age + "]";
	}
	
}
