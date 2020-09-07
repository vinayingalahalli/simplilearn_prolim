package myPack2;

public class InnerClassesDemo {

	public static void main(String[] args) {
		OuterInnerClass o=new OuterInnerClass();
		o.outerMethod();
		
		
		OuterInnerClass.InnerProtected ip=o.new InnerProtected();
		ip.helloInnerProtectedMethod();
		
		OuterInnerClass.InnerPublic ip2=o.new InnerPublic();
		ip2.helloInnerPublicMethod();
		
		
		OuterInnerClass.InnerStatic.helloInnerPublicStaticMethod();
		
		OuterInnerClass.InnerStatic is=new OuterInnerClass.InnerStatic();
		is.helloInnerPublicNonStaticMethod();
		

	}

}
