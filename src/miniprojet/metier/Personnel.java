package miniprojet.metier;


public abstract class Personnel implements Personne{

    private String num;
    private String nom;
    private String prenom;
    private String adresse;
    private String libStatus;

    public Personnel(String num, String nom, String prenom, String adresse, String libStatus) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.libStatus = libStatus;
    }


    @Override
    public double calculerCot() {
        return 100;
    }

    public String getNum() {
        return num;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getLibStatus() {
        return libStatus;
    }
}


