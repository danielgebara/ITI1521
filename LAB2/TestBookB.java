package LAB2;

// ITI 1521
// Daniel Gebara
// 300401006
// TestBook part B

public class TestBookB {
    public static void main(String[] args) {
        BookB book1 = new BookB("E.B.Koffman ", "Abstraction and Design Using Java");
        BookB book2 = new BookB("Duane A.Bailey", " Data Structures in Java for Principled Programmer ");
        book2.affiche();
        System.out.println();
        System.out.println(book1);
    }  
}
