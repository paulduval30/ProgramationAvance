package miniprojet.model.metier;


public class Directeur extends Personnel{
    /**
     * Constructeur de la classe Directeur, heritée de Personnel
     * @param num numéro du directeur
     * @param nom nom du directeur
     * @param prenom prenom du directeur
     * @param adresse adresse du directeur
     * @param libStatus libelle du status du directeur
     */
    public Directeur(String num, String nom, String prenom, String adresse, String libStatus) {
        super(num, nom, prenom, adresse, libStatus );
    }

}
