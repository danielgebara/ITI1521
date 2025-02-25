package LAB6.Ex3;

class Point implements Comparable <Point> { 
    private int x, y ;
    
    Point (int x, int y){ 
      this.x = x ;
      this.y = y ;
    }
  
    public void display() { 
      System.out.println ( x + " " + y ) ;
    }
    
    public int compareTo (Point p) { 
        if (this.x == p.x && this.y == p.y) return 0 ;
        else if (this.x > p.x || (this.x == p.x && this.y > p.y)) return 1 ;
        else return -1 ;
    }
  }
