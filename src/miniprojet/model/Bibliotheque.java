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

    public Bibliotheque()
    {
        this.livres = new ArrayList<>();
        this.adherents = new ArrayList<>();
        this.personnels = new ArrayList<>();

    }

    public ArrayList<Adherent> getAdherents()
    {
        return adherents;
    }

    public void addLivre(Livre l)
    {
        if(l != null)
            this.livres.add(l);
    }

    public void inscrireAdherent(Adherent a)
    {
        if(a != null)
            this.adherents.add(a);
    }

    public void embaucherPersonnel(Personnel p){
        if (p != null){
            personnels.add(p);
        }

    }

    public void emprunter(Livre l, Adherent a){
        a.emprunter(l);
        l.setAdherant(a);
    }

    public ArrayList<Personnel> getPersonnels(){
        return this.personnels;
    }

    public ArrayList<Livre> getLivres()
    {
        return livres;
    }

    public void rendreLivre(Livre l, Adherent a)
    {
        a.rendreLivre(l);
        l.setAdherant(null);
    }
}
