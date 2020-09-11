package eg2;

import java.util.Set;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		//Set<Flight> flightList = new HashSet<>();
		//Set<Flight> flightList = new LinkedHashSet<>();
		Set<Flight> flightList = new TreeSet<>();
		flightList.add(new Flight(100, "F002", "ABC Airlines", 1200.22, 3.5f));
		flightList.add(new Flight(120, "F200", "XYZ Airlines", 1200.22, 4.5f));
		flightList.add(new Flight(110, "Q202", "PQR Airlines", 1200.22, 1.5f));
		flightList.add(new Flight(109, "P002", "XYZ Airlines", 1100.22, 4.9f));
		flightList.add(new Flight(101, "M002", "ABC Airlines", 900.22, 2.5f));
		flightList.add(new Flight(104, "F004", "ABC Airlines", 1100.22, 5.0f));
		flightList.add(new Flight(104, "F004", "ABC Airlines", 1100.22, 5.0f));
		flightList.add(new Flight(110, "Q202", "PQR Airlines", 1200.22, 1.5f));
		flightList.add(new Flight(120, "F200", "XYZ Airlines", 1200.22, 4.5f));
		flightList.add(new Flight(108, "F201", "XYZ Airlines", 1500.22, 4.9f));
		flightList.add(new Flight(120, "F200", "XYZ Airlines", 1200.22, 4.5f));
		
		System.out.println("Printing all the Flights......");
		printAllFlights(flightList);

	}
	public static void printAllFlights(Set<Flight> flightList) {
		for(Flight f:flightList) {
			System.out.println(f);
		}
	}


}
