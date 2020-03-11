package getClass;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.*;

public class reflexion1 {
    public static void main(String[] args) throws Exception {
        Scanner clavier = new Scanner(in);
        out.println("Nom de la classe : ");
        String nomClasse = clavier.next();
        /* on saisit le nom de la classe par le clavier */
        Class classe = Class.forName(nomClasse);
        /* affectation de la classe saisie à la variable classe instance
         * de Class */
// affiche la superclasse
        out.println("Classe de base --------------------------------");
        out.println(" "+classe.getSuperclass());
// affiche tous les attributs
        out.println("Attributs -------------------------------------");
        for (Field attribut : classe.getDeclaredFields()) {
            out.print(" "+Modifier.toString(attribut.getModifiers()));
            out.println(" "+attribut.getType()+" "+attribut.getName()+";");
        }
    }
}