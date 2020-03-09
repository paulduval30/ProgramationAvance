package miniprojet.model.metier;

public class Bibliothecaire extends Personnel implements Personne{

    public Bibliothecaire(String num, String nom, String prenom, String adresse, String libStatus) {
        super(num, nom, prenom, adresse, libStatus);
    }

    @Override
    public double calculerCot() {
        return 100;
    }
}
