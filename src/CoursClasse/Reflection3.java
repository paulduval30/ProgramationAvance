package CoursClasse;

import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.*;

public class Reflection3 {
    public static void main(String[] args) throws Exception {
        Scanner clavier = new Scanner(in);
        out.println("Nom de la classe : ");
        String nomClasse = clavier.next();
        /* on saisit le nom de la classe par le clavier */
        Class classe = Class.forName(nomClasse);
        /* affectation de la classe saisie à la variable classe instance de Class */
        out.println("Classe de base --------------------------------");
        out.println(" "+classe.getSuperclass());

        // affiche tous les consructeurs
        out.println("Constructeurs ---------------------------------");
        for (Constructor constructeur : classe.getDeclaredConstructors()) {
            out.print(" "+Modifier.toString(constructeur.getModifiers()));
            out.print(" "+constructeur.getName()+"(");
            Class[] typeParametres = constructeur.getParameterTypes();
            for (int i=0; i<typeParametres.length; i++) {
                if (i>0) out.print(", ");
                out.print(typeParametres[i].getName());
            }
            out.println(");");
        }
    }
}