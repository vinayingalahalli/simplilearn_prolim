package eg1;

public class Main {

	public static void main(String[] args) {
		MyInterface1 m1=new Implementor();
		System.out.println("Accessing MyInterface1 methods with Implementor");
		m1.method1();
		m1.common();
		m1.method2();
		m1.method3();
		m1.method4();
		
		System.out.println("\n\nAccessing MyInterface2 methods with Implementor");
		MyInterface2 m2=new Implementor();
		m2.common();
		m2.method5();
		m2.method6();
		
		MyInterface2.Nested n=new Implementor();
		n.nested1();

	}

}
