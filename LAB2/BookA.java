package LAB2;

// ITI 1521
// Daniel Gebara
// 300401006
// Book part A 

public class BookA {
    // Variables
    private String title, author;

     // Constructeur
    public BookA(String a, String t) {
    author = a;
    title = t;
    }

    // Accesseurs
    public String getAuthor() {
    return author;
    }

    public void affiche() {
        System.out.println("Author = "+author+", Titre = " +title);
    }
}