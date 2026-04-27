import java.util.ArrayList;
import java.util.List;

public class Livre {
    private String nom;
    private int isbn;
    private Auteur auteur;
    private Categorie categorie;
    private List<Exemplaire> exemplaires = new ArrayList<>();

    public Livre(String nom, int isbn, Auteur auteur, Categorie categorie) {
        this.nom = nom;
        this.isbn = isbn;
        this.auteur = auteur;
        this.categorie = categorie;
    }

    public void ajouterExemplaire(Exemplaire exemplaire) {
        exemplaires.add(exemplaire);
    }

    public List<Exemplaire> getExemplaires() {
        return exemplaires;
    }

    @Override
    public String toString() {
        return "Livre{nom='" + nom + "', isbn=" + isbn + ", auteur=" + auteur + ", categorie=" + categorie + "}";
    }
}