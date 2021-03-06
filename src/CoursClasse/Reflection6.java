package CoursClasse;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Reflection6 {
    public static void main(String[] args) throws Exception {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Nom de la classe : ");
        String nomClasse = clavier.next();
        Class classe = Class.forName(nomClasse);
        Object objet = classe.newInstance();
        System.out.println("Classe de base --------------------------------");
        System.out.println(" "+classe.getSuperclass());
        // affiche tous les attributs
        System.out.println("Attributs -------------------------------------");
        for (Field attribut : classe.getDeclaredFields()) {
            System.out.print(" "+ Modifier.toString(attribut.getModifiers()));
            System.out.print(" "+attribut.getType()+" "+attribut.getName()+" = ");
            attribut.setAccessible(true);
            System.out.println(attribut.get(objet)+";");
        }
        // affiche tous les constructeurs
        System.out.println("Constructeurs ---------------------------------");
        for (Constructor constructeur: classe.getDeclaredConstructors()) {
            System.out.print(" "+Modifier.toString(constructeur.getModifiers()));
            System.out.print(" "+constructeur.getName()+"(");
            Class[] typeParametres = constructeur.getParameterTypes();
            for (int i=0; i<typeParametres.length; i++) {
                if (i>0) System.out.print(", ");
                System.out.print(typeParametres[i].getName());
            }
            System.out.println(");");
        }
        // affiche toutes les méthodes
        System.out.println("Méthodes --------------------------------------");
        for (Method methode : classe.getDeclaredMethods()) {
            System.out.print(" "+methode.getReturnType()+" ");
            System.out.print(Modifier.toString(methode.getModifiers()));
            System.out.print(" "+methode.getName()+"(");
            Class[] typeParametres = methode.getParameterTypes();
            for (int i=0; i<typeParametres.length; i++) {
                if (i>0) System.out.print(", ");
                System.out.print(typeParametres[i].getName());
            }
            System.out.println(");");
        }
    }
}