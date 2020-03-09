package miniprojet.model.metier;

public class Secretaire extends Personnel implements Personne{
    /**
     * Constructeur de la classe Secretaire heritée de Personnel et implémentée de la classe Personne
     * @param num numero de la secretaire
     * @param nom nom de la secretaire
     * @param prenom prenom de la secretaire
     * @param adresse adresse de la secretaire
     * @param libStatus libelle du status de la secretaire
     */
    public Secretaire(String num, String nom, String prenom, String adresse, String libStatus) {
        super(num, nom, prenom, adresse, libStatus);
    }

    /**
     * Retourne la cotisation de la secretaire à la bibliothèque
     * @return double
     */
    @Override
    public double calculerCot() {
        return 100;
    }
}
