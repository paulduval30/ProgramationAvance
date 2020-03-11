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
    private String nom, prénom;
    private int âge;
    public Personne(String nom, String prénom, int âge) {
        this.nom = nom;
        this.prénom = prénom;
        this.âge = âge;
    }
}
// Résultat : Exception de type IllegalAccessException