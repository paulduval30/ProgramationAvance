package patronCommande;

public class CommandeEteindreVentilateur implements Commande{
    Ventilateur ventilateur;
    public CommandeEteindreVentilateur(Ventilateur ventilateur) {
        this.ventilateur = ventilateur;
    }
    public void executer() {
        ventilateur.arret();
    }
}
