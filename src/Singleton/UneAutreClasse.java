package Singleton;

public class UneAutreClasse
{

    public Singleton autreInstance;

    public UneAutreClasse()
    {
        autreInstance = Singleton.getInstance(10, "Et encore un autre registre", "bus de donn�es");
    }


}
