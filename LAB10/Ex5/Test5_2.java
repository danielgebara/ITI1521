package LAB10.Ex5;

class Test5_2 {

    public static void main( String[] args ) {

        DoublyLinkedList maList = new DoublyLinkedList();
        if ( maList.size() != 0 )
         System.out.println( "List not empty " );
    
        for ( int i=1; i<=10; i++ ) { // add 
            maList.add( new Integer( i ) );

        if ( maList.size() != i )
         System.out.println( "size # " + i );
        }


        System.out.println( "Elements values of my list are : " );    
 /*print*/
        for ( int i=0; i<10; i++ ) {
        int m = ( (Integer) maList.get( i ) ).intValue();
          
        System.out.println( " Element at position " +i  +" is " +m ); 
        }
        System.out.println( "add tested " );



/*remove*/
        for ( int i=0; i<10 && maList.size() > 0; i++ ) {
            int m = ( (Integer)  maList.get( 0 ) ).intValue();
            maList.remove( 0 );
        }
  
        System.out.println( "size is " + maList.size());
        System.out.println( "remove tested!" );
   
   
 /*add */
    for ( int i=10; i>=1; i--  ) { // add 
        maList.add( new Integer( i ) );

        if ( maList.size() != 10 - i + 1 )
        System.out.println( "size # " + i );
    }
 
 /**merge**/
    DoublyLinkedList maList2 = new DoublyLinkedList();

        for ( int i=1; i<10; i=i+2 ) {
            maList2.add( new Integer( i ) );
        }

        maList.merge( maList2);
     
        System.out.println("===========================================");
        System.out.println("after merging, elements are : ");
        for ( int i=0; i<15; i++ ) {
            int m = ( (Integer) maList.get( i ) ).intValue();
      
                System.out.println(m);
     
        }
        System.out.println( "merge tested!" );
    }
}
