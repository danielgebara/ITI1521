package LAB10.Ex5;

class Test5 {

    public static void main( String[] args ) {

        DoublyLinkedList maList = new DoublyLinkedList();
        if ( maList.size() != 0 )
        System.out.println( "List not empty " );
    
    // add 
        maList.add( new String( "C") );
        maList.add( new String( "E") );
        maList.add( new String( "H") );
    
       System.out.println("maList size is " + maList.size() );
 

 /*print*/
    System.out.println( " elements of my first list are : " );
    for ( int i=0; i<3; i++ ) {
        String str = (String)  maList.get( i ) ;        
         System.out.println( str );  
     }
     System.out.println( "add tested " );

 
 
 /**merge**/
    DoublyLinkedList maList2 = new DoublyLinkedList();

        // add 
        maList2.add( new String( "A") );
        maList2.add( new String( "B") );
        maList2.add( new String( "C") );
        maList2.add( new String( "F") );
   
    
        maList.merge(maList2 );
     
        System.out.println("===========================================");
        System.out.println("after merging, elements are : ");
        for ( int i=0; i<maList.size(); i++ ) {
              String str = (String)  maList.get( i ) ;     
                System.out.println(str);
       }
    System.out.println( "merge tested!" );
    }
}