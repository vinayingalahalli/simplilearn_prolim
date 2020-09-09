package java8_eg2;

public class OldStyle implements HelloFunctional {

	public static void main(String[] args) {
	
		HelloFunctional h1=new OldStyle();
		h1.hello();
		
		HelloFunctional h2=new HelloFunctional() {
			
			@Override
			public void hello() {
			System.out.println("hello again from old style");
				
			}
		};
		h2.hello();

	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello old style");
	}

}
