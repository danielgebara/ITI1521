package Devoir1;

public class Dé {
    private int value;   // Num�ro figurant sur le d�. 

        /**
         * Le constructeur cr�e un d� et le lance de sorte qu'il
          * montre initialement une valeur al�atoire entre 1 et 6. 
         */
        public Dé() {
           value = (int) (Math.random() * 6) + 1;        }     // end D�()
        
        /**
         * Lancez le d� pour qu'il indique un nombre al�atoire entre 1 et 6. 
         */
        public void lancer() {
           value = (int) (Math.random() * 6) + 1;        }     // end lancer()
                
        /**
         * Renvoie le nombre indiqu� sur le d�. 
         */ 
        public int getValue() {
           return value;
        }
        
        /**
         * D�finit la valeur du d�. Imprime Valeur iIll�gale du d�
          * si la valeur n'est pas comprise entre 1 et 6. 
         */
        public void setValue( int val ) {
           if (val < 1 || val > 6) { // si la valeur n'est pas comprise entre 1 et 6
              System.out.println("Valeur illégale du dé " + val); 
           } else {
              value = val; // sinon on fixe la valeur du dé
           }        }
        
   
     
//Programme principal main
      
     /** 
      * lancer deux d�s jusqu'� ce qu'ils indiquent la meme valeur 
      * et afficher le nombre de fois que ces d�s ont �t� lanc�s. 
      */
    
        public static void main(String[] args) {
           
           Dé dé1= new Dé();  // 1er d�
           Dé dé2= new Dé();  // second d�
           
           int essai = 1;
           while (true) {
              if (dé1.value != dé2.value) {
                 dé1.lancer();
                 dé2.lancer();
                 essai += 1;
              } else {
                 System.out.println("Ça a pris " + essai + " lancés pour que les deux dés indiquent la même valeur :");
                 break;
              }
           }
           
           /*Affiche le nombre de lanc�s. */
           
          //VOTRE lIGNE D'AFFICHAGE
          
          System.out.println(dé1.getValue());
          System.out.println(dé2.getValue());
          System.out.println();
           
          /* g�n�rer une exception. */
           System.out.println("Ce programme va maintenant se terminer avec un message d'erreur ");
           System.out.println("lorsqu'il essaie de fixer la valeur d'un d� � 100. ");
           Dé dé;  // variable referant au d�.
           dé = new Dé();  // creer l'objet
           dé.setValue(100);
        }
        
}  // end class D�
