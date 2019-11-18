package miniprojet;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] argv)
    {
        Bibliotheque b = new Bibliotheque();

        ArrayList<Adherent> adherents = new ArrayList<>();

        adherents.add(new SansEmploie("Sticot", "Judas", "Oui", "0606060606"));
        adherents.add(new SansEmploie("Bricot", "Judas", "Oui", "0606060606"));
        adherents.add(new SansEmploie("Nanas", "Judas", "Oui", "0606060606"));
        adherents.add(new SansEmploie("Rgousier", "Judas", "Oui", "0606060606"));

        adherents.add(new Etudiant("Menvusa", "Gerard", "Oui", "0606060606", "refetu", "numetu"));
        adherents.add(new Etudiant("Heure de Text", "Edith", "Oui", "0606060606", "refetu", "numetu"));
        adherents.add(new Etudiant("Time", "Vincent", "Oui", "0606060606", "refetu", "numetu"));
        adherents.add(new Etudiant("Cal", "Medhi", "Oui", "0606060606", "refetu", "numetu"));

        adherents.add(new Salarie("Nouhi", "Eva", "Oui", "0606060606", 1500, "refsalaire"));
        adherents.add(new Salarie("Rist", "Flo", "Oui", "0606060606", 1500, "refsalaire"));
        adherents.add(new Salarie("Hochet dans l'eau", "Frederic", "Oui", "0606060606", 1500, "refsalaire"));
        adherents.add(new Salarie("Tation", "Felici", "Oui", "0606060606", 1500, "refsalaire"));

        for(Adherent a : adherents)
        {
            a.inscrire(b);
        }
    }
}
