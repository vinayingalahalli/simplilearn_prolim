package eg2;

public class SingleTon {

	private static String obj;
	private SingleTon() {
		obj="hello";
	}
	
	public static String getSingleTon() {
		if(obj == null) {
			new SingleTon();
			return obj;
		}else{
			return obj;
		}
	}
}
