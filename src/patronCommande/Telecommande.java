package patronCommande;

public class Telecommande {

	Commande[] commandesMarche;
	Commande[] commandesArret;
	public Telecommande() {
	commandesMarche = new Commande[7];
	commandesArret = new Commande[7];
	Commande pasDeCommande = new PasDeCommande();
	for (int i = 0; i < 7; i++) {
	commandesMarche[i] = pasDeCommande;
	commandesArret[i] = pasDeCommande;
	}
	}
	public void setCommande(int empt, Commande comMarche, Commande comArret) {
	commandesMarche[empt] = comMarche;
	commandesArret[empt] = comArret;
	}
	public void boutonMarchePresse(int empt) {
	commandesMarche[empt].executer();
	}
	public void boutonArretPresse(int empt) {
	commandesArret[empt].executer();
	}
	

}
