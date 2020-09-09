package bytestream_demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInByteDemo {
	public static void main(String[] args) {
		
		try(FileInputStream fis=new FileInputStream("bytedemo.txt");
				BufferedInputStream bis=new BufferedInputStream(fis);
				){
			StringBuilder sb=new StringBuilder();
			while(bis.available()!=0) {
				sb.append((char)bis.read());
			}
			System.out.println("Message read from file successfully and the message is");
			System.out.println(sb);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
