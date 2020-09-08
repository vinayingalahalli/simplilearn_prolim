package eg2;

public class SingleTonMain {

	public static void main(String[] args) {
		String s1 = SingleTon.getSingleTon();
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		String s2 = SingleTon.getSingleTon();
		System.out.println(s2);
		System.out.println(s2.hashCode());
	}

}
