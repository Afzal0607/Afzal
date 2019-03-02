package main;

public class EmployeeDetails {
	int id;
    String  firstname;
	String  lastname;
	float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public EmployeeDetails(int id, String firstname, String lastname, int salary) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	
	
	
	
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary="
				+ salary + "]";
	}
	public static void main(String args[]) {
		EmployeeDetails employeeDetails = new EmployeeDetails(1315350, "Afzal", "Mohammed", 4500);
		System.out.println(employeeDetails);
		float sal = employeeDetails.getSalary();
		float increment = (4500*2)/100;
		
		float salaryIncrement = sal+increment;
		employeeDetails.setSalary(salaryIncrement);
		
		System.out.println(employeeDetails);
	}
	

}
