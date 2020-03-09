package miniprojet;

import miniprojet.model.Bibliotheque;
import miniprojet.IHM.Window;
import miniprojet.model.metier.*;

import java.util.ArrayList;

public class Controleur
{
    private Bibliotheque bibliotheque;
    private Window window;

    public Controleur(Bibliotheque b)
    {
        this.bibliotheque = b;
        this.window = new Window(this);
    }

    public Controleur(Bibliotheque bibliotheque, Window window)
    {
        this.bibliotheque = bibliotheque;
        this.window = window;
    }

    public void rendreLivre(Livre l, Adherent a)
    {
        bibliotheque.rendreLivre(l, a);
    }

    public ArrayList<Livre> getLivres()
    {
        return (ArrayList<Livre>)bibliotheque.getLivres().clone();
    }

    public void addLivre(Livre l)
    {
        bibliotheque.addLivre(l);
    }

    public void inscrireAdherent(Adherent a)
    {
        bibliotheque.inscrireAdherent(a);
    }

    public void embaucherPersonnel(Personnel p){
        bibliotheque.embaucherPersonnel(p);
    }

    public void emprunter(Livre l, Adherent a){
        bibliotheque.emprunter(l, a);
    }

    public ArrayList<Personnel> getPersonnels(){
        return (ArrayList< Personnel>) bibliotheque.getPersonnels().clone();
    }

    public ArrayList<Adherent> getAdherents()
    {
        return (ArrayList<Adherent>) bibliotheque.getAdherents().clone();
    }
}

