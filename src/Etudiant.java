import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String prenom;
    private ArrayList<Double> notes = new ArrayList<Double>();

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Etudiant(Etudiant etudiant) {
        nom = etudiant.nom;
        prenom = etudiant.prenom;
    }

    public void addNote(double notes) {
         this.notes.add(notes);
    }

    public double calculateAvg() {
        double result = 0.0;
        for (double note : notes) {
            result += note ;
        }
        return result / notes.size();
    }

    @Override
    public String toString() {
        return "L'étudiant: " + "\n" +
                "nom = " + nom + '\'' + "\n" +
                "prenom = " + prenom + '\'' + "\n" +
                "notes = " + notes + "\n" +
                "a une moyenne de : " + calculateAvg() + "\n" +
                "ses initiales sont : " + prenom.substring(0, 1).toUpperCase() + nom.substring(0, 1).toUpperCase() + "\n" +
                "son trigramme est : " + prenom.substring(0, 1).toUpperCase() + nom.substring(0, 1).toUpperCase() + nom.substring(nom.length() - 1).toUpperCase() + "\n";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }

    public static void main(String[] args) {
        Etudiant Messaoud = new Etudiant("Houri", "Messaoud");
        Messaoud.addNote(15.5);
        Messaoud.addNote(17.0);
        Messaoud.addNote(18.0);
        Messaoud.addNote(13.0);
        System.out.println(Messaoud);
        Etudiant Enguerran  = new Etudiant(Messaoud);
        Enguerran.setNom("Smagghe");
        Enguerran.setPrenom("Enguerran");
        Enguerran.addNote(19.0);
        Enguerran.addNote(18.0);
        Enguerran.addNote(16.0);
        Enguerran.addNote(13.0);
        System.out.println(Enguerran);
    }
}
