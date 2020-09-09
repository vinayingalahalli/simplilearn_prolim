package bytestream_demo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutByteDemo {

	public static void main(String[] args) {
	
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		
		try {
			fos=new FileOutputStream("bytedemo.txt",true);
			bos=new BufferedOutputStream(fos);
			String message="\nHi I expect this message to be written in the file";
			byte b[]=message.getBytes();
			bos.write(b);
			System.out.println("Message written to file successfullyyyyyy");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				bos.flush();
				bos.close();
				fos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

}
