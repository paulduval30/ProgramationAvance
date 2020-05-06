package composite;

public class Division extends Operation
{
    /**
     * @param op1
     * @param op2
     */
    public Division()
    {
        super();
    }

    /**
     * retourn la valeur de la Division
     */
    public double getValeur()
    {
        if(!this.iterator().hasNext())
            return 0;
        Expression e = this.iterator().next();
        double valeur = e.valeur();
        this.expressions.remove(e);
        while(this.iterator().hasNext())
        {
            e = this.iterator().next();
            valeur /= e.valeur();
            this.expressions.remove(e);
        }
        return valeur;
    }
}
