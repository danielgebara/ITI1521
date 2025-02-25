package LAB6.Ex3;

public class TestMaxPoint { 
    public static void main (String args[]){ 
      Point p1 = new Point (10, 5) ;
      Point p2 = new Point (23, 10) ;
      Point p3 = new Point (0, 1) ;
      Point p4 = new Point (2, 5) ;
      Point p5 = new Point (3, 3) ;
      
      Point [] tabPoints = {p1, p2, p3, p4, p5} ;
      
      Point maxPoint = Max.maxi(tabPoints) ;
      
      System.out.print ("Coordonnees du Point max : ") ;
      maxPoint.display() ;
    
    }
  }
