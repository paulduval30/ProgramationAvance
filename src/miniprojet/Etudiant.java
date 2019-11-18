package miniprojet;

public class Etudiant extends Adherent
{
    private String refEtudiant;
    private String numEtudiant;
    public Etudiant(String nom, String prenom, String adresse, String num, String refEtudiant, String numEtudiant)
    {
        super(nom, prenom, adresse, num);
        this.refEtudiant = refEtudiant;
        this.numEtudiant = numEtudiant;
    }

    @Override
    public void inscrire(Bibliotheque b)
    {
        super.inscrire(b);
        System.out.println("Je suis Etudiant");
    }
}
