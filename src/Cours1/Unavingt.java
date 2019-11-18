package Cours1;

public class Unavingt
{
    /**
     * Permet de gerer une liste d'exclusion
     */
    private int[] excluded;
    private int borne;


    public Unavingt(int[] excluded, int borne)
    {
        this.excluded = excluded;
        this.borne = borne;
    }

    public String compter()
    {
        String sRet = "";
        boolean add = true;
        for(int i = 1; i <= this.borne; i++)
        {
            add = true;
            for(int j = 0; j < this.excluded.length; j++)
            {
                if(excluded[j] == i)
                    add = false;
            }

            if(add)
                sRet += i + ",";

        }
        return sRet;

    }

    public static void main(String[] argv)
    {
        Unavingt u = new Unavingt(new int[]{10,12}, 20);
        System.out.println(u.compter());
    }
}
