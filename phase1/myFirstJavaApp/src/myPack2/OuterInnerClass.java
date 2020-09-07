package myPack2;

public class OuterInnerClass {

	
	public void outerMethod() {
		System.out.println("Hello from Outer method");
		InnerPrivate i=new InnerPrivate();
		i.helloInnerPrivateMethod();
	}
	
	private class InnerPrivate {

		public void helloInnerPrivateMethod() {
			System.out.println("Hello from Private innerclass's public method");
		}
	}

	protected class InnerProtected {
		public void helloInnerProtectedMethod() {
			System.out.println("Hello from protected innerclass's public method");
		}
	}

	public class InnerPublic {

		public void helloInnerPublicMethod() {
			System.out.println("Hello from public innerclass's public method");
		}
	}

	public static class InnerStatic {

		public void helloInnerPublicNonStaticMethod() {
			System.out.println("Hello from public inner static class's public non static method");
		}
		
		public static void helloInnerPublicStaticMethod() {
			System.out.println("Hello from public inner static class's public & static method");
		}
	}
}
