package patronCommande;

public class PorteGarage{

    String nom;

    public PorteGarage() {
    }
    public PorteGarage(String nom) {
        this.nom=nom;
    }

    public void ouvrir() {
        System.out.println(this.nom+": porte ouverte" );
    }

    public void fermer() {
        System.out.println(this.nom+": porte fermée" );
    }

}
