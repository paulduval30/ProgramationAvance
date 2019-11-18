package Cours1;

public class Serie
{
    public static void main(String[] argv)
    {
        System.out.println(1);
        double somme = 1;
        for(double i = 2; i < 7; i++)
        {
            somme += 1 / i;
            System.out.println( " + " + 1 + " / " + i + " = " + somme);
        }
    }
}
