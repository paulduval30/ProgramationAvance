package miniprojet.IHM;
import miniprojet.IHM.Panels.AddLivre;
import miniprojet.IHM.Panels.AddPersonne;
import miniprojet.IHM.Panels.MenuPanel;
import miniprojet.IHM.Panels.ViewPanel;
import miniprojet.Main;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;


public class Window extends JFrame  {

    private JPanel mainPanel;
    private Main m;
    private HashMap<String,JPanel> ecrans;




    public Window(Main m)
    {
        this.m = m;
        this.setTitle("Gestion du personnel et des adhérants");
        this.setSize(1200,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainPanel = new JPanel();
        this.ecrans = new HashMap<>();
        this.ecrans.put("Menu", new MenuPanel(this));
        this.ecrans.put("Ajout", new AddPersonne(this));
        this.ecrans.put("AjoutLivre", new AddLivre(this));
        this.ecrans.put("Vue", new ViewPanel(this));
        mainPanel.add(ecrans.get("Menu"));
        this.getContentPane().add(mainPanel);
        this.setVisible(true);


    }

    public void changerEcran(String name){
        this.remove(mainPanel);
        this.mainPanel = ecrans.get(name);
        mainPanel.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
        this.add(mainPanel);
        mainPanel.repaint();
        this.revalidate();
        this.repaint();
    }


    public Main getMain() {
        return this.m;
    }
}
