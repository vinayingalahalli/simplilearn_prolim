package constructors_demo;
//Encapsulated Class
//Bean class
//Model Class
//DTO(Data Transfer Object)Class
//VO(Value Object)Class
//POJO(Plain Old Java Object) class
//Hibernate/JPA - Persistent Object Class
public class Laptop {

	/*
	 * Laptop(){
	 * }
	 */
	public Laptop() {
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private String laptopModelName;
	private String manufacturerName;
	private double cost;
	private String laptopType;
	
	public Laptop(String name) {
		System.out.println("Name is "+name);
	}

	public Laptop(int id, String laptopModelName, String manufacturerName) {
		this.id = id; //variable or object shadowing
		this.laptopModelName = laptopModelName;
		this.manufacturerName = manufacturerName;
	}
	
	
	
	
	public Laptop(int id, String laptopModelName, String manufacturerName, double cost, String laptopType) {
		this(id,laptopModelName,manufacturerName);
		this.cost = cost;
		this.laptopType = laptopType;
	}

	public void printLaptopDetails() {
		System.out.println("Id : "+id);
		System.out.println("Model Name : "+laptopModelName);
		System.out.println("Manufacturer : "+manufacturerName);
		System.out.println("Cost : "+cost);
		System.out.println("Laptop Type : "+laptopType);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLaptopModelName() {
		return laptopModelName;
	}

	public void setLaptopModelName(String laptopModelName) {
		this.laptopModelName = laptopModelName;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getLaptopType() {
		return laptopType;
	}

	public void setLaptopType(String laptopType) {
		this.laptopType = laptopType;
	}
	
	
	
	
}
