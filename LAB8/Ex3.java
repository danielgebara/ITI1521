package LAB8;

import java.io.*;
public class Ex3 {
   public static byte getInput()[] throws Exception{
    byte[] buffer = new byte[50];
    System.out.println("Enter some text. ");
    System.in.read(buffer);
    return buffer;
    }

   public static void main(String args[])throws Exception {
	byte input[] = getInput();
	OutputStream myOutFile = new FileOutputStream("C:/ YOUR PATH /write.txt");
	for(int i=0; i<50; i++){
		myOutFile.write(input [i]);
	}
	myOutFile.close();
	int size;
	InputStream myInFile = new FileInputStream ("C:/YOUR PATH/write.txt");
	size = myInFile.available();
	System.out.println("reading contents of file write2.txt�");
	for(int i=0; i<size; i++) {
		System.out.print((char)myInFile.read());
	}
	myInFile.close();
   }
}

