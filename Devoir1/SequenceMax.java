package Devoir1;

public class SequenceMax {
    public static int sequenceMax(int[] x) {
        /*
         cette focntion prend un tableau de nombres et retourne
         la longueur de la plus longue s�quence des �l�ments cons�cutive �gaux 
         */
         // VOTRE CODE
        int i = 0;
        int maxL = 1;
        while(i < x.length-1){ // tant que i est inferieur a la taille du tableau -1
            int tempL = 1;
            while(i < x.length-1 && x[i] == x[i+1]){ // tant que i est inferieur a la taille du tableau -1 et x[i] est egale a x[i+1]
                tempL = tempL + 1; // increment tempL
                i = i + 1; // increment i
            }
            if(tempL > maxL){ // si tempL est superieur a maxL
                maxL = tempL; // maxL prend la valeur de tempL
            }
            i = i + 1;
        }
        return maxL;
    }
    
    public static void main(String[] args) {
        int[] Tab1 = {1,2,1,3,3,3,6,1,1};
        int[] Tab2 = {1,5,2,2,2,7,3,3,3,3};
        int[] Tab3 = {3,1,7,1};
        
        System.out.println("La plus longue s�quence d��l�ments cons�cutifs �gaux dans Tab1 est : " + sequenceMax(Tab1));
        System.out.println("La plus longue s�quence d��l�ments cons�cutifs �gaux dans Tab2 est : " + sequenceMax(Tab2));
        System.out.println("La plus longue s�quence d��l�ments cons�cutifs �gaux dans Tab3 est : " + sequenceMax(Tab3));
        System.out.println();
    }
} 
