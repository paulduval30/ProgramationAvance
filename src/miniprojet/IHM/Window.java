package miniprojet.IHM;
import miniprojet.Controleur;
import miniprojet.IHM.panels.*;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;


public class Window extends JFrame  {

    private JPanel mainPanel;
    private Controleur c;
    private HashMap<String,JPanel> ecrans;


    public Window(Controleur c)
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        this.c = c;
        this.setTitle("Gestion du personnel et des adhérants");
        this.setSize(1200,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainPanel = new JPanel();
        this.ecrans = new HashMap<>();
        this.ecrans.put("Menu", new MenuPanel(this));
        this.ecrans.put("Ajout", new AddPersonne(this));
        this.ecrans.put("AjoutLivre", new PanelEmpruntRetour(this));
        this.ecrans.put("Vue", new ViewPanel(this));
        this.ecrans.put("AddPersonneSansEmploi", new AddPersonneSansEmploi(this));
        this.ecrans.put("AddPersonneEtudiant", new AddPersonneEtudiant(this));
        this.ecrans.put("AddPersonneSalarie", new AddPersonneSalarie(this));
        mainPanel.add(ecrans.get("Menu"));
        this.getContentPane().add(mainPanel);
        this.setVisible(true);


    }

    /**
     * Méthode permettant de changer l'écran affichée par la Window
     * @param name nom de l'écran à afficher
     */
    public void changerEcran(String name){
        this.remove(mainPanel);
        this.mainPanel = ecrans.get(name);
        mainPanel.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
        this.add(mainPanel);
        mainPanel.repaint();
        this.revalidate();
        this.repaint();
    }


    /**
     * Retourne de controleur de la fenetre
     * @return Controleur
     */
    public Controleur getControleur() {
        return this.c;
    }
}
