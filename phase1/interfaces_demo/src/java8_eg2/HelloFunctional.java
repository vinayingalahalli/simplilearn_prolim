package java8_eg2;

@FunctionalInterface   //SAM interfaces
public interface HelloFunctional {

	void hello();
	//void hello2();
	public static void helloStatic() {
		System.out.println("static within functional");
	}
	
	default void heyyDefault() {
		System.out.println("Heyy default from HelloFunctional");
	}
}


//interface Child extends HelloFunctional{
//	void heyy();
//	void heyyyyyy();
//}