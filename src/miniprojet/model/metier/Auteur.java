package miniprojet.model.metier;

import java.util.ArrayList;

public class Auteur
{
    private String refAuteur;
    private String nomAuteur;
    private String prenomAuteur;
    private ArrayList<Livre> livres;

    /**
     * Constructeur de la classe Auteur
     * @param refAuteur référence de l'auteur
     * @param nomAuteur nom de l'auteur
     * @param prenomAuteur prénom de l'auteur
     */
    public Auteur(String refAuteur, String nomAuteur, String prenomAuteur)
    {
        this.livres = new ArrayList<>();
        this.refAuteur = refAuteur;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
    }

    /**
     * Création d'un livre par l'auteur
     * @param titre Titre du livre
     * @param editeur Nom de l'éditeur du livre
     * @param annee Année de parution du livre
     */
    public void ecrire(String titre, String editeur, int annee)
    {
        Livre l = new Livre(titre, editeur, annee);
        l.addAuteur(this);
        this.livres.add(l);
    }


    public void ecrire(Livre l)
    {
        l.addAuteur(this);
    }

    /**
     * Retourne une liste de tout les livre écrits par l'auteur
     * @return ArrayList<Livre> liste d'objets de type Livre
     */
    public ArrayList<Livre> getLivres()
    {
        return livres;
    }

    /**
     * Retourne la référence de l'auteur
     * @return String
     */
    public String getRefAuteur()
    {
        return refAuteur;
    }

    /**
     * Redéfinit la référence de l'auteur
     * @param refAuteur Référence de l'auteur
     */
    public void setRefAuteur(String refAuteur)
    {
        this.refAuteur = refAuteur;
    }

    /**
     * Retourne le nom de l'auteur
     * @return String
     */
    public String getNomAuteur()
    {
        return nomAuteur;
    }

    /**
     * Redéfinit le nom de l'auteur
     * @param nomAuteur Nom de l'auteur
     */
    public void setNomAuteur(String nomAuteur)
    {
        this.nomAuteur = nomAuteur;
    }

    /**
     * Retourne le prénom de l'auteur
     * @return String
     */
    public String getPrenomAuteur()
    {
        return prenomAuteur;
    }

    /**
     * Redéfinit le prenom de l'auteur
     * @param prenomAuteur String
     */
    public void setPrenomAuteur(String prenomAuteur)
    {
        this.prenomAuteur = prenomAuteur;
    }
}
