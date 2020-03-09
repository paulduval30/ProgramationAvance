package miniprojet.IHM.panels;
import miniprojet.IHM.Window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel implements ActionListener {
    private JButton btnViewList;
    private JButton btnAdd;
    private JButton btnAddLivre;
    private JTextArea listView;
    private  Window window;


    /**
     * Constructeur du panel de menu
     */
    public MenuPanel(Window window){
        this.btnViewList = new JButton("Voir la liste des personnes et des livres");
        this.btnViewList.addActionListener(this);

        this.btnAdd = new JButton("Ajouter une personne");
        this.btnAdd.addActionListener(this);
        this.btnAddLivre = new JButton("Emprunter / Rendre un livre");
        this.btnAddLivre.addActionListener(this);
        this.add(btnViewList);
        this.add(btnAdd);
        this.add(btnAddLivre);
        this.window = window;
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnViewList){
            window.changerEcran("Vue");
        }
        if (e.getSource()==btnAdd){
            window.changerEcran("Ajout");
        }
        if (e.getSource()==btnAddLivre){
            window.changerEcran("AjoutLivre");
        }
    }



}
