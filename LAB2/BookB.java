package LAB2;

// ITI 1521
// Daniel Gebara
// 300401006
// Book part B 

public class BookB {
    // Variables
    private String title, author;

     // Constructeur
    public BookB(String a, String t) {
    author = a;
    title = t;
    }

    // Accesseurs
    public String toString() {
    return ("Author = "+author+", Titre = "+title);
    }

    public void affiche() {
        System.out.println(toString());
    }
}
