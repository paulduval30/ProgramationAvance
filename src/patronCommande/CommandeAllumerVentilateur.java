package patronCommande;

public class CommandeAllumerVentilateur implements Commande {
    Ventilateur ventilateur;

    public CommandeAllumerVentilateur(Ventilateur ventilateur) {
        this.ventilateur = ventilateur;
    }

    @Override
    public void executer() {
        ventilateur.marche();
    }
}
