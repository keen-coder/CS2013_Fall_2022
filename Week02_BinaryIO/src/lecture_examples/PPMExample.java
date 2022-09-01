package lecture_examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PPMExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/files/cat.ppm");
		
			fis.skip(17); //DONT DO THIS ON THE HOMEWORK
			
			int red = fis.read();
			int green = fis.read();
			int blue = fis.read();
			
			System.out.println(red);
			System.out.println(green);
			System.out.println(blue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException ex) {
			
		}
	}
}
