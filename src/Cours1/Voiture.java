package Cours1;

public class Voiture
{
    private int departement;
    private int puissance;
    private double consomamation;



    public Voiture(int departement, int puissance, double consomamation)
    {
        this.departement = departement;
        this.puissance = puissance;
        this.consomamation = consomamation;
    }

    public void afficher(){
        System.out.println(this.toString());

    }

    public int getDepartement()
    {
        return departement;
    }

    public void setDepartement(int departement)
    {
        this.departement = departement;
    }

    public int getPuissance()
    {
        return puissance;
    }

    public void setPuissance(int puissance)
    {
        this.puissance = puissance;
    }

    public double getConsomamation()
    {
        return consomamation;
    }

    public void setConsomamation(double consomamation)
    {
        this.consomamation = consomamation;
    }

    public String toString()
    {
        String sRet = "";
        sRet += "Departement : " + this.departement;
        sRet += "\nPuissance : " + this.puissance;
        sRet += "\nConsomation  : " + this.consomamation;

        return sRet;
    }

    public static void main(String[] argv)
    {
        Voiture v = new Voiture(5,125,50.00);
        v.afficher();
    }
}
