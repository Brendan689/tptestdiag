public class Exemplaire {
    private int id;
    private Livre livre;
    private Boolean disponible;

    public Exemplaire(int id, Livre livre, Boolean disponible) {
        this.id = id;
        this.livre = livre;
        this.disponible = true;
    }

    public void emprunter() {
      this.disponible = false;
    }

    public void retourner() {
      this.disponible = true;
    }

    @Override
    public String toString() {
        return "Exemplaire{id=" + id + ", livre=" + livre + "} disponible :" + disponible;
    }
}