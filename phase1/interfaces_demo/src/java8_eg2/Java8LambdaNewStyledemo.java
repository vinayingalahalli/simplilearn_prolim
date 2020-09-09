package java8_eg2;

public class Java8LambdaNewStyledemo {

	public static void main(String[] args) {
	
		HelloFunctional h1=()->System.out.println("Hello Lambda for functional");
		h1.hello();
		
		HelloFunctional h2=()->{
			System.out.println("Hello Lambda");
			System.out.println("Hello Lamda mulitline");
		};
		h2.hello();
		
		
		HelloFunctional2  h3=(n)->{
			return "Hellooooo "+n;
		};
		System.out.println(h3.sayHello("Gaurav"));
		
		Add a=(a1,b,c)->{return a1+b+c;};
		System.out.println(a.add(100, 222, 8888));
		
	}

}
