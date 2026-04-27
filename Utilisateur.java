public class Utilisateur {
    private String nom;
    private String prenom;

    public Utilisateur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }
}