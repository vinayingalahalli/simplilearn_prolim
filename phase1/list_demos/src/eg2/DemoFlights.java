package eg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoFlights {

	public static void main(String[] args) {
		List<Flight> flightList = new ArrayList<>();
		flightList.add(new Flight(100, "F002", "ABC Airlines", 1200.22, 3.5f));
		flightList.add(new Flight(120, "F200", "XYZ Airlines", 1200.22, 4.5f));
		flightList.add(new Flight(110, "Q202", "PQR Airlines", 1200.22, 1.5f));
		flightList.add(new Flight(109, "P002", "XYZ Airlines", 1100.22, 4.9f));
		flightList.add(new Flight(101, "M002", "ABC Airlines", 900.22, 2.5f));
		flightList.add(new Flight(104, "F004", "ABC Airlines", 1100.22, 5.0f));
		
		System.out.println("Printing all the Flights......");
		printAllFlights(flightList);
		
		Collections.sort(flightList);
		System.out.println("\nPrinting all the Flights sorted by ID......");
		printAllFlights(flightList);
		
		Collections.sort(flightList,new FlightAirlineNameComparator());
		System.out.println("\nPrinting all the Flights sorted by AirlineName......");
		printAllFlights(flightList);
		
		Collections.sort(flightList,(Flight f1,Flight f2)->{
			Double d1=f1.getCost();
			Double d2=f2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\nPrinting all the Flights sorted by Cost(lowest-to-highest)......");
		printAllFlights(flightList);
		
		Collections.sort(flightList,( f1, f2)->{
			Double d1=f1.getCost();
			Double d2=f2.getCost();
			int x= d1.compareTo(d2);
			if(x==0) {
				Float r1=f1.getRating();
				Float r2=f2.getRating();
				x=r2.compareTo(r1);
			}
			return x;
		});
		System.out.println("\nPrinting all the Flights sorted by Cost(lowest-to-highest)......");
		System.out.println("Note if 2 flights have same cost then the flight with highest rating will be displayed first follwed by rest");
		printAllFlights(flightList);
		

	}
	public static void printAllFlights(List<Flight> flightList) {
		for (int i = 0; i < flightList.size(); i++) {
			System.out.println(flightList.get(i));
		}
	}

}
