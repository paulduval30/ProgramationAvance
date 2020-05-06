package composite;
public abstract class Operation extends Expression
{
private Expression operande1 ;
private Expression operande2 ;
/**
* Initialise l�Operation avec les operandes op1 et op2
*/
public Operation(Expression op1, Expression op2)
{
this.operande1 = op1 ;
this.operande2 = op2 ;
}
/**
* retourne la premiere operande de l�Operation binaire
*/
public Expression getOperande1()
{
return this.operande1 ;
}
/**
* retourne la seconde operande de l�Operation binaire
*/
public Expression getOperande2()
{
return this.operande2 ;
}
}
// fin classe Operation

