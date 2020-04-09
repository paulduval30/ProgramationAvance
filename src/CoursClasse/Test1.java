package CoursClasse;

public class Test1
{
    public static void main(String[] args) throws ClassNotFoundException {
        String nomClasse = "CoursClasse.Personne";
        Class cl = Class.forName(nomClasse);
        System.out.println(cl.getName());
        System.out.println(new Personne("", "").getClass().getName());
    }
}

class Personne {
    private String nom, prenom;
    public Personne(String nom, String prenom)
    {
        this.nom = nom;
        this.prenom = prenom;
    }
}


