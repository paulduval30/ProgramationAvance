package patronCommande;

public class CommandeEteindreLampe implements Commande {
Lampe lampe;
public CommandeEteindreLampe(Lampe lampe) {
this.lampe = lampe;
}
public void executer() {
lampe.arret();
}
}