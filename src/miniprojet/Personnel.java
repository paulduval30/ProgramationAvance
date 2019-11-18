package miniprojet;
import java.util.ArrayList;


public abstract class Personnel {

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
}


