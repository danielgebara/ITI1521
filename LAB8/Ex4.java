package LAB8;

import java.io.*;
public class Ex4
{  
public static void main(String [] args) throws IOException, FileNotFoundException  {
InputStreamReader input = null;
try {
input = new InputStreamReader( new FileInputStream("data.txt"));
//ou: input = new InputStreamReader ("C:/YOUR PATH/write.txt");
int c;
     while ((c = input.read()) != -1) {
        System.out.print((char)c);
    }
}

catch(FileNotFoundException e) {
    System.out.println("exception generated : " + e);
}

finally {
if ( input != null )
input.close();
System.out.println();
System.out.println("Inside finally");
}
}
}