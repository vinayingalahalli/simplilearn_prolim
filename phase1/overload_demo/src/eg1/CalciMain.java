package eg1;

public class CalciMain {

	public static void main(String[] args) {
	
		Calculator c=new Calculator();
		System.out.println(c.add(99, 99, 99));
		
		
		c.add(12, 333);
		
		c.add(121L, 333);
		
		c.add(121f, 333);
	}

}
