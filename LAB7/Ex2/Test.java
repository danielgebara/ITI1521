package LAB7.Ex2;

import LAB7.Ex1.ArrayStack;

public class Test {
 
    static Stack<Integer> trier(Stack<Integer> p1) {
        int count = 0;
        Stack<Integer> tempStack = new ArrayStack<>(100); 

        
        while (!p1.isEmpty()) {
            tempStack.push(p1.pop());
            count++;
        }

        while (!tempStack.isEmpty()) {
            p1.push(tempStack.pop());
        }

        Stack<Integer> p2 = new ArrayStack<>(count);
        Stack<Integer> p3 = new ArrayStack<>(count);

        while (!p1.isEmpty()) {
            int temp = p1.pop();

            while (!p2.isEmpty() && p2.peek() < temp) {
                p3.push(p2.pop());
            }

            p2.push(temp);

            while (!p3.isEmpty()) {
                p2.push(p3.pop());
            }
        }

        return p2;
    }
}

     @SuppressWarnings("unchecked")
    public static void main( String[] args ) {
 
         int[] tab = {4,3,2,5,8,0,2,6,9,3};
         ArrayStack<Integer> pile;
         pile = new ArrayStack<Integer>( 10 );
          
         
          ArrayStack<Integer> pileTrie;
          pileTrie = new ArrayStack<Integer>( 10 );
 
        /*Empiler la pile avec les elements de tab et afficher ses elements*/
         for (int i = 0; i < tab.length; i++) {
                 pile.push(tab[i]);
         }
 
        System.out.println( "Les elements de ma pile sont au depart : "  );
        while ( ! pile.isEmpty() ) {
             System.out.println(  pile.pop() );
         }
         
         
        /*Empiler la pile a nouveau avec tab et afficher ses elements tries*/
        for (int i = 0; i < tab.length; i++) {
                 pile.push(tab[i]);
         }
         pileTrie=trier((Stack<Integer>) pile);
         
         System.out.println();
         System.out.println( "Les elements de ma pile triee sont : "  );
         while ( !pileTrie.isEmpty() ) {
             System.out.println( pileTrie.pop() );
         }
 
     }
 
 }