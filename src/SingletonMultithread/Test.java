package SingletonMultithread;


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
        /**
         * @see cours()
         * @see TP()
         * @see TD()
         *
         * Cr�ation des objets cours, TP, TD
         */

        for (int i = 1; i <= 10000000; i++)
        {

            BouilleurChocolat bouilleur0 = BouilleurChocolat.getInstance(4);

            bouilleur0.remplir();
            bouilleur0.bouillir();
            bouilleur0.vider();

            BouilleurChocolat bouilleur1 = BouilleurChocolat.getInstance(5);

            bouilleur1.remplir();
            bouilleur1.bouillir();
            bouilleur1.vider();
        }
        System.out.println("Fini ");
    }
}
