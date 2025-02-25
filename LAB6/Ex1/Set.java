package LAB6.Ex1;

public class Set{

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

    // An instance method that compares this object to other.
    // Always check that other is not null, i)
    // an error would occur if you tried to
    // access other if other was null, ii)
    // null is a valid argument, the method should
    // simply return false.

    public boolean equals( Set other ) {
        if (other == null) {
            return false;
        }
        return this.first == other.first && this.second == other.second && this.third == other.third;
    }

    // Returns a String representation of this Set.

    public String toString() {
        return "(" + this.first + "," + this.second + "," + this.third + ")";
    }
}

