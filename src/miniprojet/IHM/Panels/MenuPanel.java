package miniprojet.IHM.Panels;
import miniprojet.IHM.Window;
import miniprojet.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel implements ActionListener {
    private JButton btnViewList;
    private JButton btnAdd;
    private JTextArea listView;
    private  Window window;


    public MenuPanel(Window window){
        this.btnViewList = new JButton("Voir la liste des personnes");
        this.btnViewList.addActionListener(this);
        this.btnAdd = new JButton("Ajouter");
        this.btnAdd.addActionListener(this);
        this.add(btnViewList);
        this.add(btnAdd);
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
    }



}
