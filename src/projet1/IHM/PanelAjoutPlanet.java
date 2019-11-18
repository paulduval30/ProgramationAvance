package projet1.IHM;

import javafx.scene.layout.Pane;
import projet1.Main;
import projet1.solarsystem.Planet;
import projet1.solarsystem.SystemeSolaire;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class PanelAjoutPlanet extends JPanel implements ActionListener
{
    private final SystemeSolaire systemeSolaire;
    private HashMap<String,JTextField> textFields;
    private JButton valider;
    private PanelAjoutSatelite ajoutSatelite;

    public PanelAjoutPlanet(Main main, int width, int height, PanelAjoutSatelite ajoutSatelite)
    {
        this.ajoutSatelite = ajoutSatelite;
        this.valider = new JButton("VALIDER");
        valider.addActionListener(this);
        this.setPreferredSize(new Dimension(width, height));
        this.setSize(new Dimension(width, height));
        this.systemeSolaire = main.getSolarSystem();
        this.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(9,2));
        this.textFields = new HashMap<>();
        String[] temp = new String[]{"Nom","Diametre (Entier)", "Masse (Entier)", "Periode de revolution (Entier)",
                "Inclinaison (Entier)" , "Distance par au noyau de l'étoile (Entier)", "Temperature (Entier)", "Matiere"};
        for(String s : temp)
        {
            textFields.put(s, new JTextField());
        }

        for(String s : temp)
        {
            p.add(new JLabel(s));
            textFields.get(s).setPreferredSize(new Dimension(this.getWidth() / 2, 50));
            p.add(textFields.get(s));
        }

        this.add(p, BorderLayout.CENTER);
        JPanel q = new JPanel();
        q.add(valider);
        this.add(q, BorderLayout.SOUTH);


    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {

            int revolutionPeriod = new Integer(textFields.get("Periode de revolution (Entier)").getText());
            int inclinaison = new Integer(textFields.get("Inclinaison (Entier)").getText());
            int temperature = new Integer(textFields.get("Temperature (Entier)").getText());
            int distanceFromSun = new Integer(textFields.get("Distance par au noyau de l'étoile (Entier)").getText());
            int masse = new Integer(textFields.get("Masse (Entier)").getText());
            int diametre = new Integer(textFields.get("Diametre (Entier)").getText());
            String nom = textFields.get("Nom").getText();
            Planet p = new Planet(revolutionPeriod, inclinaison, temperature, distanceFromSun, masse, nom,diametre);
            p.setX((int)(this.getWidth() / 2 + p.getDistanceFromSun() - p.getDiametre() / 2));
            p.setY( (int)(this.getHeight() / 2 + p.getDistanceFromSun()  - p.getDiametre() / 2));
            p.setColor(new Color((int)(Math.random() * 250), (int)(Math.random() * 250), (int)(Math.random() * 250)));
            this.systemeSolaire.addPlanet(p);
            for(Planet planets : systemeSolaire.getPlanets())
            {
                ajoutSatelite.getComboBox().addItem(planets.getName());
            }
        }
        catch (Exception ignore)
        {
            JOptionPane.showOptionDialog(this,"Erreur de saisie des valeurs, respectez le type demandé",
                    "Erreur", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null,null,null);
        }

    }
}
