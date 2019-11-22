package miniprojet.metier;

public class Etudiant extends Adherent implements Personne
{
    private String refEtudiant;
    private String numEtudiant;
    public Etudiant(String nom, String prenom, String adresse, String num, String refEtudiant, String numEtudiant)
    {
        super(nom, prenom, adresse, num, "Etudiant");
        this.refEtudiant = refEtudiant;
        this.numEtudiant = numEtudiant;
    }

    @Override
    public void inscrire(Bibliotheque b)
    {
        super.inscrire(b);
        System.out.println("Je suis Etudiant");
    }

    @Override
    public double calculerCot() {
        return 100;
    }
}
