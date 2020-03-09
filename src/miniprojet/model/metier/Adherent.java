package miniprojet.model.metier;

import miniprojet.model.Bibliotheque;
import miniprojet.IHM.listview.Sortable;

import java.util.ArrayList;

public abstract class Adherent implements Personne, Sortable
{
    private String nom;
    private String prenom;
    private String adresse;
    private String num;
    private ArrayList<Livre> livres;
    private String metier;


    public Adherent(String nom, String prenom, String adresse, String num, String metier)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.num = num;
        this.livres = new ArrayList<>();
        this.metier = metier;
    }

    public void inscrire(Bibliotheque b)
    {
        b.inscrireAdherent(this);
        System.out.print("Je m'appel " + this.prenom + " " + this.nom + ". ");
    }

    public boolean emprunter(Livre l)
    {
        if(l.isDisponible())
        {
            this.livres.add(l);
        }

        return l.isDisponible();
    }

    private boolean rendre(Livre l)
    {
        if(this.livres.contains(l))
        {
            l.setAdherant(null);
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

    @Override
    public double calculerCot() {
        return 0;
    }

    @Override
    public String toString() {
        return this.prenom + " " + this.nom;
    }

    @Override
    public String getId()
    {
        return this.prenom + " " + this.nom;
    }

    @Override
    public String getText()
    {
        return this.prenom + " " + this.nom + " "+ this.metier;
    }

    @Override
    public String getDetail()
    {
        StringBuilder strRet = new StringBuilder();
        strRet.append(this.nom).append(" ").append(this.prenom).append("\n");
        strRet.append("Livre Emprunté : \n");
        for (Livre l : livres)
            strRet.append(l.getText()).append("\n");

        return strRet.toString();
    }

    public void rendreLivre(Livre l)
    {
        this.livres.remove(l);
    }
}