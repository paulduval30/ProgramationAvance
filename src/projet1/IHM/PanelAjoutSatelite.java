package projet1.IHM;

import projet1.Main;
import projet1.solarsystem.Planet;
import projet1.solarsystem.Satellite;
import projet1.solarsystem.SystemeSolaire;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class PanelAjoutSatelite extends JPanel implements ActionListener
{
    private final SystemeSolaire systemeSolaire;
    private HashMap<String,JTextField> textFields;
    private JComboBox<String> comboBox;
    JButton valider;

    public PanelAjoutSatelite(Main main, int width, int height)
    {

        this.valider = new JButton("VALIDER");
        valider.addActionListener(this);
        this.setPreferredSize(new Dimension(width, height));
        this.setSize(new Dimension(width, height));
        this.systemeSolaire = main.getSolarSystem();
        this.textFields = new HashMap<>();
        String[] planetsName = new String[systemeSolaire.getPlanets().size()];
        for(int i = 0; i < planetsName.length; i++)
        {
            planetsName[i] = systemeSolaire.getPlanets().get(i).getName();
        }
        this.comboBox = new JComboBox<>(planetsName);
        this.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(9,2));
        String[] temp = new String[]{"Diametre (Entier)","Distance du noyau de la planete (Entier)"};

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

        p.add(new JLabel("Planete"));
        p.add(comboBox);

        this.add(p, BorderLayout.CENTER);
        JPanel q = new JPanel();
        q.add(valider);
        this.add(q, BorderLayout.SOUTH);
    }

    public void setComboBox(JComboBox<String> comboBox)
    {
        this.comboBox = comboBox;
    }

    public JComboBox<String> getComboBox()
    {
        return comboBox;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            Planet p = systemeSolaire.getPlanet((String)comboBox.getSelectedItem());
            if(p != null)
            {
                int diametre = new Integer(this.textFields.get("Diametre (Entier)").getText());
                int distance = new Integer(this.textFields.get("Distance du noyau de la planete (Entier)").getText());

                Satellite s = new Satellite(p, diametre, distance);
                s.setX((int)(p.getX() + s.getDistanceFromPlanet()));
                s.setY((int)(p.getY() - s.getDistanceFromPlanet()));
                p.ajouterSatelites(s);

            }
        }
        catch (Exception ignore)
        {
            JOptionPane.showOptionDialog(this,"Erreur de saisie des valeurs, respectez le type demandé",
                    "Erreur", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null,null,null);
        }
    }
}
