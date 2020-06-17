package patronCommande;

public class ChargeurTelecommande {
    public static void main(String[] args) {
        Telecommande teleCommande = new Telecommande();
        Lampe lampeSejour= new Lampe("Séjour");
        Lampe lampeCuisine = new Lampe("Cuisine");


        CommandeAllumerLampe lampeSejourAllumee =new CommandeAllumerLampe(lampeSejour);
        CommandeEteindreLampe lampeSejourEteinte =new CommandeEteindreLampe(lampeSejour);
        CommandeAllumerLampe lampeCuisineAllumee =new CommandeAllumerLampe(lampeCuisine);
        CommandeEteindreLampe lampeCuisineEteinte =new CommandeEteindreLampe(lampeCuisine);

        //CommandeAllumerVentilateur ventilateurAllume = new CommandeAllumerVentilateur(ventilateur);
        //CommandeEteindreVentilateur ventilateurEteint = new CommandeEteindreVentilateur(ventilateur);
        //CommandeOuvrirPorteGarage porteGarageOuverte = new CommandeOuvrirPorteGarage(porteGarage);
        //CommandeFermerPorteGarage porteGarageFermee = new CommandeFermerPorteGarage(porteGarage);

        teleCommande.setCommande(0, lampeSejourAllumee, lampeSejourEteinte);
        teleCommande.setCommande(1, lampeCuisineAllumee, lampeCuisineEteinte);
        //teleCommande.setCommande(2, ventilateurAllume, ventilateurEteint);
        //teleCommande.setCommande(3, stereoAvecCD, stereoEteinte);

        teleCommande.boutonMarchePresse(0);
        teleCommande.boutonArretPresse(0);
        teleCommande.boutonMarchePresse(1);
        teleCommande.boutonArretPresse(1);
        teleCommande.boutonMarchePresse(2);
        teleCommande.boutonArretPresse(2);
        teleCommande.boutonMarchePresse(3);
        teleCommande.boutonArretPresse(3);
    }
}