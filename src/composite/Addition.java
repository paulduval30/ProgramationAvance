package composite;
public class Addition extends Operation
{
/**
* @param op1
* @param op2
*/
public Addition(Expression op1, Expression op2)
{
super(op1, op2);
}
/**
*  retourn la valeur de l�addition
*/
public double valeur()
{
return this.getOperande1().valeur() + this.getOperande2().valeur() ;
}
/**
* retourne le String representant l�addition
*/
public String toString()
{
return  "(" + this.getOperande1() + " + " + this.getOperande2() + ")" ;
}
}

