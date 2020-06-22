package miniprojet.model.metier;

import miniprojet.model.Bibliotheque;

public class Etudiant extends Adherent implements Personne
{
    private String refEtudiant;
    private String numEtudiant;

    /**
     * Constructeur de la classe Etudiant heritée de Adherent et implémentée de l'interface Personne
     * @param nom nom de l'étudiant
     * @param prenom prenom de l'etudiant
     * @param adresse adresse de l'etudiant
     * @param num numero de l'etudiant
     * @param refEtudiant reference de l'etudiant
     * @param numEtudiant numéro etudiant
     */
    public Etudiant(String nom, String prenom, String adresse,String num, String refEtudiant, String numEtudiant)
    {
        super(nom, prenom, adresse, num, "Etudiant");
        this.refEtudiant = refEtudiant;
        this.numEtudiant = numEtudiant;
    }

    public Etudiant(String nom, String prenom)
    {
        super(nom, prenom, "", "", "");
    }

    /**
     * Méthode heritée de Adherent
     * @param b objet de type Bibliothèque
     */
    @Override
    public void inscrire(Bibliotheque b)
    {
        super.inscrire(b);
        System.out.println("Je suis Etudiant et inscrit à la bibliothèque");
    }

    /**
     * Renvoie la cotisation de l'étudiant à la biliothèque
     * @return double
     */
    @Override
    public double calculerCot() {
        return 100;
    }
}
