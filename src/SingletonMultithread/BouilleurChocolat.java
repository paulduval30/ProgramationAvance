package SingletonMultithread;

import exception.AlreadyInstanceException;

/**
 * @author pauld
 * @version 1.0.0
 */
public class BouilleurChocolat
{
    private static BouilleurChocolat uniqueInstance;
    private boolean vide;
    private boolean bouilli;
    public int ref_instance;

    // le bouilleur doit�tre vide avant l'appel du constructeur

    /**
     * Constructeur de la class BouilleurChocolat
     * @param r
     */
    public BouilleurChocolat(int r) throws AlreadyInstanceException
    {
        if(uniqueInstance != null)
            throw new AlreadyInstanceException();
        ref_instance = r;
        vide = true;
        bouilli = false;


    }

    public static synchronized BouilleurChocolat getInstance(int r)
    {
        if (uniqueInstance == null)
        {
            try
            {
                uniqueInstance = new BouilleurChocolat(r);
            }
            catch (AlreadyInstanceException e)
            {
                e.printStackTrace();
            }
            System.out.println(r);
        }
        return uniqueInstance;
    }

    /**
     * Pour pouvoir remplir, il doit �tre vide.
     */

    public void remplir()
    {
        if (estVide())
        {
            vide = false;
            bouilli = false;
            // remplir le bouilleur du m�lange lait/chocolat
        }

        /**
         * Pour pouvoir vider, il faut qu'il soit plein et bouilli.
         */
    }

    public void vider()
    {
        if (!estVide() && estBouilli())
        {
            // vider le m�lange
            vide = true;
        }
    }

    /**
     * Pour bouillir, il faut qu'il soit plein et qu'il n'ait pas d�j� bouilli.
     */
    public void bouillir()
    {
        if (!estVide() && !estBouilli())
        {
            // porter le contenu � �bullition
            bouilli = true;
        }
    }

    /**
     * renvoie si le bouilleur est vide
     * @return boolean estVide
     */
    public boolean estVide()
    {
        return vide;
    }

    /**
     *renvoie si le choclat est bouilli
     * @return boolean est bouilli
     */
    public boolean estBouilli()
    {
        return bouilli;
    }
}