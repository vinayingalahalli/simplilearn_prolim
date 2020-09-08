package eg2;

public class Main {

	public static void main(String[] args) {
		
		Team t1=new Team(90000, "INDIA", "Ravi Shastri");
		Player p1=new Player(101, "Sachin R Tendulkar", "Cricket", 200, t1);
		System.out.println("Printing p1");
		p1.printPlayer();

		
		Player p2=new Player(102, "Rahul Dravid", "Cricket", 300, t1);
		System.out.println("\nPrinting p2");
		p2.printPlayer();
	}

}
