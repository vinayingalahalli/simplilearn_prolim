package eg2;

import java.util.Comparator;

public class FlightAirlineNameComparator implements Comparator<Flight>{

	@Override
	public int compare(Flight o1, Flight o2) {
		
		return o1.getAirLineName().compareTo(o2.getAirLineName());
	}

}
