package eg1;

public class Implementor  implements MyInterface1,MyInterface2,MyInterface2.Nested{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("m1() from MyInterface1" );
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("m2() from MyInterface1" );
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("m3() from MyInterface1" );
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("m4() from MyInterface1 value of x = "+MyInterface1.x );
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		System.out.println("m5() from MyInterface2");
	}

	@Override
	public void method6() {
		// TODO Auto-generated method stub
		System.out.println("m6() from MyInterface2 value of x = "+MyInterface2.x);	
	}

	@Override
	public void common() {
		// TODO Auto-generated method stub
		System.out.println("Common for both MyInterface1 & MyInterface2");
	}

	@Override
	public void nested1() {
		// TODO Auto-generated method stub
		
	}

}
