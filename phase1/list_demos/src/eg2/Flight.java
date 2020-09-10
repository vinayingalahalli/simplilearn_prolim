package eg2;

public class Flight implements Comparable<Flight> {

	private int flightId;
	private String flightName;
	private String airLineName;
	private double cost;
	private float rating;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	

	public Flight(int flightId, String flightName, String airLineName, double cost, float rating) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.airLineName = airLineName;
		this.cost = cost;
		this.rating = rating;
	}


	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getAirLineName() {
		return airLineName;
	}

	public void setAirLineName(String airLineName) {
		this.airLineName = airLineName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", airLineName=" + airLineName
				+ ", cost=" + cost + ", rating=" + rating + "]";
	}


	@Override
	public int compareTo(Flight o) {
		Integer id1=this.flightId;
		Integer id2=o.flightId;
		return id1.compareTo(id2); //if ascending
		//return id2.compareTo(id1); //if descending
	}
	
	
}
