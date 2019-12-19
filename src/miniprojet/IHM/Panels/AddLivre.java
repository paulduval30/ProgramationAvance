package miniprojet.IHM.Panels;
import miniprojet.IHM.Window;
import miniprojet.metier.Etudiant;
import miniprojet.metier.Salarie;
import miniprojet.metier.SansEmploie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddLivre extends JPanel implements ActionListener {
    private  Window window;
    private JButton btnRetour;
    private JButton btnSubmit;
    private JTextField txtBxTitre;
    private JTextField txtBxEditeur;
    private JTextField txtBxAnneeEdition;
    private JPanel mainPanel;

    public AddLivre(Window window){
        this.setLayout(new BorderLayout());
        this.window = window;
        createComponent();
        placeComponent();
        this.addListener();
    }

    private void addListener()
    {
        this.btnRetour.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                window.changerEcran("Menu");
            }
        });
    }

    private void createComponent(){
        this.btnRetour = new JButton("Retour");
        this.btnSubmit = new JButton("Submit");
        this.txtBxTitre = new JTextField(20);
        this.txtBxAnneeEdition = new JTextField(4);
        this.txtBxEditeur = new JTextField(20);
    }

    private void placeComponent(){

        JPanel q = new JPanel(new GridLayout(0,1));
        JPanel tmp = new JPanel();
        tmp.add(new JLabel("Titre : "));
        tmp.add(this.txtBxTitre);
        q.add(tmp);
        tmp =  new JPanel();
        tmp.add(new JLabel("Année d'édition : "));
        tmp.add(this.txtBxAnneeEdition);
        q.add(tmp);
        tmp = new JPanel();
        tmp.add(new JLabel("Editeur : "));
        tmp.add(this.txtBxEditeur);
        q.add(tmp);

        tmp = new JPanel();
        tmp.add(this.btnSubmit);
        tmp.add(this.btnRetour);
        this.add(q, BorderLayout.CENTER);
        this.add(tmp, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit){

        }
    }


}
