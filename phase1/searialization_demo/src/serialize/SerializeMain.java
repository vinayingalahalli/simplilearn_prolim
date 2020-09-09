package serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.CreditCard;

public class SerializeMain {

	public static void main(String[] args) {
		
		try(FileOutputStream fos=new FileOutputStream("persist.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				){
			CreditCard cc=new CreditCard(1234567890123456L, "Ramesh", "XYZ Bank", 190);
			oos.writeObject(cc);
			System.out.println("Credit card object with details "+cc);
			System.out.println("Serialized Successfullyyyyyyyy");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
