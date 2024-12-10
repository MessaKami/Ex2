public class Voiture {
    private static int compteur = 0;
    private int id;
    private String marque;
    private String modele;
    private String date;

    public Voiture(String marque, String modele, String date) {
        this.id = ++compteur;
        this.marque = marque;
        this.modele = modele;
        this.date = date;
    }

    public Voiture(Voiture voiture) {
        id = ++compteur;
        marque = voiture.marque;
        modele = voiture.modele;
        date = voiture.date;
    }

    public String toString() {
        return  id + " Je vous présente la marque " + marque + "\n" + "et son nouvelle modèle de l'année " + date + "\n" +"la fameuse " + modele;
    }

    public static int getCompteur() {
        return compteur;
    }

    public static void setCompteur(int compteur) {
        Voiture.compteur = compteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static void main(String[] args) {
        Voiture Honda = new Voiture ("Honda", "Civic Type R", "2024");
        System.out.println(Honda);
        Voiture Audi = new Voiture (Honda);
        Audi.setModele("A3");
        Audi.setMarque("AUDI");
        Audi.setDate("2015");
        System.out.println(Audi);
    }
}
