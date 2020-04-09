package getClass;
import java.lang.reflect.*;

public class reflexion4 {
    public static void main(String[] args) throws Exception {
        Personne moi = new Personne("Papillon", "Alain", 46);
        Class classe = moi.getClass();
        Field attribut = classe.getDeclaredField("nom");
        /* attribut.setAccessible(true); */
        Object valeur = attribut.get(moi);
        System.out.println(valeur);
    }
}
class Personne {
    private String nom, prenom;
    private int age;
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
}
// Résultat : exception de type IllegalAccessException