package LAB2;

// ITI 1521
// Daniel Gebara
// 300401006
// Tab exercise

class Tab {
    public static void trier( int [ ] tab ){
        int i , j , min , tmp ; // déclaration de 4 variables de type entier (int).
        for ( i = 0 ; i < tab.length - 1 ; i++) {
            min = i; // Ligne 5.
            for ( j = i + 1 ; j < tab.length ; j++) { //ligne 6: boucle for imbriquée
                if (tab[j] <tab[ min ] ) { // ligne 7
                min = j ; // ligne 8
                }
            }
            tmp = tab[min] ; // ligne 12
            tab[min] = tab[ i ] ; // ligne 13
            tab [ i ] = tmp ; // ligne 14
        }
    }
    
    public static int moyenne(int[] tab){
        int somme=0;
        for (int i =0; i<tab.length ; i++) {
            somme = somme + tab[i];
        }
        return somme/tab.length;
    }
    
    public static void main (String args [ ] ) {
    
    int tab1 [ ] = { 3,55,7, 1, 88, 9 , 4, -10 };
    int i,moyenne;
    int[] tab2;
    tab2 = new int[]{10,34,62,56,82,7,95};
    trier(tab1 ) ;
    trier(tab2 ) ;
    
    
    System.out.println ("Les �l�ments de tab1 tri�s sont : " ) ;
    for ( i =0; i<tab1.length ; i++) {
    /*Impression du contenu de tab1 tri�*/
      if ( i >0) {
      System.out.print ( " , " ) ;
      }
      System.out.print (tab1 [ i ] ) ;
    }
    System.out.println ( ) ;
    System.out.println ("Les �l�ments de tab2 tri�s sont : " ) ;
    for ( i =0; i<tab2.length ; i++) {
    /*Impression du contenu de tab2 tri�*/
      if ( i >0) {
        System.out.print ( " , " ) ;
      }
      System.out.print (tab2 [ i ] ) ;
    }
    System.out.println ( ) ;
    System.out.print ("La valeur moyenne de tab1 est " + moyenne(tab1)) ;
    System.out.println ( ) ;
    moyenne=moyenne(tab2);
    System.out.print ("La valeur moyenne de tab2 est " + moyenne) ;
    System.out.println ( ) ;
    }
    
}
