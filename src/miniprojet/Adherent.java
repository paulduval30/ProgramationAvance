package miniprojet;

import java.util.ArrayList;

public abstract class Adherent
{
    private String nom;
    private String prenom;
    private String adresse;
    private String num;
    private ArrayList<Livre> livres;

    public Adherent(String nom, String prenom, String adresse, String num)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.num = num;
        this.livres = new ArrayList<>();
    }

    public void inscrire(Bibliotheque b)
    {
        b.inscrireAdherent(this);
        System.out.print("Je m'appel " + this.prenom + " " + this.nom + ". ");
    }

    private boolean emprunter(Livre l)
    {
        if(l.isDisponible())
        {
            l.setDisponible(false);
            this.livres.add(l);
        }

        return l.isDisponible();
    }

    private boolean rendre(Livre l)
    {
        if(this.livres.contains(l))
        {
            l.setDisponible(true);
            this.livres.remove(l);
        }

        return l.isDisponible();
    }

    public ArrayList<Livre> getLivres()
    {
        return livres;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public String getNum()
    {
        return num;
    }

    public void setNum(String num)
    {
        this.num = num;
    }
}
