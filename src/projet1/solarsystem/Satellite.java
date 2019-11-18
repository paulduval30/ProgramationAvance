package projet1.solarsystem;

public class Satellite
{
    private Planet planet;
    private int diametre;
    private int distanceFromPlanet;
    private double angle;
    private int x;
    private int y;

    public Satellite(Planet planet, int diametre, int distanceFromPlanet)
    {
        this.planet = planet;
        this.diametre = diametre;
        this.distanceFromPlanet = distanceFromPlanet;
    }

    public Planet getPlanet()
    {
        return planet;
    }

    public void setPlanet(Planet planet)
    {
        this.planet = planet;
    }

    public int getDiametre()
    {
        return diametre;
    }

    public void setDiametre(int diametre)
    {
        this.diametre = diametre;
    }

    public int getDistanceFromPlanet()
    {
        return distanceFromPlanet;
    }

    public void setDistanceFromPlanet(int distanceFromPlanet)
    {
        this.distanceFromPlanet = distanceFromPlanet;
    }

    public void translate(int centerX, int centerY, int radius)
    {
        this.angle += 360.00 * ((Math.PI / 180.00)) / 100;
        this.x = (int)(centerX + (radius * Math.cos(angle)));
        this.y = (int)(centerY + (radius * Math.sin(angle)));
        System.out.println(this.angle);
    }

    public void setX(int i)
    {
        this.x = x;
    }

    public int getX()
    {
        return x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getY()
    {
        return y;
    }
}
