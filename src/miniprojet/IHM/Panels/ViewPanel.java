package miniprojet.IHM.Panels;

import javafx.scene.control.Tab;
import miniprojet.IHM.Component.ListView;
import miniprojet.IHM.Window;
import miniprojet.metier.Adherent;
import miniprojet.metier.Bibliotheque;
import miniprojet.metier.Personnel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewPanel extends JPanel implements ActionListener {
    private Bibliotheque bibliotheque;
    private  Window window;
    private ListView<Adherent> adherentListView;
    private JTabbedPane tab;
    private ListView<Personnel> personnelListView;
    private JButton btnRetour;



    public ViewPanel(Window window){
        this.bibliotheque = window.getMain().getBibliotheque();
        this.window = window;
        this.setVisible(true);
        this.adherentListView = new ListView<>();
        this.personnelListView = new ListView<>();
        this.btnRetour = new JButton("Retour");
        for(Adherent a: bibliotheque.getAdherents())
        {
            adherentListView.add(a);
        }
        for(Personnel p: bibliotheque.getPersonnels())
        {
            personnelListView.add(p);
        }
        this.tab = new JTabbedPane();
        this.setLayout(new BorderLayout());
        this.add(tab, BorderLayout.CENTER);
        tab.addTab("Adhérants",adherentListView);
        tab.addTab("Personnels",personnelListView);
        JPanel p = new JPanel();
        p.add(btnRetour);
        btnRetour.addActionListener(this);
        this.add(p, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnRetour){
            window.changerEcran("Menu");
        }
    }
}
