package miniprojet.model.metier;

import miniprojet.model.Bibliotheque;

public class SansEmploie extends Adherent
{
    /**
     * Constructeur de la classe SansEmploie héritée de la classe Adherent
     * @param nom nom du chomeur
     * @param prenom prenom du chomeur
     * @param adresse adresse du chomeur
     * @param num numero du chaumeur
     */
    public SansEmploie(String nom, String prenom, String adresse, String num)
    {
        super(nom, prenom, adresse, num, "Sans emploie");
    }

    public SansEmploie(String nom, String prenom)
    {
        super(nom, prenom, "", "", "");
    }

    /**
     * Méthode d'inscription du chomeur à une bibliothèque
     * @param b objet de type Bibliothèque
     */
    @Override
    public void inscrire(Bibliotheque b)
    {
        super.inscrire(b);
        System.out.println("Je suis sans emploie");
    }
}
