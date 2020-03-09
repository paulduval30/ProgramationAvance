package miniprojet.model.metier;

public class Secretaire extends Personnel implements Personne{
    public Secretaire(String num, String nom, String prenom, String adresse, String libStatus) {
        super(num, nom, prenom, adresse, libStatus);
    }

    @Override
    public double calculerCot() {
        return 100;
    }
}
