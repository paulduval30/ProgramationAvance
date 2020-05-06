package getClass;

import java.util.*;
import java.lang.reflect.*;

import static java.lang.System.*;

public class reflexion2
{
    public static void main(String[] args) throws Exception
    {
        Scanner clavier = new Scanner(in);
        out.println("Nom de la classe : ");
        String nomClasse = clavier.next();
        Class classe = Class.forName(nomClasse);
        out.println("Classe de base --------------------------------");
        out.println(" " + classe.getSuperclass());
        out.println("Méthodes --------------------------------------");
        for (Method methode : classe.getDeclaredMethods())
        {
            out.print(" " + methode.getReturnType() + " ");
            out.print(Modifier.toString(methode.getModifiers()));
            out.print(" " + methode.getName() + "(");
            Class[] typeParametres = methode.getParameterTypes();
            for (int i = 0; i < typeParametres.length; i++)
            {
                if (i > 0) out.print(", ");
                out.print(typeParametres[i].getName());
            }
            out.println(");");
        }

    }
}