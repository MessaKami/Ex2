public class Livre {
    private String title;
    private String category;
    private String firstNameAuthor;
    private String lastNameAuthor;
    private String ISBN;

    public Livre(String title, String category, String firstname, String lastname, String ISBN) {
        this.title = title;
        this.category = category;
        this.firstNameAuthor = firstname;
        this.lastNameAuthor = lastname;
        this.ISBN = ISBN;
    }

    private String getCode() {
        String firstTwoLastName = lastNameAuthor.substring(0, 2).toUpperCase();
        String firstTwoFirstName = firstNameAuthor.substring(0, 2).toUpperCase();
        String firstCategoryLetter = category.substring(0, 1).toUpperCase();
        String lastTwoISBN = ISBN.substring(ISBN.length() - 2).toUpperCase();

        return firstTwoLastName + firstTwoFirstName + firstCategoryLetter + lastTwoISBN;
    }

    public String toString() {
        return "Titre : " + title + "\n" +
                "Auteur : " + firstNameAuthor + " " + lastNameAuthor + "\n" +
                "Catégorie : " + category + "\n" +
                "ISBN : " + ISBN + "\n" +
                "Code : " + getCode() + "\n";
    }

    public Livre(Livre livre) {
        title = livre.title;
        category = livre.category;
        firstNameAuthor = livre.firstNameAuthor;
        lastNameAuthor = livre.lastNameAuthor;
        ISBN = livre.ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }

    public void setFirstNameAuthor(String firstNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
    }

    public String getLastNameAuthor() {
        return lastNameAuthor;
    }

    public void setLastNameAuthor(String lastNameAuthor) {
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
