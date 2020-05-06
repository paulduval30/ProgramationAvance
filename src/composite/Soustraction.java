package composite;
public class Soustraction extends Operation
{
	public Soustraction()
	{
		super();
	}

	/**
	 * retourn la valeur de la Soustraction
	 */
	public double getValeur()
	{
		if(!this.iterator().hasNext())
			return 0;
		Expression e = this.iterator().next();
		double valeur = e.valeur();
		this.expressions.remove(e);
		while (this.iterator().hasNext())
		{
			e = this.iterator().next();
			valeur -= e.valeur();
			this.expressions.remove(e);
		}

		return valeur;
	}
	/**
	 * retourne le String representant la Soustraction
	 */
}
