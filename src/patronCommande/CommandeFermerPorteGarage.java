package patronCommande;

public class CommandeFermerPorteGarage implements Commande {

    PorteGarage porteGarage;

    public CommandeFermerPorteGarage(PorteGarage porteGarage) {
        this.porteGarage = porteGarage;
    }

    public void executer() {
        porteGarage.fermer();
    }
}

