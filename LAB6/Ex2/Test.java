package LAB6.Ex2;

class Test {
    public static void main( String[] args ) {

        Set s1, s2 ;
        s1 = new Set ( 1 , 1 , 1 ) ;
        s2 = new Set ( 2 , 2 , 2 ) ;

       
        if ( s1.compareTo( s2 ) < 0 ) {
            System.out.println( "test 1: ok" );
        } else {
            System.out.println( "test 1 : failed" );
        }

        s1 = new Set ( 1 , 1 , 1 ) ;
        s2 = new Set ( 2 , 2 , 1 ) ;

        if ( s1.compareTo( s2 ) <= 0 ) {
            System.out.println( "test 2: ok" );
        } else {
            System.out.println( "test 2: failed" );
        }

        s1 = new Set( 1, 1, 2 );
        s2 = new Set( 2, 2, 1 );

        if ( s1.compareTo( s2 ) < 0 ) {
            System.out.println( "test 3: ok" );
        } else {
            System.out.println( "test 3: failed" );
        }

       s1 = new Set( 1, 1, 1 );
        s2 = new Set( 2, 1, 2 );

        if ( s1.compareTo( s2 ) < 0 ) {
            System.out.println( "test 4: ok" );
        } else {
            System.out.println( "test 4: failed" );
        }

        s1 = new Set( 1, 1, 1 );
        s2 = new Set( 2, 1, 1 );

        if ( s1.compareTo( s2 ) < 0 ) {
            System.out.println( "test 5: ok" );
        } else {
            System.out.println( "test 5: failed" );
        }

        s1 = new Set( 1, 1, 2 );
        s2 = new Set( 2, 1, 1 );

        if ( s1.compareTo( s2 ) < 0 ) {
            System.out.println( "test 6: ok" );
        } else {
            System.out.println( "test 6: failed" );
        }

        s1 = new Set( 1, 2, 1 );
        s2 = new Set( 2, 1, 2 );

        if ( s1.compareTo( s2 ) < 0 ) {
            System.out.println( "test 7: ok" );
        } else {
            System.out.println( "test 7: failed" );
        }

       s1 = new Set( 1, 2, 1 );
       s2 = new Set( 2, 1, 1 );

        if ( s1.compareTo( s2 ) < 0 ) {
            System.out.println( "test 8: ok" );
        } else {
            System.out.println( "test 8: failed" );
        }

        s1 = new Set( 1, 2, 2 );
        s2 = new Set( 2, 1, 1 );

        if ( s1.compareTo( s2 ) < 0 ) {
            System.out.println( "test 9: ok" );
        } else {
            System.out.println( "test 9: failed" );
        }

        s1 = new Set( 1, 1, 1 );
        s2 = new Set( 1, 2, 2 );

        if ( s1.compareTo( s2 ) < 0 ) {
            System.out.println( "test 10: ok" );
        } else {
            System.out.println( "test 10: failed" );
        }

        s1 = new Set( 1, 1, 1 );
        s2 = new Set( 1, 2, 1 );

        if ( s1.compareTo( s2 ) < 0 ) {
            System.out.println( "test 11: ok" );
        } else {
            System.out.println( "test 11: failed" );
        }

        s1 = new Set( 1, 1, 2 );
        s2 = new Set( 1, 2, 1 );

        if ( s1.compareTo( s2 ) < 0 ) {
            System.out.println( "test 12: ok" );
        } else {
            System.out.println( "test 12: failed" );
        }

        s1 = new Set( 1, 1, 1 );
        s2 = new Set( 1, 1, 2 );

        if ( s1.compareTo( s2 ) < 0 ) {
            System.out.println( "test 13: ok" );
        } else {
            System.out.println( "test 13: failed" );
        }

       s1 = new Set( 1, 1, 1 );
       s2 = new Set( 1, 1, 1 );

        if ( s1.compareTo( s2 ) == 0 ) {
            System.out.println( "test 14: ok" );
        } else {
            System.out.println( "test 14: failed" );
        }

        s1 = new Set( 1, 1, 2 );
        s2 = new Set( 1, 1, 1 );

        if ( s1.compareTo( s2 ) > 0 ) {
            System.out.println( "test 15: ok" );
        } else {
            System.out.println( "test 15: failed" );
        }

        s1 = new Set( 1, 2, 1 );
        s2 = new Set( 1, 1, 2 );

        if ( s1.compareTo( s2 ) > 0 ) {
            System.out.println( "test 16: ok" );
        } else {
            System.out.println( "test 16: failed" );
        }

        s1 = new Set( 1, 2, 1 );
        s2 = new Set( 1, 1, 1 );

        if ( s1.compareTo( s2 ) > 0 ) {
            System.out.println( "test 17: ok" );
        } else {
            System.out.println( "test 17: failed" );
        }

        s1 = new Set( 1, 2, 2 );
        s2 = new Set( 1, 1, 1 );

        if ( s1.compareTo( s2 ) > 0 ) {
            System.out.println( "test 18: ok" );
        } else {
            System.out.println( "test 18: failed" );
        }

        s1 = new Set( 2, 1, 1 );
        s2 = new Set( 1, 2, 2 );

        if ( s1.compareTo( s2 ) > 0 ) {
            System.out.println( "test 19: ok" );
        } else {
            System.out.println( "test 19: failed" );
        }

        s1 = new Set( 2, 1, 1 );
        s2 = new Set( 1, 2, 1 );

        if ( s1.compareTo( s2 ) > 0 ) {
            System.out.println( "test 20: ok" );
        } else {
            System.out.println( "test 20: failed" );
        }

        s1 = new Set( 2, 1, 2 );
        s2 = new Set( 1, 2, 1 );

        if ( s1.compareTo( s2 ) > 0 ) {
            System.out.println( "test 21: ok" );
        } else {
            System.out.println( "test 21: failed" );
        }

        s1 = new Set( 2, 1, 1 );
        s2 = new Set( 1, 1, 2 );

        if ( s1.compareTo( s2 ) > 0 ) {
            System.out.println( "test 22: ok" );
        } else {
            System.out.println( "test 22: failed" );
        }

        s1 = new Set( 2, 1, 1 );
        s2 = new Set( 1, 1, 1 );

        if ( s1.compareTo( s2 ) > 0 ) {
            System.out.println( "test 23: ok" );
        } else {
            System.out.println( "test 23: failed" );
        }

        s1 = new Set( 2, 1, 2 );
        s2 = new Set( 1, 1, 1 );

        if ( s1.compareTo( s2 ) > 0 ) {
            System.out.println( "test 24: ok" );
        } else {
            System.out.println( "test 24: failed" );
        }

        s1 = new Set( 2, 2, 1 );
        s2 = new Set( 1, 1, 2 );

        if ( s1.compareTo( s2 ) > 0 ) {
            System.out.println( "test 25: ok" );
        } else {
            System.out.println( "test 25: failed" );
        }

        s1 = new Set( 2, 2, 1 );
        s2 = new Set( 1, 1, 1 );

        if ( s1.compareTo( s2 ) > 0 ) {
            System.out.println( "test 26: ok" );
        } else {
            System.out.println( "test 26: failed" );
        }

        s1 = new Set( 2, 2, 2 );
        s2 = new Set( 1, 1, 1 );

        if ( s1.compareTo( s2 ) > 0 ) {
            System.out.println( "test 27: ok" );
        } else {
            System.out.println( "test 27: failed" );
        }

      }

}
