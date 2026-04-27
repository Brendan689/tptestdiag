public class Main {
    public static void main(String[] args) {
        Auteur a = new Auteur("Antoine", "Saint Exupéry");
        Categorie c = new Categorie("Roman");
        Livre l = new Livre("Le petit Prince", 123456, a, c);
        Exemplaire e1 = new Exemplaire(1, l, true);
        Exemplaire e2 = new Exemplaire(2, l, true);
        l.ajouterExemplaire(e1);
        l.ajouterExemplaire(e2);
        l.getExemplaires().forEach(System.out::println);

        Utilisateur u1 = new Utilisateur("John", "Doe");
        Emprunt em1 = new Emprunt(u1, e1);
        System.out.println(em1);
        l.getExemplaires().forEach(System.out::println);
    }
}
