package Cours1;

import java.util.ArrayList;

public class Racine
{
    private int a;
    private int b;
    private int c;

    public Racine(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public int getB()
    {
        return b;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public int getC()
    {
        return c;
    }

    public void setC(int c)
    {
        this.c = c;
    }

    public String solve()
    {
        double delta = Math.pow(b, 2) - (4 * a * c);
        if(delta < 0)
            return a + "x² + " + b + "x + " + c + " n'as pas de solution";
        if(delta == 0)
            return a + "x² + " + b + "x + " + c + " = " + (-b) / 2 * a;
        if(delta > 0)
            return a + "x² + " + b + "x + " + c + " = " + ((-b - Math.sqrt(delta))/( 2 * a)) + " ou " + ((-b + Math.sqrt(delta))/( 2 * a));
        else
            return "";
    }

    public static void main(String[] argv)
    {
        Racine r = new Racine(2, -1, -6);
        System.out.println(r.solve());
        ArrayList<Integer> ints = new ArrayList<>();
    }
}
