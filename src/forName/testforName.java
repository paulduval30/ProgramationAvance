package forName;

public class testforName {
    public static void main(String[] args) throws ClassNotFoundException {
        String nomClasse = "forName.Personne";
        Class cl = Class.forName(nomClasse);
        System.out.println(cl.getName());
    }
}
class Personne {
    private String nom, prenom;
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
