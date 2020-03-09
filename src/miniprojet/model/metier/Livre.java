package miniprojet.model.metier;

import miniprojet.IHM.listview.Sortable;

import java.util.ArrayList;

public class Livre implements Sortable
{
    private String titre;
    private ArrayList<Auteur> auteur;
    private String editeur;
    private  int anneeEdition;
    private Adherent adherant;

    /**
     * Constructeur de la classe Livre, implémentée de l'interface Sortable
     * @param titre titre du livre
     * @param editeur Nom de l'éditeur du livre
     * @param anneeEdition année d'édition du livre
     */
    public Livre(String titre, String editeur, int anneeEdition)
    {
        this.titre = titre;
        this.auteur = new ArrayList<>();
        this.editeur = editeur;
        this.anneeEdition = anneeEdition;
    }

    /**
     * Ajoute un auteur au livre
     * @param a objet de type Auteur
     */
    public void addAuteur(Auteur a)
    {
        this.auteur.add(a);
    }

    /**
     * Retourne le titre du livre
     * @return String
     */
    public String getTitre()
    {
        return titre;
    }

    /**
     * Redéfinit le titre du livre
     * @param titre String
     */
    public void setTitre(String titre)
    {
        this.titre = titre;
    }

    /**
     * Retourne l'auteur du livre
     * @return objet de type Auteur
     */
    public ArrayList<Auteur> getAuteur()
    {
        return auteur;
    }

    /**
     * Retourne le nom de l'éditeur du livre
     * @return String
     */
    public String getEditeur()
    {
        return editeur;
    }

    /**
     * Redefinit le nom de l'éditeur du livre
     * @param editeur String Nom du nouvel éditeur
     */
    public void setEditeur(String editeur)
    {
        this.editeur = editeur;
    }

    /**
     *Retourne l"année d'édition du livre
     * @return int
     */
    public int getAnneeEdition()
    {
        return anneeEdition;
    }

    /**
     * Redéfinit l'année d'édition du livre
     * @param anneeEdition int année d'édition
     */
    public void setAnneeEdition(int anneeEdition)
    {
        this.anneeEdition = anneeEdition;
    }

    /**
     * Verifie si un livre est disponible
     * @return true si l'adherent du livre est null, false sinon
     */
    public boolean isDisponible()
    {
        return this.adherant == null;
    }

    /**
     * Retourne l'adherent ayant emprunté le livre
     * @return objet de type Adherent
     */
    public Adherent getAdherant() {
            return adherant;
    }

    /**
     * Redéfinit l'adherent ayant emprunté le livre
     * @param adherant objet de type Adherent
     */
    public void setAdherant(Adherent adherant) {
        this.adherant = adherant;
    }

    /**
     * Retourne l'identifiant de l'adherent
     * @return String
     */
    @Override
    public String getId()
    {
        return this.titre;
    }

    /**
     * Retourne les détails du livre sous forme d'une chaine de caractère
     * @return String
     */
    @Override
    public String getDetail()
    {
        return this.titre + "\n" + (this.adherant != null ? "Emprunté par : " + adherant.getNom() + " " + adherant.getPrenom() : "Libre");
    }

    /**
     * Retourne le titre du livre
     * @return String
     */
    @Override
    public String getText()
    {
        return this.titre;
    }

    /**
     * Retourne le titre du livre
     * @return String
     */
    @Override
    public String toString()
    {
        return this.titre;
    }
}
