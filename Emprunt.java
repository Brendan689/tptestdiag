public class Emprunt {
    private Utilisateur utilisateur;
    private Exemplaire exemplaire;

    public Emprunt(Utilisateur utilisateur, Exemplaire exemplaire) {
        this.utilisateur = utilisateur;
        this.exemplaire = exemplaire;
        exemplaire.emprunter();
    }

    @Override
    public String toString() {
        return utilisateur + " a emprunter :  " + exemplaire;
    }
}