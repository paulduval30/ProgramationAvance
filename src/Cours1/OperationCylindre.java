package Cours1;

public class OperationCylindre
{
    private double diametre;
    private double hauteur;

    public OperationCylindre(double diametre, double hauter)
    {
        this.diametre = diametre;
        this.hauteur = hauter;
    }

    public double getRayonBase()
    {
        return diametre / 2;
    }

    public double getPerimetre()
    {
        return 2 * Math.PI * getRayonBase();
    }

    public double getAireLateral()
    {
        return 2 * Math.PI * getRayonBase() * hauteur;
    }

    public double getAreaBase()
    {
        return Math.PI * Math.pow(this.getRayonBase(), 2);
    }

    public double getDiametre()
    {
        return diametre;
    }

    public void setDiametre(int diametre)
    {
        this.diametre = diametre;
    }

    public double getHauteur()
    {
        return hauteur;
    }

    public void setHauter(double hauteur)
    {
        this.hauteur = hauteur;
    }

    public static void main(String[] argv)
    {
        OperationCylindre c = new OperationCylindre(10, 20);
        System.out.println("Aire base : " + c.getAreaBase() );
        System.out.println("Rayon base : " + c.getRayonBase() );
        System.out.println("Volume cylindre : " + c.getVolumeCylindre());
        System.out.println("Perimetre base : " + c.getPerimetre());
        System.out.println("Surface Lateral : " + c.getAireLateral());
    }

    public double getVolumeCylindre()
    {
        return Math.PI * Math.pow(getRayonBase(), 2) * hauteur;
    }
}
