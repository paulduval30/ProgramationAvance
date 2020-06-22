package miniprojet.model.metier;

import miniprojet.model.Bibliotheque;

public class Salarie extends Adherent implements Personne
{
    private int salaireBrut;
    private String refSalarie;

    /**
     * COnstructeur de la classe Salarie heritée de Adherent et implémentée de l'interface Personne
     * @param nom nom du salarié
     * @param prenom prénom du salarié
     * @param adresse adresse du salarié
     * @param num numéro du salarié
     * @param salaireBrut salaire du salarié
     * @param refSalarie référence du salarié
     */
    public Salarie(String nom, String prenom, String adresse, String num,  int salaireBrut, String refSalarie)
    {
        super(nom, prenom, adresse, num,  "Salarié");
        this.salaireBrut = salaireBrut;
        this.refSalarie = refSalarie;
    }

    public Salarie(String nom, String prenom)
    {
        super(nom, prenom, "", "", "");
    }

    /**
     * Méthode d'inscription du salarié à une bibliothèque
     * @param b objet de type Bibliothèque
     */
    @Override
    public void inscrire(Bibliotheque b)
    {
        super.inscrire(b);
        System.out.println("Je suis salarié");
    }

    /**
     * Retourne la cotisation du salarié à la biblitohèque
     * @return double
     */
    @Override
    public double calculerCot() {
        return 100;
    }
}
