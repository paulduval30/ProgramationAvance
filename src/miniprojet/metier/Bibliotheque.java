package miniprojet.metier;

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

}
