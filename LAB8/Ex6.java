package LAB8;

import java.io.*;

public class Ex6{
        public static void main(String [] args)    {
		try {
     		// Cr�ation du flot de lecture par octet
     		InputStream is = new FileInputStream("C:/ YOUR PATH /write.txt"); 
     		// Cr�ation du flot de lecture par caract�res
            InputStreamReader reader = new InputStreamReader(is);
            int c;
            System.out.println("Les caractères de votre fichier write.txt en majuscule sont :");
            while ((c = reader.read()) != -1) {
                System.out.print(Character.toUpperCase((char)c));
            }
            reader.close();
 		}
 		catch(IOException e) {
     			System.err.println("Error : " + e.getMessage());
      		}
   	}
}
