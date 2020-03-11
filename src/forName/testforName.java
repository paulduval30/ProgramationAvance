package forName;

public class testforName {
    public static void main(String[] args) throws ClassNotFoundException {
        String nomClasse = "forName.Personne";
        Class cl = Class.forName(nomClasse);
        System.out.println(cl.getName());
    }
}
class Personne {
    private String nom, prénom;
    public Personne(String nom, String prénom) {
        this.nom = nom;
        this.prénom = prénom;
    }
}
