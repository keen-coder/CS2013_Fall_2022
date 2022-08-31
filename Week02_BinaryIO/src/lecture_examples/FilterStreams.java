package lecture_examples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilterStreams {

	public static void main(String[] args) {
		try {
			
			
			DataOutputStream dos = new DataOutputStream(
					new FileOutputStream("src/files/filter.dat"));
			
			dos.writeShort(947);
			dos.writeLong(4567876543456764345L);
			dos.close();
			//00000011 10110011  = 947
			//3        179
			DataInputStream dis = new DataInputStream(
					new FileInputStream("src/files/filter.dat"));
			
//			for(int i = 1 ; i <= 10 ; i++) {
//				System.out.println(dis.read());
//			}
			
			
			System.out.println(dis.readLong());
			System.out.println(dis.readShort());
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
