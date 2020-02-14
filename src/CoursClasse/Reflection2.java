package CoursClasse;

import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.*;

public class Reflection2 {
    public static void main(String[] args) throws Exception {
        Scanner clavier = new Scanner(in);
        out.println("Nom de la classe : ");
        String nomClasse = clavier.next();

        Class classe = Class.forName(nomClasse);

        out.println("Classe de base --------------------------------");
        out.println(" "+classe.getSuperclass());

        out.println("Méthodes --------------------------------------");
        for (Method method : classe.getDeclaredMethods()) {

            System.out.print(" "+method.getReturnType()+" ");

            System.out.print(Modifier.toString(method.getModifiers()));

            System.out.print(" " + method.getName()+"(");
            //Manque un s au nom de la méthode
            Class[] typeParametre = method.getParameterTypes();

            for (int i=0; i<typeParametre.length; i++) {
                if (i>0) out.print(", ");
                out.print(typeParametre[i].getName());
            }
            out.println(");");

        }
    }
}
