package book_examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class TestFileStream {
	private static final String FILE_PATH = "src/files/"; 
	
	
	
	public static void main(String[] args) throws IOException {
		
		Random rand = new Random();
		
		FileOutputStream output = new FileOutputStream(new File(FILE_PATH + "temp.dat"));

		for (int i = 1; i <= 1000000; i++) {
			output.write(rand.nextInt(256));
		}
			
		output.close();
		
		FileInputStream input = new FileInputStream(FILE_PATH + "temp.dat");

		int value;
		
		while ( (value = input.read() ) != -1) {
			System.out.println(value + " ");
		}
		
		input.close();
	}
}








