package miniprojet.metier;

import miniprojet.IHM.listview.Sortable;

import java.util.ArrayList;

public class Livre implements Sortable
{
    private String titre;
    private ArrayList<Auteur> auteur;
    private String editeur;
    private  int anneeEdition;
    private Adherent adherant;

    public Livre(String titre, String editeur, int anneeEdition)
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

    @Override
    public String getId()
    {
        return this.titre;
    }

    @Override
    public String getDetail()
    {
        return this.titre + "\n" + (this.adherant != null ? "Emprunté par : " + adherant.getNom() + " " + adherant.getPrenom() : "Libre");
    }

    @Override
    public String getText()
    {
        return this.titre;
    }

    @Override
    public String toString()
    {
        return this.titre;
    }
}
