package miniprojet;

public class Salarie extends Adherent
{
    private int salaireBrut;
    private String refSalarie;

    public Salarie(String nom, String prenom, String adresse, String num, int salaireBrut, String refSalarie)
    {
        super(nom, prenom, adresse, num);
        this.salaireBrut = salaireBrut;
        this.refSalarie = refSalarie;
    }

    @Override
    public void inscrire(Bibliotheque b)
    {
        super.inscrire(b);
        System.out.println("Je suis salarié");
    }
}
