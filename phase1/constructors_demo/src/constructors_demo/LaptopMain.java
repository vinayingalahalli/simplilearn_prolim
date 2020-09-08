package constructors_demo;

public class LaptopMain {

	public static void main(String[] args) {
		
	//	Laptop l1=new Laptop();
		
		Laptop l2=new Laptop("HP");
		
		Laptop l3=new Laptop(1001, "G0002", "ABC Man");
		System.out.println("Printing l3");
		l3.printLaptopDetails();
		
		Laptop l4=new Laptop(1002, "G009", "XYZ Computers", 15000, "Used");
		System.out.println("\nPrinting l4");
		l4.printLaptopDetails();
		
		l3.setLaptopType("New");
		l3.setCost(30000.99);
		
		System.out.println("\nPrinting l3 again");
		l3.printLaptopDetails();
		
	}

}
