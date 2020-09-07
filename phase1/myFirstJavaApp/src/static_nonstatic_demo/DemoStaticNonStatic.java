package static_nonstatic_demo;

public class DemoStaticNonStatic {

	int x; // global instance variable
	int y;// global instance variable
	static int z = 9999; // class level variable

	public static void sayHelloStatic() {
		System.out.println("Hello static from DemostaticNonStatic");
	}

	public static void main(String[] args) {

		DemoStaticNonStatic ds1 = new DemoStaticNonStatic();
		ds1.x = 99;
		ds1.y = 55;
		System.out.println("Printing ds1");
		ds1.printXYZ();

		DemoStaticNonStatic ds2 = new DemoStaticNonStatic();
		// ds1.x=99;
		ds2.y = 88;
		System.out.println("\nPrinting ds2");
		ds2.printXYZ();

		z = 7777777;
		System.out.println("\nPrinting ds1 again");
		ds1.printXYZ();

		System.out.println("\nPrinting ds2 again");
		ds2.printXYZ();

		sayHelloStatic();
		Demo2.sayHelloStatic();
		
		System.out.println(Math.PI);
		System.out.println(Long.MAX_VALUE);
	}

	public void printXYZ() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}
}
