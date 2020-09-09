package charstream_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharDemo {

	public static void main(String[] args) {
		
		
		try(FileWriter fw=new FileWriter("chardemo.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				){
			bw.write("heyy hii this message will be in first line");
			bw.newLine();
			bw.write("I willl be in line 2");
			bw.newLine();
			bw.write("while using char stream did you observe that there is no need of conversions?");
			System.out.println("Messae written to stream successfullyyyyyy");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
