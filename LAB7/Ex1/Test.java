package LAB7.Ex1;

public class Test {

    public static void main( String[] args ) {

        Stack<String> str;
        str = new ArrayStack<String>( 10 );

        for ( int i=0; i<10; i++ ) {
            str.push("First time :" + 2*i );
        }

        str.clear();

        while ( ! str.isEmpty() ) {
            System.out.println( str.pop() );
        }

        for ( int i=0; i<10; i++ ) {
            str.push( "Second time :" + 2*i);
        }

        while ( ! str.isEmpty() ) {
            System.out.println( str.pop() );
        }

    }

}