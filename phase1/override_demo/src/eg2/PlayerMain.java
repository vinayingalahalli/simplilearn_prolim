package eg2;

public class PlayerMain {

	public static void main(String[] args) {
	
		Player p1=new Player(100, "Sachin");
		System.out.println(p1);
		//System.out.println(p1.toString());
		
		
		Player p2=new Player(101, "Sourav");
		System.out.println(p2);
				
		
		
		Player p3=new Player(102,"Rahul");
		System.out.println("p3 = "+p3);
		

		Player p4=new Player(103,"Rahul");
		System.out.println("p4 = "+p4);
		
		if(p3.equals(p4)) {
			System.out.println("p3 and p4 are same");
		}else {
			System.out.println("p3 and p4 are different");
		}
		
		
	}

}
