package lecture_examples;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EndOfFile {

	public static void main(String[] args) {

		//Detecting end of file with FileInput/OutputStream
		//look for the -1.
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("src/files/temp.dat");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//		try {
		//			while(true) {
		//				int nextByte = fis.read();
		//
		//				if (nextByte == -1) {
		//					break;
		//				}
		//				
		//				System.out.println(nextByte);
		//
		//			}
		//		}
		//		catch(IOException ex) {
		//
		//		}


		DataInputStream dis = null;
		try {
			dis = new DataInputStream(
					new FileInputStream("src/files/temp.dat"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			while(true) {
				int next2Bytes = dis.readShort();

				if (next2Bytes == -1) {
					System.out.println("found negative one.");
				}

				System.out.println(next2Bytes);
			}
		}
		catch(EOFException ex) {
			System.out.println("End of file detected, exception was caught.");
		}
		catch(IOException ex) {

		}



	}

}
