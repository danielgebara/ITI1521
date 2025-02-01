package Devoir1;

public class SetInt {
    private int[] tab ;
    private int size ;
    private int nbElements ;

    public SetInt ( ) {
      size = 20;
      tab = new int[size];
      nbElements = 0;
    }
    public int getNbElements() {
        return nbElements;
    }

    public boolean has(int p) {
        for(int i = 0; i<tab.length; i++){  // parcourir le tableau
            if (tab[i] == p) {  // si l'element est present
                return true;
            }
        }
        return false;
    }

    public void add(int p) {
        if (this.has(p)){ // si l'element est deja present
            return;
        }
        tab[nbElements] = p; // ajouter l'element
        nbElements++; // incrementer le nombre d'elements
        return;
    }

    public  void trier( ){
        for (int i = 1; i < nbElements; i++) { // pour i allant de 1 a la taille du tableau
            int key = tab[i];
            int j = i - 1;
            while (j >= 0 && tab[j] > key) { // tant que j est superieur ou egale a 0 et tab[j] est superieur a key
                tab[j + 1] = tab[j];
                j--;    // decrement j
            }
            tab[j + 1] = key;   // tab[j+1] prend la valeur de key
        }
    }
    
    public String toString() {
        if (nbElements == 0)
            return "{}";
        else {
            String str =  "{" + tab[0];
            for (int i = 1; i < nbElements; i++)
                str += "," + tab[i];
            return str + "}";
        }
    }

/*
* MAIN
* 
*/
    static public void main(String[] args) {
        SetInt set = new SetInt();
        System.out.println("SVP, entrez les �l�ments de votre ensemble (entiers positifs) :" );
        System.out.println("Pour quitter, entrez un entier n�gatif:" );
        int n = ReadInt.getInt("Votre premier entier : ");
        while (n >= 0 ) {
            set.add(n);
            n = ReadInt.getInt("entier suivant : ");
        }
        
        System.out.println("Mon ensemble contient " + set.getNbElements() + " �l�ments : ");
        System.out.println("set = " + set);
        set.trier();
        System.out.println("Mon ensemble tri� est :" );
        System.out.println("set = " + set);
     }
}
