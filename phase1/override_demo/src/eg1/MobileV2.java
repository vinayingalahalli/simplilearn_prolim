package eg1;

public class MobileV2 extends MobileV1 {

	public void gaming() {
		System.out.println("Gaming feature from MobileV2");
	}
	
	public void browsing() {
		System.out.println("Browsing feature from MobileV2");
	}
	
	public void socialApps() {
		System.out.println("Social N/Wing from MobileV2");
	}
	
	@Override
	protected void displayMenu() {
		System.out.println("Menu in MobileV2 is updated to GRID view");
		System.out.println("Calling v1's dispalyMenu");
		super.displayMenu();
	}
}
