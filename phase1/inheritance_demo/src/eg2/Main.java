package eg2;

public class Main {

	public static void main(String[] args) {
		
		Team t1=new Team(90000, "INDIA", "Ravi Shastri");
		Player p1=new Player(101, "Sachin R Tendulkar", "Cricket", 200, t1);
		//System.out.println("Printing p1");
		//p1.printPlayer();
		
		printAnyObject(p1);
		
		Player p2=new Player(102, "Rahul Dravid", "Cricket", 300, t1);
		//System.out.println("\nPrinting p2");
		//p2.printPlayer();
		printAnyObject(p2);
		
		Employee e=new Employee();
		printAnyObject(e);
		
		Person per=new Person();
		printAnyObject(per);
		
		Object o=new Object();
		printAnyObject(o);
		
		printAnyObject(t1);
		
		//Person p=(Person)o; Not Casting results into ClassCastException
		
		Object o2=new Player(); //o2 is reference variable
		System.out.println(o2.getClass());
		Person per1=(Person)o2; //per1 is also ref var
		per1.setName("test PER Name");
		System.out.println(per1.getName());
		Player p4=(Player) per1; //p4 is obj since he gets to access everything of that address
		System.out.println(p4.getName());
		
		
		
		
		
	}
	
	
	public static void printAnyObject(Object o) {
		
		if(o instanceof Employee) {
			Employee e=(Employee)o;
			e.printEmployeee();
		}else if(o instanceof Player) {
			Player p=(Player)o;
			p.printPlayer();
		}else if(o instanceof Team) {
			Team t=(Team)o;
			t.printTeam();
		}else {
			System.out.println("You might be java.lang.Object or "+o.getClass());
		}
		
	}

}
