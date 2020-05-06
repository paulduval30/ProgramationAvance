package composite;
public class Calculatrice
{
public static void main(String[] args)
{
Expression trois  = new Nombre(3)  ;
Expression quatre = new Nombre(4)  ;
Expression cinq   = new Nombre(5)  ;
Expression six    = new Nombre(6)  ;
Expression dix    = new Nombre(10) ;
Expression s = new Soustraction(dix,six) ;
System.out.println(s + " = " + s.valeur()) ;
Expression a = new Addition(trois, quatre) ;
System.out.println(a + " = " + a.valeur()) ;
Expression m = new Multiplication(cinq, s) ;
System.out.println(m + " = " + m.valeur()) ;
Expression d = new Division(a, m) ;
System.out.println(d + " = " + d.valeur()) ;
}
}
// fin classe Calculatrice
