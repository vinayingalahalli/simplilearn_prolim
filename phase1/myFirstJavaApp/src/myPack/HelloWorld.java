package myPack;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World......");
		HelloWorld h1=new HelloWorld();
		HelloWorld h2=new HelloWorld();
	}
	
	static {
		System.out.println("hello static ");
	}
	
	{
		System.out.println("hello Instance level");
	}
	
	private class InnerPrivate{
		
	}
	
	protected class InnerProtected{
		
	}
	
	public class InnerPublic{
		
	}
	
	public static class InnerStatic{
		
	}

}


 class A{
	
}
 
 class B{
	 
 }
 class Z{
	 
 }