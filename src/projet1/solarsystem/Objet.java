package projet1.solarsystem;

public abstract class Objet
{
    protected double masse;
    protected String name;
    protected double diametre;

    public Objet(double masse, String name, double diametre)
    {
        this.masse = masse;
        this.name = name;
        this.diametre = diametre;
    }

    public double getMasse()
    {
        return masse;
    }

    public void setMasse(double masse)
    {
        this.masse = masse;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getDiametre()
    {
        return diametre;
    }

    public void setDiametre(double diametre)
    {
        this.diametre = diametre;
    }
}
