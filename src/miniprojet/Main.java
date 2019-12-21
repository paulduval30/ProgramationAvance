package miniprojet;

import javafx.scene.effect.Light;
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

        b.embaucherPersonnel(new Bibliothecaire("63","Dufond","Clotilde","rue des bois","Bibliothécaire"));
        b.embaucherPersonnel(new Bibliothecaire("62","Duhaut","Mathide","rue des champs","Bibliothécaire"));
        b.embaucherPersonnel(new Bibliothecaire("61","Dubas","Francoise","rue des lacs","Bibliothécaire"));
        b.embaucherPersonnel(new Bibliothecaire("60","Dufront","Bruno","rue des rues","Bibliothécaire"));

        b.embaucherPersonnel(new Secretaire("63","Lebras","Lucas","rue des iles","Secretaire"));
        b.embaucherPersonnel(new Secretaire("62","Lelong","Vincent","rue des chats","Secretaire"));
        b.embaucherPersonnel(new Secretaire("61","Lecourt","Thomas","rue des chemins","Secretaire"));
        b.embaucherPersonnel(new Secretaire("60","Lemarchand","Claude","rue des avenues","Secretaire"));
        b.embaucherPersonnel(new Directeur("01","Bruno","Aubriet","Rue du directeur","Dirécteur"));

        ArrayList<Auteur> auteurs = new ArrayList<>();
        Auteur emile = new Auteur("1", "Zola", "Emile");
        Auteur hugo = new Auteur("2", "Hugo", "Victor");
        Auteur jules = new Auteur("3", "Verne", "Jules");
        auteurs.add(emile);
        auteurs.add(hugo);
        auteurs.add(jules);

        jules.ecrire("20 000 lieux sous les mer", "", 2019);
        jules.ecrire("Voyage au centre de la terre", "", 2019);
        jules.ecrire("De la terre a la lune", "", 2019);

        hugo.ecrire("Odes et ballades", "", 1828);
        hugo.ecrire("Les orientales", "", 1829);
        hugo.ecrire("Les feuilles d'automne", "", 1931);

        emile.ecrire("La fortune des rougons" , "" , 1871);
        emile.ecrire("Le curée" , "" , 1872);
        emile.ecrire("L'Assomoir" , "" , 1878);

        for(Auteur a : auteurs)
            for(Livre l : a.getLivres())
                b.addLivre(l);

        b.emprunter(b.getLivres().get(0), b.getAdherents().get(0));
        b.emprunter(b.getLivres().get(1), b.getAdherents().get(0));
        b.emprunter(b.getLivres().get(2), b.getAdherents().get(0));
        b.emprunter(b.getLivres().get(3), b.getAdherents().get(0));
        b.emprunter(b.getLivres().get(4), b.getAdherents().get(0));
        Window win = new Window(this);

    }
    public static void main(String[] argv)
    {
        new Main();

    }

    public Bibliotheque getBibliotheque() {
        return this.b;
    }
}
