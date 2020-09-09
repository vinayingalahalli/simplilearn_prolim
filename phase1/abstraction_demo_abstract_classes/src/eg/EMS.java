package eg;

public abstract class EMS {
	
	public abstract void addEmployee();
	public abstract void updateEmployee();
	public abstract void deleteEmployee();
	public abstract void getEmployee();
	public abstract void calculateEmployeeSalary();
	
	public void commonEmployeeBenifits() {
		System.out.println("These are benifits commonly applicable to any employee in the world...");
	}

}
