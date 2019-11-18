package projet1.IHM;

import projet1.Main;
import projet1.solarsystem.Etoile;
import projet1.solarsystem.Planet;
import projet1.solarsystem.SystemeSolaire;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class PanelAjoutEtoile extends JPanel implements ActionListener
{
    private final SystemeSolaire systemeSolaire;
    private HashMap<String,JTextField> textFields;
    JButton valider;

    public PanelAjoutEtoile(Main main, int width, int height)
    {
        this.valider = new JButton("VALIDER");
        valider.addActionListener(this);
        this.setPreferredSize(new Dimension(width, height));
        this.setSize(new Dimension(width, height));
        this.systemeSolaire = main.getSolarSystem();
        this.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(9,2));
        this.textFields = new HashMap<>();
        String[] temp = new String[]{"Nom (Texte)","Diametre (Entier)", "Masse (Entier)", "Age (Entier)", "Type (Texte)"};
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
            String nom = textFields.get("Nom (Texte)").getText();
            int age = new Integer(textFields.get("Age (Entier)").getText());
            int masse = new Integer(textFields.get("Masse (Entier)").getText());
            int diametre = new Integer(textFields.get("Diametre (Entier)").getText());
            String type = textFields.get("Type (Texte)").getText();
            Etoile star = new Etoile(age,type,masse, nom, diametre);
            systemeSolaire.setStar(star);
        }
        catch (Exception ignore)
        {
            JOptionPane.showOptionDialog(this,"Erreur de saisie des valeurs, respectez le type demandé",
                    "Erreur", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null,null,null);
        }

    }
}
