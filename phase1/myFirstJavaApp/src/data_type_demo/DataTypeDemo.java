package data_type_demo;

public class DataTypeDemo {

	public static void main(String[] args) {
		/*
		 * data type	size		default Value
		 * --------------------------------------------
		 * byte			1byte			0
		 * short		2bytes			0
		 * int 			4bytes			0
		 * long			8bytes			0
		 * 
		 * 
		 * float		4bytes			0.0000f
		 * double		8bytes			0.0000d(default)
		 * 
		 * char			2bytes			'/u00000'(uni-code char set)
		 * boolean      1 bit           false
		 */
		
		long contact=1234567890L;
		System.out.println("contact = "+contact);
		float percentage=10.77f;
		System.out.println("percentage : "+percentage);
		//Anything in Java we write in ""(double quotes) is considered as String object
		
		/*
		 * Primitive Type Casting
		 * -----------------------
		 * 1)Implicit(taken care by compiler) from smaller type to larger type conversions
		 * 
		 * FYI - all the number family(byte,short,int & long) are considered as smaller than float
		 * 
		 * 2)Explicit Casting(developer should do) conversion of larger type to smaller happens
		 */
		
		int x=100;
		float f=x;//implicit
		System.out.println("f = "+f);
		
		f=88.8888f;
		
		x=(int)f; //explicit
		System.out.println("x = "+x);
		
		char c='G';
		x=c;//implicit
		System.out.println("x = "+x);
		
		x=97;
		c=(char)x;
		System.out.println("c = "+c);
		
		System.out.println(Character.UnicodeBlock.of(905));
		
		char c2='\u0905';
		System.out.println("c2 = "+Character.UnicodeBlock.of(c2));
		System.out.println((char)c2);
		
		x=c2;
		System.out.println("x = "+x);
		
	}

}
