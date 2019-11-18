package projet1.solarsystem;

import java.awt.*;
import java.util.ArrayList;

public class Planet extends Objet
{
    private int revolutionPeriod;
    private double inclinaison;
    private double distanceFromSun;
    private double temperature;
    private Matiere matiere;
    private ArrayList<Satellite> satellites;
    private Color color;
    private int x;
    private int y;
    private double angle;


    public Planet(int revolutionPeriod, double inclinaison, double temperature, double distanceFromSun,
                  double masse, String name, double diametre)
    {
        super(masse, name, diametre);
        this.revolutionPeriod = revolutionPeriod;
        this.inclinaison = inclinaison;
        this.temperature = temperature;
        this.distanceFromSun = distanceFromSun;
        this.satellites = new ArrayList<>();
    }

    public void setColor(Color c)
    {
        this.color = c;

    }

    public boolean hasSatelit()
    {
        return satellites.size() != 0;
    }

    public int getRevolutionPeriod()
    {
        return revolutionPeriod;
    }

    public void setRevolutionPeriod(int revolutionPeriod)
    {
        this.revolutionPeriod = revolutionPeriod;
    }

    public double getInclinaison()
    {
        return inclinaison;
    }

    public void setInclinaison(double inclinaison)
    {
        this.inclinaison = inclinaison;
    }

    public double getDistanceFromSun()
    {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun)
    {
        this.distanceFromSun = distanceFromSun;
    }

    public double getTemperature()
    {
        return temperature;
    }

    public void setTemperature(double temperature)
    {
        this.temperature = temperature;
    }

    public Matiere getMatiere()
    {
        return matiere;
    }

    public void setMatiere(Matiere matiere)
    {
        this.matiere = matiere;
    }

    public ArrayList<Satellite> getSatellites()
    {
        return satellites;
    }

    public void setSatellites(ArrayList<Satellite> satellites)
    {
        this.satellites = satellites;
    }

    public Color getColor()
    {
        return color;
    }

    public void ajouterSatelites(Satellite satellite)
    {
        this.satellites.add(satellite);
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void translate(int centerX, int centerY, int radius)
    {
        this.angle += 360.00 * ((Math.PI / 180.00)) / this.revolutionPeriod;
        this.x = (int)(centerX + (radius * Math.cos(angle)));
        this.y = (int)(centerY + (radius * Math.sin(angle)));

        for(Satellite s : satellites)
            s.translate(this.x, this.y, s.getDistanceFromPlanet());
    }
}
