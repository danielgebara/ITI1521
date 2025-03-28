package LAB10.Ex3;

class Test3 {

    public static void main( String[] args ) {

    DoublyLinkedList maList = new DoublyLinkedList();
    if ( maList.size() != 0 )
     System.out.println( "List not empty " );
    
    for ( int i=1; i<=10; i++ ) { // add 
     maList.add( new Integer( i ) );

     if ( maList.size() != i )
       System.out.println( "size = " + i );
    }
    
    maList.add( new Integer( 5 ) );// add
    System.out.println( "maList size = " + maList.size() );
  
    System.out.println( "Elements values of my list are : " );    
 /*print*/
    for ( int i=0; i<=10; i++ ) {
     int m = ( (Integer) maList.get( i ) ).intValue();
     
     System.out.println( " Element at position " +i  +" is " +m );  
     }
 
    }
}
