package TechniqueHolder;

import exception.AlreadyInstanceException;

import java.util.ArrayList;

public class Singleton
{
    private static Singleton uniqueInstance;

// autres variables d�instance

    public int ref_instance;
    public String nom_instance;
    public String description_instance;

    private Singleton()
    {
    }

    /**
     *Constructeur de la classe Singleton
     * @param r int
     * @param n String
     * @param d String
     */
    public Singleton(int r, String n, String d) throws AlreadyInstanceException
    {
        if(uniqueInstance != null)
            throw new AlreadyInstanceException();
        ref_instance = r;
        nom_instance = n;
        description_instance = d;

    }

    /**
     * Holder
     */
    private static class SingletonHolder
    {
        /**
         * Instance unique non pr�initialis�e
         */
        private static Singleton instance;
        static
        {
            try
            {
                instance = new Singleton(1, "2", "3");
            }
            catch (AlreadyInstanceException e)
            {
                e.printStackTrace();
            }
        }
    }

    /**
     * renvoie une instance de singleton
     * @return Singleton l'instance du SingletonHolder
     */
    public static synchronized Singleton getInstance()
    {
        return SingletonHolder.instance;
    }

// autres m�thodes

    /**
     * Methode qui renvoie la reference de l'instance
     * @return ref_instance la reference
     */
    public int getref_instance()
    {
        return ref_instance;
    }


    /**
     * Definis la reference de l'instance
     * @param ref_instance int la reference
     */
    public void setref_instance(int ref_instance)
    {
        this.ref_instance = ref_instance;
    }

    /**
     * renvoie le nom de l'instance
     * @return String le nom de l'instance
     */
    public String getnom_instance()
    {
        return nom_instance;
    }

    /**
     * Permet de definir le nom de l'instance
     * @param nom_instance String le nom de l'instance
     */
    public void setnom_instance(String nom_instance)
    {
        this.nom_instance = nom_instance;
    }

    /**
     * Renvoie la description de l'instance
     * @return String la description de l'instance
     */
    public String getdescription_instance()
    {
        return description_instance;
    }

    /**
     * Definis la description de l'instance
     * @param description_instance String la description de l'instance
     */
    public void setdescription_instance(String description_instance)
    {
        this.description_instance = description_instance;
    }

    /**
     * Affiche le detail de l'instance
     */
    public void afficher()
    {
        System.out.println(ref_instance + " " + nom_instance + ":" + description_instance);
    }

}