package patronCommande;

public class CommandeOuvrirPorteGarage implements Commande{

    PorteGarage porteGarage;

    public CommandeOuvrirPorteGarage(PorteGarage porteGarage) {
        this.porteGarage = porteGarage;
    }

    public void executer() {
        porteGarage.ouvrir();
    }
}
