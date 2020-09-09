package java8_eg;

public interface Java8Interface {

	
	public static void helloStatic() {
		System.out.println("Static methods from Java8 Interfaces");
	}
	
	default void helloDefault() {
		System.out.println("Hello default from Java8 Interfaces");
	}
}
