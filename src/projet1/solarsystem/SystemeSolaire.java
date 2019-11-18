package projet1.solarsystem;

import java.util.ArrayList;

public class SystemeSolaire
{
    private ArrayList<Planet> planets;
    private String name;
    private Etoile etoile;
    private Etoile star;

    public SystemeSolaire(String name)
    {
        this.planets = new ArrayList<>();
        this.name = name;
        this.star = new Etoile(20, "gaz", 0,"Soleil", 200);
        this.planets.add(new Planet(300,20,20,500,20,"Terre",50));
    }

    public SystemeSolaire(ArrayList<Planet> planets, String name)
    {
        this.planets = planets;
        this.name = name;
    }

    public void addPlanet(Planet p)
    {
        this.planets.add(p);
    }

    public void setStar(Etoile star)
    {
        this.star = star;
    }

    public Etoile getStar()
    {
        return star;
    }

    public Planet getPlanet(String s)
    {
        for(Planet p : this.planets)
        {
            if(p.getName().equals(s))
            {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Planet> getPlanets()
    {
        return planets;
    }
}
