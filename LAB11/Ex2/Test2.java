package LAB11.Ex2;

public class Test2 {

    public static IterList complement( IterList input ) {

        IterList result;
        result = new IterList();

        Iterator i = input.iterator();
        Iterator j = result.iterator();

        while (i.hasNext()) {
            int bit = i.next();
            int compBit = (bit == IterList.ZERO) ? IterList.ONE : IterList.ZERO;
            j.add(compBit);
        }
        return result;    }

    public static IterList or( IterList list1, IterList list2 ) {

        IterList result;
        result = new IterList();

        Iterator i = list1.iterator();
        Iterator j = list2.iterator();

        Iterator k = result.iterator();

        if ( ! i.hasNext() ) {
             throw new IllegalArgumentException( "list1 is empty" );
        }
        if ( ! j.hasNext() ) {
             throw new IllegalArgumentException( "list2 is empty" );
        }
        while ( i.hasNext() ) {

            if (!j.hasNext()) {
                throw new IllegalArgumentException("list2 is shorter than list1");
            }
            int bit1 = i.next();
            int bit2 = j.next();

            // Compute bitwise OR: if either bit is 1, result is 1; otherwise 0.
            int orBit = (bit1 == IterList.ONE || bit2 == IterList.ONE) ? IterList.ONE : IterList.ZERO;
            k.add(orBit);
                }

        if ( j.hasNext() ) {
            throw new IllegalArgumentException( "list2 is longer than list1" );
        }
        return result;
    }

    public static void main( String[] args ) {

        IterList list1, list2;

        for ( int i=0; i<args.length; i++ ) {

            list1 = new IterList( args[i] );
            System.out.println( "> " + list1 );
            System.out.println( "< " + complement( list1 ) );
            System.out.println();

        }

        list1 = new IterList( "10001" );
        list2 = new IterList( "00011" );

        System.out.println( "list1 = " + list1 );
        System.out.println( "list2 = " + list2 );
        System.out.println( "list1 or list2 = " + or( list1, list2 ) );

      }//end of main
}//end of Test2

