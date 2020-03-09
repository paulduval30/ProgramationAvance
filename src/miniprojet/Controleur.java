package miniprojet;

import miniprojet.model.Bibliotheque;
import miniprojet.IHM.Window;
import miniprojet.model.metier.*;

import java.util.ArrayList;

public class Controleur
{
    private Bibliotheque bibliotheque;
    private Window window;

    /**
     * Constructeur de la classe controleur
     * @param b objet de type bibliothèque
     */
    public Controleur(Bibliotheque b)
    {
        this.bibliotheque = b;
        this.window = new Window(this);
    }

    /**
     * Deuxieme constructeur
     * @param bibliotheque objet bibliothèque
     * @param window objet window
     */
    public Controleur(Bibliotheque bibliotheque, Window window)
    {
        this.bibliotheque = bibliotheque;
        this.window = window;
    }

    /**
     * Methode pour rendre un livre
     * @param l objet de type livre
     * @param a objet de type adherant
     */
    public void rendreLivre(Livre l, Adherent a)
    {
        bibliotheque.rendreLivre(l, a);
    }

    /**
     * Retourne une liste de tout les livres de la bibliothèque
     * @return ArrayList<Livre> liste des livres
     */
    public ArrayList<Livre> getLivres()
    {
        return (ArrayList<Livre>)bibliotheque.getLivres().clone();
    }

    /**
     * ajoute un nouveau livre à la bibliothèque
     * @param l objet de type livre
     */
    public void addLivre(Livre l)
    {
        bibliotheque.addLivre(l);
    }

    /**
     * Inscrit un nouvel adherant à la bibliothèque
     * @param a objet de type adherant
     */
    public void inscrireAdherent(Adherent a)
    {
        bibliotheque.inscrireAdherent(a);
    }

    /**
     * Ajoute un nouvel employé à la bibliothèque
     * @param p objet de type personnel
     */
    public void embaucherPersonnel(Personnel p){
        bibliotheque.embaucherPersonnel(p);
    }

    /**
     * Methode d'emprunt d'un livre par un adherant
     * @param l objet de type livre
     * @param a objet de type adherant
     */
    public void emprunter(Livre l, Adherent a){
        bibliotheque.emprunter(l, a);
    }

    /**
     * Retourne une liste du personnel de la bibliothèque
     * @return ArrayList<Personnel> liste d'objets de type Personnel
     */
    public ArrayList<Personnel> getPersonnels(){
        return (ArrayList< Personnel>) bibliotheque.getPersonnels().clone();
    }

    /**
     * Retourne une liste des adherants de la bibliothèque
     * @return ArrayList<Adherent> liste d'objets de type Adherant
     */
    public ArrayList<Adherent> getAdherents()
    {
        return (ArrayList<Adherent>) bibliotheque.getAdherents().clone();
    }
}

