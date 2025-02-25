package LAB6.Ex3;

public class Max { 
    public static <T extends Comparable<T> > T maxi (T[] tab) { 
        T max = tab[0] ;
        for (int i = 1; i < tab.length; i++) { 
            if (tab[i].compareTo(max) > 0) max = tab[i] ;
        }
        return max ;
    }
  }