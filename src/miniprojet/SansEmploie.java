package miniprojet;

public class SansEmploie extends Adherent
{
    public SansEmploie(String nom, String prenom, String adresse, String num)
    {
        super(nom, prenom, adresse, num);
    }

    @Override
    public void inscrire(Bibliotheque b)
    {
        super.inscrire(b);
        System.out.println("Je suis sans emploie");
    }
}
