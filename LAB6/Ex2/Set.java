package LAB6.Ex2;

public class Set implements Comparable <Set> {

    // Instance variables.

    private int first;
    private int second;
    private int third;

    // Constructor 
    
    public Set( int first, int second, int third ) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

  // methodes d'instance 
	public int compareTo( Set other ) {
        if(this.first < other.first) {
            return -1;
        } else if(this.first > other.first) {
            return 1;
        } else {
            if(this.second < other.second) {
                return -1;
            } else if(this.second > other.second) {
                return 1;
            } else {
                if(this.third < other.third) {
                    return -1;
                } else if(this.third > other.third) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
       }

    //methodes precedentes complétées 
    public boolean equals( Set other ) {
        if(other==null) {
            return false;
        } else {
            return this.first == other.first && this.second == other.second && this.third == other.third;
        }
    }

    
    public String toString() {
        return "(" + this.first + "," + this.second + "," + this.third + ")";
    }

}
