package composite;

public class Calculatrice
{
    public static void main(String[] args)
    {
        Expression trois = new Nombre(3);
        Expression quatre = new Nombre(4);
        Expression cinq = new Nombre(5);
        Expression six = new Nombre(6);
        Expression dix = new Nombre(10);
        Operation s = new Soustraction();
        s.add(trois);
        s.add(quatre);
        System.out.println(s.getValeur());
//        System.out.println(s + " = " + s.getValeur());
        Operation a = new Addition();
        a.add(dix);
        a.add(six);
        a.add(cinq);
        System.out.println(a.getValeur());
//        System.out.println(a + " = " + a.getValeur());
//        Operation m = new Multiplication();
//        System.out.println(m + " = " + m.getValeur());
//        Operation d = new Division();
//        System.out.println(d + " = " + d.getValeur());
    }
}
// fin classe Calculatrice
