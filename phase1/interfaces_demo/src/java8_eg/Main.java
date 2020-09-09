package java8_eg;

public class Main {
public static void main(String[] args) {
	Java8Interface.helloStatic();
	
	Java8Interface i=new Implementor();
	i.helloDefault();
}
}
