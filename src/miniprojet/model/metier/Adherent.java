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


    /**
     * Constructeur de la classe Adherent
     * @param nom String nom de l'adherent
     * @param prenom String prenom de l'adherent
     * @param adresse String adresse de l'adherent
     * @param num String numero de l'adherent
     * @param metier String métier de l'adherent
     */
    public Adherent(String nom, String prenom, String adresse, String num, String metier)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.num = num;
        this.livres = new ArrayList<>();
        this.metier = metier;
    }

    /**
     * Méthode d'inscription d'un adherent à une bibliothèque
     * @param b objet de type Bibliothèque
     */
    public void inscrire(Bibliotheque b)
    {
        b.inscrireAdherent(this);
        System.out.print("Bienvenue " + this.prenom + " " + this.nom + ". Vous etes à présent inscrit à la bibliothèque.");
    }

    /**
     * Méthode d'emprunt d'un livre par l'adherent
     * @param l objet de type Livre
     * @return
     */
    public boolean emprunter(Livre l)
    {
        if(l.isDisponible())
        {
            this.livres.add(l);
        }

        return l.isDisponible();
    }

    /**
     * Méthode pour que l'adherent rende un livre
     * @param l objet de type Livre
     * @return
     */
    private boolean rendre(Livre l)
    {
        if(this.livres.contains(l))
        {
            l.setAdherant(null);
            this.livres.remove(l);
        }

        return l.isDisponible();
    }

    /**
     * retourne la liste des livres empruntés par l'adherent
     * @return ArrayList<Livre> liste d'objets de type Livre
     */
    public ArrayList<Livre> getLivres()
    {
        return livres;
    }

    /**
     * Retourne le nom de l'adherent
     * @return String
     */
    public String getNom()
    {
        return nom;
    }

    /**
     * Redéfinit le nom de l'adhérent
     * @param nom String
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * Retourne le prénom de l'adherent
     * @return
     */
    public String getPrenom()
    {
        return prenom;
    }

    /**
     * Redéfinit le prénom de l'adherent
     * @param prenom String
     */
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    /**
     * retourne l'adresse de l'adherent
     * @return String
     */
    public String getAdresse()
    {
        return adresse;
    }

    /**
     * Redéfinit l'adresse de l'adherent
     * @param adresse String
     */
    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    /**
     * retourne le numéro de l'adherent
     * @return String
     */
    public String getNum()
    {
        return num;
    }

    /**
     * Redéfinit le numéro de l'utilisateur
     * @param num String
     */
    public void setNum(String num)
    {
        this.num = num;
    }

    /**
     * Méthode de calcul de la cotisation de l'adherent
     * @return
     */
    @Override
    public double calculerCot() {
        return 0;
    }

    /**
     * Renvoie une chaine de caractère comprenant le prénom et nom de l'adherent
     * @return String
     */
    @Override
    public String toString() {
        return this.prenom + " " + this.nom;
    }

    /**
     * Renvoie une chaine de caractère comprenant le prénom et nom de l'adherent
     * @return String
     */
    @Override
    public String getId()
    {
        return this.prenom + " " + this.nom;
    }

    /**
     * Renvoie une chaine de caractère comprenant le prénom et nom de l'adherent
     * @return String
     */
    @Override
    public String getText()
    {
        return this.prenom + " " + this.nom + " "+ this.metier;
    }

    /**
     * Renvoie une chaine de caractère comprennant le prénom, nom et liste des livres empruntés par l'adherent
     * @return String
     */
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

    /**
     * Méthode pour que l'adherent puisse rendre un livre
     * @param l Objet de type Livre
     */
    public void rendreLivre(Livre l)
    {
        this.livres.remove(l);
    }
}
