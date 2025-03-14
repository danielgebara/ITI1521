package LAB8;

import java.io.InputStreamReader;
import java.io.IOException;

public class Ex1{
    public static void main( String[] args ) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
     
        System.out.println("Enter somme character: ");
        char[] buffer = new char[256];
        int n = in.read(buffer);
        String s = new String(buffer, 0, n);
        s = s.trim();
        System.out.println("characters read are: " + s);
    }
}
