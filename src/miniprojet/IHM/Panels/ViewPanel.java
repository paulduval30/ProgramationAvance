package miniprojet.IHM.Panels;

import miniprojet.IHM.listview.FilterListView;
import miniprojet.IHM.Window;
import miniprojet.metier.Adherent;
import miniprojet.metier.Bibliotheque;
import miniprojet.metier.Livre;
import miniprojet.metier.Personnel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewPanel extends JPanel implements ActionListener {
    private Bibliotheque bibliotheque;
    private  Window window;
    private FilterListView<Adherent> adherentListView;
    private JTabbedPane tab;
    private FilterListView<Personnel> personnelListView;
    private JButton btnRetour;
    private FilterListView<Livre> livreListView;



    public ViewPanel(Window window){
        this.bibliotheque = window.getMain().getBibliotheque();
        this.window = window;
        this.setVisible(true);
        this.adherentListView = new FilterListView<>(new Dimension(window.getWidth(), window.getHeight()));
        this.personnelListView = new FilterListView<>(new Dimension(window.getWidth(), window.getHeight()));
        this.livreListView = new FilterListView<>(new Dimension(window.getWidth(), window.getHeight()));

        this.btnRetour = new JButton("Retour");
        for(Adherent a: bibliotheque.getAdherents())
        {
            adherentListView.add(a);
        }
        for(Personnel p: bibliotheque.getPersonnels())
        {
            personnelListView.add(p);
        }

        for(Livre l : bibliotheque.getLivres())
        {
            livreListView.add(l);
        }
        this.tab = new JTabbedPane();
        this.setLayout(new BorderLayout());
        this.add(tab, BorderLayout.CENTER);

        JScrollPane tmpScroll = new JScrollPane(adherentListView);
        tmpScroll.setHorizontalScrollBar(null);
        tmpScroll.setPreferredSize(new Dimension(window.getWidth(), window.getHeight()));
        tab.addTab("Adhérants", tmpScroll);

        tmpScroll = new JScrollPane(personnelListView);
        tmpScroll.setHorizontalScrollBar(null);
        tmpScroll.setPreferredSize(new Dimension(window.getWidth(), window.getHeight()));
        tab.addTab("Personnels",tmpScroll);

        tmpScroll = new JScrollPane(livreListView);
        tmpScroll.setHorizontalScrollBar(null);
        tmpScroll.setPreferredSize(new Dimension(window.getWidth(), window.getHeight()));
        tab.addTab("Livre", tmpScroll);

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
