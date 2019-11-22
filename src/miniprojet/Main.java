package miniprojet;

import miniprojet.IHM.Window;
import miniprojet.metier.*;

import java.util.ArrayList;

public class Main
{

    private ArrayList<Object> personnels;
    private Bibliotheque b;

    public Main()
    {
        this.b = new Bibliotheque();
        this.personnels = new ArrayList<>();
        Window win = new Window(this);

        b.inscrireAdherent(new SansEmploie("Sticot", "Judas", "Oui", "0606060606"));
        b.inscrireAdherent(new SansEmploie("Bricot", "Judas", "Oui", "0606060606"));
        b.inscrireAdherent(new SansEmploie("Nanas", "Judas", "Oui", "0606060606"));
        b.inscrireAdherent(new SansEmploie("Rgousier", "Judas", "Oui", "0606060606"));

        b.inscrireAdherent(new Etudiant("Menvusa", "Gerard", "Oui", "0606060606", "refetu", "numetu"));
        b.inscrireAdherent(new Etudiant("Heure de Text", "Edith", "Oui", "0606060606", "refetu", "numetu"));
        b.inscrireAdherent(new Etudiant("Time", "Vincent", "Oui", "0606060606", "refetu", "numetu"));
        b.inscrireAdherent(new Etudiant("Cal", "Medhi", "Oui", "0606060606", "refetu", "numetu"));

        b.inscrireAdherent(new Salarie("Nouhi", "Eva", "Oui", "0606060606", 1500, "refsalaire"));
        b.inscrireAdherent(new Salarie("Rist", "Flo", "Oui", "0606060606", 1500, "refsalaire"));
        b.inscrireAdherent(new Salarie("Hochet dans l'eau", "Frederic", "Oui", "0606060606", 1500, "refsalaire"));
        b.inscrireAdherent(new Salarie("Tation", "Felici", "Oui", "0606060606", 1500, "refsalaire"));

        personnels.add(new Bibliothecaire("63","Dufond","Clotilde","rue des bois","Bibliothécaire"));
        personnels.add(new Bibliothecaire("62","Duhaut","Mathide","rue des champs","Bibliothécaire"));
        personnels.add(new Bibliothecaire("61","Dubas","Francoise","rue des lacs","Bibliothécaire"));
        personnels.add(new Bibliothecaire("60","Dufront","Bruno","rue des rues","Bibliothécaire"));

        personnels.add(new Secretaire("63","Lebras","Lucas","rue des iles","Secretaire"));
        personnels.add(new Secretaire("62","Lelong","Vincent","rue des chats","Secretaire"));
        personnels.add(new Secretaire("61","Lecourt","Thomas","rue des chemins","Secretaire"));
        personnels.add(new Secretaire("60","Lemarchand","Claude","rue des avenues","Secretaire"));
        personnels.add(new Directeur("01","Bruno","Aubriet","Rue du directeur","Dirécteur"));

    }
    public static void main(String[] argv)
    {
        new Main();

    }

    public Bibliotheque getBibliotheque() {
        return this.b;
    }
}
