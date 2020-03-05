package Telsko.concepts;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fos = new FileOutputStream("Demo.txt");
		DataOutputStream dos = new DataOutputStream(fos);		
		dos.writeUTF("Kranthi Demo");
		
		
		
		FileInputStream fis = new FileInputStream("Demo.txt");
		DataInputStream dis = new DataInputStream(fis);
		String str= dis.readUTF();
		System.out.println(str);
	}

}
