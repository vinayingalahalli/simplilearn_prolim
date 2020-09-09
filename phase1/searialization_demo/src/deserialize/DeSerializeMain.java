package deserialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.CreditCard;

public class DeSerializeMain {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis=new FileInputStream("persist.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				){
			CreditCard cc=(CreditCard) ois.readObject();
			System.out.println("Object deserialized successfully.. Data of cc is....");
			System.out.println(cc);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
