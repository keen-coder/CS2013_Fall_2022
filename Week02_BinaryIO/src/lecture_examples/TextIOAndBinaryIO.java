package lecture_examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextIOAndBinaryIO {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("src/files/test.dat");
		
			fos.write(947);
			fos.close();
			
			FileInputStream fis = new FileInputStream("src/files/test.dat");
			int data = fis.read();
			
			System.out.println(data);
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		//00000011 10110011  = 947
		//3        179
		
//		try {
//			PrintWriter pw = new PrintWriter("src/files/test.txt");
//		
//			pw.print("199");
//			pw.close();
//		
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}
}
