package eg;

public class Main {

	public static void main(String[] args) {
		System.out.println("Accessing EMS Requirements using SimplilearnEMS");
		EMS ems=new SimplilearnEMS();
		ems.addEmployee();
		ems.calculateEmployeeSalary();
		ems.updateEmployee();
		ems.getEmployee();
		ems.commonEmployeeBenifits();
		ems.deleteEmployee();
		
		System.out.println("\n\nAccessing EMS Requirements using ProlimEMS");
		EMS ems1=new ProlimEMS();
		ems1.addEmployee();
		ems1.calculateEmployeeSalary();
		ems1.updateEmployee();
		ems1.getEmployee();
		ems1.commonEmployeeBenifits();
		ems1.deleteEmployee();
	}

}
