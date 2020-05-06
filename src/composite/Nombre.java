package composite;
public class Nombre extends Expression
{
private double valeurNombre ;
public Nombre(double uneValeur)
{
super() ;
this.valeurNombre = uneValeur ;
}
public double valeur()
{ return this.valeurNombre ;}
public String toString()
{
// possible :
// return "" + this.valeurNombre ;
return Double.toString(this.valeurNombre) ;
}
}
// fin classe Nombre
