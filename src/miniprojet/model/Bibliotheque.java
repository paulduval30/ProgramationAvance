package miniprojet.model;

import miniprojet.model.metier.Adherent;
import miniprojet.model.metier.Livre;
import miniprojet.model.metier.Personnel;

import java.util.ArrayList;

public class Bibliotheque
{
    private ArrayList<Livre> livres;
    private ArrayList<Adherent> adherents;
    private ArrayList<Personnel> personnels;

    /**
     * Constructeur de la classe Bibliothèque
     */
    public Bibliotheque()
    {
        this.livres = new ArrayList<>();
        this.adherents = new ArrayList<>();
        this.personnels = new ArrayList<>();

    }

    /**
     * retourne une liste de tout les adherants de la bibliothèque
     * @return ArrayList<Adherent> liste d'objets de type Adherent
     */
    public ArrayList<Adherent> getAdherents()
    {
        return adherents;
    }

    /**
     * Ajoute un livre à la bibliothèque
     * @param l Objet de type livre
     */
    public void addLivre(Livre l)
    {
        if(l != null)
            this.livres.add(l);
    }

    /**
     * Ajoute un nouvel adherant à la bibliothèque
     * @param a objet de type Adherent
     */
    public void inscrireAdherent(Adherent a)
    {
        if(a != null)
            this.adherents.add(a);
    }

    /**
     * Ajoute un nouvel employé à la bibliothèque
     * @param p objet de type Personnel
     */
    public void embaucherPersonnel(Personnel p){
        if (p != null){
            personnels.add(p);
        }

    }

    /**
     *Methode d'emprunt d'un livre par un adherant
     * @param l objet de type Livre
     * @param a Objet de type Adherent
     */
    public void emprunter(Livre l, Adherent a){
        a.emprunter(l);
        l.setAdherant(a);
    }

    /**
     * Retourne une liste du personnel de la bibliothèque
     * @return ArrayList<Personnel> liste d'objets de type Personnel
     */
    public ArrayList<Personnel> getPersonnels(){
        return this.personnels;
    }

    /**
     * Retourne tout les livre de la bibliothèque
     * @return ArrayList<Livre> liste d'objets de type Livre
     */
    public ArrayList<Livre> getLivres()
    {
        return livres;
    }

    /**
     * Methode pour qu'un adherent rende un livre
     * @param l objet de type Livre
     * @param a objet de type Adherent
     */
    public void rendreLivre(Livre l, Adherent a)
    {
        a.rendreLivre(l);
        l.setAdherant(null);
    }
}
