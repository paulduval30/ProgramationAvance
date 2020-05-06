package composite;
public class Addition extends Operation
{

public Addition()
{
super();
}
/**
*  retourn la valeur de l�addition
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
        valeur += e.valeur();
        this.expressions.remove(e);
    }
    return valeur;
}

}

