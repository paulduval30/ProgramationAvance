package CoursClasse;

import java.lang.reflect.Field;

public class Reflection5 {
    public static void main(String[] args) throws Exception {
        Personne2 moi = new Personne2("Papillon", "Alain", 46);
        Class classe = moi.getClass();
        Field attribut = classe.getDeclaredField("nom");

        attribut.setAccessible(true);
        Object valeur = attribut.get(moi);
        System.out.println(valeur);
    }
}
