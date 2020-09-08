package eg1;

public class MobileMain {

	public static void main(String[] args) {
		
		MobileV2 v2=new MobileV2();
		System.out.println("Printing using v2 object");
		v2.calling();
		v2.gaming();
		System.out.println(v2.hashCode());
		System.out.println(v2.getClass());
		v2.messaging();
		v2.socialApps();
		v2.browsing();
		v2.displayMenu();
		
		
		MobileV1 v1=new MobileV2();
		System.out.println("\nPrinting using v1 reference which was created using MobileV2");
		v1.displayMenu();

	}

}
