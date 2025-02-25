package LAB6.Ex1;

class Test {
    public static void main( String[] args ) {

        Set s1, s2, s3 ;
        s1 = new Set ( 1 , 2 , 3 ) ;
        s2 = new Set (1 , 2 , 3 ) ;
        s3 = new Set (3 , 2 , 1 ) ;
       
         System.out.println ( s1 ) ;
        
         System.out.println ( s1.equals(s2) ) ;
         System.out.println ( s1.equals(s3) ) ;
        
      }

}
