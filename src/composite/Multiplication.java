package composite;
public class Multiplication extends Operation
{
/**
* @param op1
* @param op2
*/
public Multiplication(Expression op1, Expression op2)
{
super(op1, op2);
}
/**
*  retourn la valeur de la Multiplication
*/
public double valeur()
{
return this.getOperande1().valeur() * this.getOperande2().valeur() ;
}
/**
* retourne le String representant la Multiplication
*/
public String toString()
{
return  "(" + this.getOperande1() + " * " + this.getOperande2() + ")" ;

}
}
