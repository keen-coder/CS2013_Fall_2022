package lecture_examples;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EndOfFile {

	public static void main(String[] args) {
		
		//fileInputStreamEnd();
		dataInputStreamEnd();

	}
	
	//Shows how to end the file read using -1
	public static void fileInputStreamEnd() {
		try {
			FileInputStream fis = new FileInputStream("src/files/temp.dat");
		
			int nextValue = 0;
			
			while( (nextValue = fis.read()) != -1 ) {
				System.out.println(nextValue);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void dataInputStreamEnd() {
		try {
			DataInputStream dis = new DataInputStream(
					new FileInputStream("src/files/temp.dat"));
		
			try {
				while(true) {
					int nextValue = dis.readInt();
					System.out.println(nextValue);
				}
			}
			catch(EOFException ex) {
				System.out.println("Reached end of file.");
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
