package CoursClasse;

import java.lang.reflect.Field;

public class Reflection4 {
    public static void main(String[] args) throws Exception {
        Personne2 moi = new Personne2("Papillon", "Alain", 46);
        Class classe = moi.getClass();
        Field attribut = classe.getDeclaredField("nom");

        /* attribut.setAccessible(true); */
        Object valeur = attribut.get(moi);
        System.out.println(valeur);
    }
}
class Personne2 {
    private String nom, prénom;
    private int âge;
    public Personne2(String nom, String prénom, int âge) {
        this.nom = nom;
        this.prénom = prénom;
        this.âge = âge;
    }
}
// Résultat : exception de type IllegalAccessException