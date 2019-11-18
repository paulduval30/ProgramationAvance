package projet1.IHM;

import projet1.Main;
import projet1.solarsystem.Planet;
import projet1.solarsystem.Satellite;
import projet1.solarsystem.SystemeSolaire;

import javax.swing.*;
import java.awt.*;

public class SolarSystemGraphic extends JComponent
{
    private SystemeSolaire systemeSolaire;
    private Main main;
    private String textToDisplay;

    public SolarSystemGraphic(Main main, int width, int height)
    {
        this.systemeSolaire = main.getSolarSystem();
        this.setPreferredSize(new Dimension(width, height));
        this.main = main;
    }

    private Planet getPlanet(int x, int y)
    {
        for(Planet p : systemeSolaire.getPlanets())
        {
            int xPlanetMin = p.getX();
            int xPlanetMax = (int)(p.getX() + p.getDiametre() / 2);
            int yPlanetMin = p.getY();
            int yPlanetMax = (int)(p.getY() + p.getDiametre() / 2);

            if(x < xPlanetMax && x > xPlanetMin && y < yPlanetMax && y > yPlanetMin)
            {
                return p;
            }
        }

        return null;
    }


    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.fillRect(0,0, this.getWidth(), this.getHeight());
        g.setColor(Color.RED);
        if(systemeSolaire.getStar() != null)
            g.fillOval((int)(this.getWidth() / 2 - systemeSolaire.getStar().getDiametre() / 2),
                    (int)(this.getHeight() / 2 - systemeSolaire.getStar().getDiametre() / 2), (int)this.systemeSolaire.getStar().getDiametre() / 2,
                    (int)this.systemeSolaire.getStar().getDiametre() / 2);
        for(Planet p : systemeSolaire.getPlanets())
        {
            g.setColor(p.getColor());
            g.fillOval(p.getX(),p.getY(),
                    (int)p.getDiametre() / 2, (int)p.getDiametre() / 2);
            for(Satellite s : p.getSatellites())
            {
                g.fillOval((int)(s.getX() + s.getDiametre() / 2),
                        (int)(s.getY() + s.getDiametre() / 2),
                        s.getDiametre() / 2, s.getDiametre() / 2);
            }
        }

        Planet planet = this.getPlanet(MainFrame.input.getMouseX(), MainFrame.input.getMouseY());
        g.setColor(Color.WHITE);
        g.fillRect(this.getWidth() - 200, 0, 200, this.getHeight());
        if(planet != null)
        {
            g.setColor(Color.BLACK);
            g.drawString( "Nom : " + planet.getName(), this.getWidth() - 190, 10);
            g.drawString( " Diametre : " + planet.getDiametre(), this.getWidth() - 190, 30);
            g.drawString( " Distance de l'étoile : " + planet.getDistanceFromSun(), this.getWidth() - 190, 60);

        }
    }
}
