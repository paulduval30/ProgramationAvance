package composite;

/**
 * Gestion d�une expression arithmetique
 */
public abstract class Expression
{
// methodes definissant un comportement par defaut
// que les Nombre(s) et Operation(s) peuvent red�finir

    public Expression getOperande1()
    {
        return null;
    }

    public Expression getOperande2()
    {
        return null;
    }

    public double valeur()
    {
        return 0;
    }

    public String toString()
    {
        return "";
    }
}

