package Devoir1;

public class SequenceDeDeux {
    public static boolean sequenceDeDeux(int[]  x) {
        /*
         fonction qui prend un tableau de nombres entiere et qui retourne true s�il y a au moins
         une s�quence de deux �l�ments cons�cutifs �gaux,
         et false dans le cas contraire.
         */
         
         // VOTRE CODE
        boolean res = false;
        int i = 0;
        while(i < x.length-1 && !res){
            if(x[i] == x[i+1]){
                res = true;
            }
            i = i + 1;
        }
        return res;
    }
    
     
    public static void main(String[] args) {
        int[] Tab1 = {3,1,1,7,5};
        int[] Tab2 = {1,6,4,3,3,3};
        int[] Tab3 = {2,1,5,3,1,2,1};
        
        System.out.println("Il y a au moins une s�quence de deux �l�ments cons�cutifs �gaux dans Tab1 : " + sequenceDeDeux(Tab1));
        System.out.println("Il y a au moins une s�quence de deux �l�ments cons�cutifs �gaux dans Tab2 : " + sequenceDeDeux(Tab2));
        System.out.println("Il y a au moins une s�quence de deux �l�ments cons�cutifs �gaux dans Tab3 : " + sequenceDeDeux(Tab3));
        System.out.println();
    }
    
} 
