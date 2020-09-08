package eg1;

public class Calculator {

	
	public void add(int a,int b) {
		System.out.println("void(int,int) is called result is "+(a+b));
	}
	
	public int add(int a,int b,int c) {
		System.out.println("int(int,int,int) called");
		return a+b+c;
	}
	
	public void add(long a,long b) {
		System.out.println("void(long,long) is called result is "+(a+b));
	}
	
	public void add(float a,float b) {
		System.out.println("void(float,float) is called result is "+(a+b));
	}
}
