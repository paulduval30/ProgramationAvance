package composite;
public class Soustraction extends Operation{
	/**
	* @param op1
	* @param op2
	*/
	public Soustraction(Expression op1, Expression op2)
	{
	super(op1, op2);
	}
	/**
	*  retourn la valeur de la Soustraction
	*/
	public double valeur()
	{
	return this.getOperande1().valeur() - this.getOperande2().valeur() ;
	}
	/**
	* retourne le String representant la Soustraction
	*/
	public String toString()
	{
	return  "(" + this.getOperande1() + " - " + this.getOperande2() + ")" ;
	}
	}
