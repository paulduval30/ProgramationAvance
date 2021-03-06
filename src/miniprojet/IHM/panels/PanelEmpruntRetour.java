package miniprojet.IHM.panels;
import miniprojet.IHM.Window;
import miniprojet.model.metier.*;

import javax.swing.*;
import java.awt.*;

public class PanelEmpruntRetour extends JPanel {
    private  Window window;
    private JComboBox<Livre> livresDisponible;
    private JComboBox<Livre> livresRetour;
    private JComboBox<Adherent> adherents;
    private JComboBox<Adherent> adherentsRetour;
    private JButton btnRetour;
    private JButton btnSubmitEmprunt;
    private JButton btnSubmitRetour;

    /**
     *Création du panel d'emprunts et retours de livres
     */
    public PanelEmpruntRetour(Window window){
        this.setLayout(new BorderLayout());
        this.window = window;
        createComponent();
        placeComponent();
        this.addListener();
    }

    private void addListener()
    {
        //si click bouton retour, changer écran pour écran menu
        this.btnRetour.addActionListener(e -> window.changerEcran("Menu"));
        // lors d'une selection dans la combobox de retour des adherents, recharges tout les livres de cet adherent dans la combobox de retour des livres
        this.adherentsRetour.addActionListener(e -> {
            livresRetour.removeAllItems();
            Adherent adherent = ((Adherent)adherentsRetour.getSelectedItem());
            if(adherent == null)
                return;
            for(Livre l : adherent.getLivres())
            {
                livresRetour.addItem(l);
            }
        });

        //Lors du click sur le bouton de retour d'un livre, appel la méthode de retour d'un livre, et recalcul les livres et adherents affichés dans les combobox
        this.btnSubmitRetour.addActionListener(e -> {
            Livre livre = (Livre) livresRetour.getSelectedItem();
            Adherent adherent = (Adherent) adherentsRetour.getSelectedItem();
            window.getControleur().rendreLivre(livre, adherent);
            livresDisponible.removeAllItems();
            livresRetour.removeAllItems();
            adherents.removeAllItems();
            adherentsRetour.removeAllItems();
            for(Livre l : window.getControleur().getLivres())
            {
                if(l.isDisponible())
                {
                    livresDisponible.addItem(l);
                }
            }
            for(Adherent a : window.getControleur().getAdherents())
            {
                if(a.getLivres().size() != 0)
                    adherentsRetour.addItem(a);
                adherents.addItem(a);
            }

            adherent = ((Adherent)adherentsRetour.getSelectedItem());
            if (adherent == null)
                return;
            for(Livre l : adherent.getLivres())
            {
                livresRetour.addItem(l);
            }
        });

        // Au click du bouton d'emprunt, appel la méthode d'emprunt d'un livre et recaulcul le contenu des combobox
        this.btnSubmitEmprunt.addActionListener(e -> {
            Livre livre = (Livre) livresDisponible.getSelectedItem();
            Adherent adherent = (Adherent) adherents.getSelectedItem();
            window.getControleur().emprunter(livre, adherent);
            livresDisponible.removeAllItems();
            livresRetour.removeAllItems();
            adherents.removeAllItems();
            adherentsRetour.removeAllItems();
            for(Livre l : window.getControleur().getLivres())
            {
                if(l.isDisponible())
                {
                    livresDisponible.addItem(l);
                }
            }
            for(Adherent a : window.getControleur().getAdherents())
            {
                if(a.getLivres().size() != 0)
                    adherentsRetour.addItem(a);
                adherents.addItem(a);
            }

            adherent = ((Adherent)adherentsRetour.getSelectedItem());
            if (adherent == null)
                return;
            for(Livre l : adherent.getLivres())
            {
                livresRetour.addItem(l);
            }
        });
    }

    private void createComponent(){
        this.btnRetour = new JButton("Retour");
        this.btnSubmitEmprunt = new JButton("Submit");
        this.btnSubmitRetour = new JButton("Submit");
        this.livresDisponible = new JComboBox<>();
        this.livresRetour = new JComboBox<>();
        this.adherents = new JComboBox<>();
        this.adherentsRetour = new JComboBox<>();
        for(Livre l : window.getControleur().getLivres())
        {
            if(l.isDisponible())
            {
                livresDisponible.addItem(l);
            }
        }
        for(Adherent a : window.getControleur().getAdherents())
        {
            if(a.getLivres().size() != 0)
                adherentsRetour.addItem(a);
            adherents.addItem(a);
        }

        if(((Adherent)adherentsRetour.getSelectedItem()) != null &&((Adherent)adherentsRetour.getSelectedItem()).getLivres() != null)
            for(Livre l : ((Adherent)adherentsRetour.getSelectedItem()).getLivres())
            {
                livresRetour.addItem(l);
            }
    }

    /**
     * Place les composants dans le JPanel
     */
    private void placeComponent()
    {
        JPanel p = new JPanel(new GridLayout(0, 1));
        JPanel q = new JPanel(new BorderLayout());
        JPanel r = new JPanel();
        q.add(new JLabel("Emprunt"), BorderLayout.NORTH);
        q.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        r.add(this.adherents);
        r.add(this.livresDisponible);
        q.add(r, BorderLayout.CENTER);
        r = new JPanel();
        r.add(btnSubmitEmprunt);
        q.add(r, BorderLayout.SOUTH);
        p.add(q);
        q = new JPanel(new BorderLayout());
        q.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        r = new JPanel();
        q.add(new JLabel("Retour"), BorderLayout.NORTH);
        r.add(adherentsRetour);
        r.add(livresRetour);
        q.add(r, BorderLayout.CENTER);
        r = new JPanel();
        r.add(btnSubmitRetour);
        q.add(r, BorderLayout.SOUTH);
        p.add(q);
        this.add(p, BorderLayout.CENTER);

        JPanel tmp = new JPanel();
        tmp.add(this.btnRetour);
        this.add(tmp, BorderLayout.SOUTH);


    }


}
