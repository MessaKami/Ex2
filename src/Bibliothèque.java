public class Bibliothèque {
    public static void main(String[] args) {
        Livre Roman = new Livre("Réussite = Libre ?", "Biographie", "Messaoud", "Houri", "4789654");
        System.out.println(Roman);
        Livre SF = new Livre(Roman);
        SF.setTitle("Est-ce que mon équipe va clutch ?");
        SF.setCategory("Science Fiction");
        SF.setFirstNameAuthor("Justin");
        SF.setLastNameAuthor("Didelot");
        SF.setISBN("5478963");
        System.out.println(SF);
    }
}
