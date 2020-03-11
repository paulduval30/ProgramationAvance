package getClass;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.*;
public class reflexion2 {
    public static void main(String[] args) throws Exception {
        Scanner clavier = new Scanner(in);
        out.println("Nom de la classe : ");
        String nomClasse = clavier.next();
        Class classe = Class.forName(nomClasse);
        out.println("Classe de base --------------------------------");
        out.println(" "+classe.getSuperclass());
        out.println("Méthodes --------------------------------------");
        for (Method méthode : classe.getDeclaredMethods()) {
            out.print(" "+méthode.getReturnType()+" ");
            out.print(Modifier.toString(méthode.getModifiers()));
            out.print(" "+méthode.getName()+"(");
            Class[] typeParamètres = méthode.getParameterTypes();
            for (int i=0; i<typeParamètres.length; i++) {
                if (i>0) out.print(", ");
                out.print(typeParamètres[i].getName());
            }
            out.println(");");
        }

    }
}