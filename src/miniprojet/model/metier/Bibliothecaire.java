package miniprojet.model.metier;

public class Bibliothecaire extends Personnel implements Personne{

    /**
     * Constructeur de la classe Bibliothecaire
     * @param num numéro de la bibliothècaire
     * @param nom nom de la bibliothecaire
     * @param prenom prenom de la bibliothecaire
     * @param adresse adresse de la bibliothecaire
     * @param libStatus libelle du status de la bibliothecaire
     */
    public Bibliothecaire(String num, String nom, String prenom, String adresse, String libStatus) {
        super(num, nom, prenom, adresse, libStatus);
    }

    /**
     * Retourne la cotisation de la bibliothecaire
     * @return double
     */
    @Override
    public double calculerCot() {
        return 100;
    }
}
