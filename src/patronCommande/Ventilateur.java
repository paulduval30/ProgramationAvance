package patronCommande;

public class Ventilateur {
    String nom;

    public Ventilateur() {
    }
    public Ventilateur(String nom) {
        this.nom=nom;
    }

    public void marche() {
        System.out.println(this.nom+": ventilateur allumé" );
    }

    public void arret() {
        System.out.println(this.nom+": ventilateur éteint" );
    }
}
