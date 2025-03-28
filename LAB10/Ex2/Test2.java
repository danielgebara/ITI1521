package LAB10.Ex2;

class Test2 {

    public static void main( String[] args ) {

    DoublyLinkedList maList = new DoublyLinkedList();
    if ( maList.size() != 0 )
     System.out.println( "List not empty " );
    for ( int i=1; i<=10; i++ ) { // add 
     maList.add( new Integer( i ) );

     if ( maList.size() != i )
       System.out.println( "size =" + i );
     
 }
    System.out.println( "maList size =" + maList.size() );
    
    }
}