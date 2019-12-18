package miniprojet.metier;

import java.util.ArrayList;

public class Livre
{
    private String titre;
    private ArrayList<Auteur> auteur;
    private String editeur;
    private  int anneeEdition;
    private Adherent adherant;

    public Livre(String titre, String editeur, int anneeEdition, boolean disponible)
    {
        this.titre = titre;
        this.auteur = new ArrayList<>();
        this.editeur = editeur;
        this.anneeEdition = anneeEdition;
    }

    public void addAuteur(Auteur a)
    {
        this.auteur.add(a);
    }
    public String getTitre()
    {
        return titre;
    }

    public void setTitre(String titre)
    {
        this.titre = titre;
    }

    public ArrayList<Auteur> getAuteur()
    {
        return auteur;
    }

    public String getEditeur()
    {
        return editeur;
    }

    public void setEditeur(String editeur)
    {
        this.editeur = editeur;
    }

    public int getAnneeEdition()
    {
        return anneeEdition;
    }

    public void setAnneeEdition(int anneeEdition)
    {
        this.anneeEdition = anneeEdition;
    }

    public boolean isDisponible()
    {
        return this.adherant == null;
    }

    public Adherent getAdherant() {
        return adherant;
    }

    public void setAdherant(Adherent adherant) {
        this.adherant = adherant;
    }
}
