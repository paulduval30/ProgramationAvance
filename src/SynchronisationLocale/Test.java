package SynchronisationLocale;


/**
 * Classe Test
 *
 * @author Mani
 * @version 0.1
 */

public class Test
{

    public static void main(String[] args)
    {
        Singleton.getInstance(1, "registre", "bus de donn�es").afficher();
        Singleton.getInstance(2, "Un autre registre", "bus de donn�es").afficher();
        Singleton.getInstance(3, "Encore un autre registre", "bus de donn�es").afficher();

    }
}
