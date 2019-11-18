package Cours1;

import java.util.Scanner;

public class CompareReel
{
    public static int[] compareReel(int[] tab)
    {
        int cpt1;
        int cpt2;
        int tmp;

        for ( cpt1=1;cpt1<tab.length;cpt1++ )
        {
            tmp = tab[cpt1];
            cpt2=cpt1-1;
            while ( cpt2>=0 && tmp < tab[cpt2] )
            {
                tab[cpt2+1] = tab[cpt2];
                cpt2--;
            }

            if ( cpt2 != cpt1-1 )
                tab[cpt2+1] = tmp;
        }

        return tab;
    }

    public static void main(String[] argv)
    {
        int[] tab = CompareReel.compareReel(new int[]{8,7,2,4,18,9,1,14});
        for(int i : tab)
            System.out.println(i);
    }

}
