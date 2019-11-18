package miniprojet;

import java.util.ArrayList;

public class Auteur
{
    private String refAuteur;
    private String nomAuteur;
    private String prenomAuteur;
    private ArrayList<Livre> livres;

    public Auteur(String refAuteur, String nomAuteur, String prenomAuteur)
    {
        this.livres = new ArrayList<>();
        this.refAuteur = refAuteur;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
    }

    public void ecrire(String titre, String editeur, int annee)
    {
        Livre l = new Livre(titre, editeur, annee, true);
        l.addAuteur(this);
        this.livres.add(l);
    }

    public void ecrire(Livre l)
    {
        l.addAuteur(this);
    }
    public ArrayList<Livre> getLivres()
    {
        return livres;
    }

    public String getRefAuteur()
    {
        return refAuteur;
    }

    public void setRefAuteur(String refAuteur)
    {
        this.refAuteur = refAuteur;
    }

    public String getNomAuteur()
    {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur)
    {
        this.nomAuteur = nomAuteur;
    }

    public String getPrenomAuteur()
    {
        return prenomAuteur;
    }

    public void setPrenomAuteur(String prenomAuteur)
    {
        this.prenomAuteur = prenomAuteur;
    }
}
