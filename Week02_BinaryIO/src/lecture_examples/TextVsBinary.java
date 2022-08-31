package lecture_examples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextVsBinary {

	public static void main(String[] args) {
		try {
			DataOutputStream fos = new DataOutputStream(new FileOutputStream("src/files/test.dat"));
			
			//00000000 00001011 00101001 01000011 
			//00001010 00110100 01001101 00110111
			
			
//			fos.writeInt(100000);
//			fos.writeUTF("hello world");
			fos.writeLong(3141592654564663L);
			fos.close();
			
			
			DataInputStream fis = new DataInputStream(new FileInputStream("src/files/test.dat"));
			
			System.out.println(fis.readInt());
			//System.out.println(fis.read());
			fis.close();
			
			FileInputStream fis2 = new FileInputStream("src/files/test.dat");
			
			System.out.println(fis2.read());
			System.out.println(fis2.read());
			System.out.println(fis2.read());
			System.out.println(fis2.read());
			System.out.println(fis2.read());
			System.out.println(fis2.read());
			System.out.println(fis2.read());
			System.out.println(fis2.read());
			
			
			
//			PrintWriter pw = new PrintWriter("src/files/test.txt");
//			
//			pw.print("199");
//			pw.close();
//			
//			char ch = '1';
//			
//			System.out.println((int)ch);
//			
//			int ch2 = ch + ch;
//		
//			System.out.println((char)ch2);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
