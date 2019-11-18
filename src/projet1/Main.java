package projet1;

import projet1.IHM.MainFrame;
import projet1.solarsystem.Etoile;
import projet1.solarsystem.Planet;
import projet1.solarsystem.SystemeSolaire;

public class Main
{
    private SystemeSolaire solarSystem;

    public Main()
    {
        this.solarSystem = new SystemeSolaire("New Solar System");
    }
    public void addPlanet(int revolutionPeriod, double inclinaison, double temperature, double distanceFromSun,
                          double masse, String name, double diametre)
    {
        this.solarSystem.addPlanet(new Planet(revolutionPeriod, inclinaison, temperature, distanceFromSun, masse,
                name,diametre));

    }

    public void setStar(int age, String type, double masse, String name, double diametre)
    {
        this.solarSystem.setStar(new Etoile(age, type, masse, name, diametre));
    }


    public static void main(String[] argv)
    {
        Main m = new Main();
        new MainFrame(m);
    }

    public SystemeSolaire getSolarSystem()
    {
        return solarSystem;
    }
}
