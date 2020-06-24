package miniprojet.IHM.panels;

import miniprojet.IHM.Window;
import miniprojet.model.metier.Etudiant;
import miniprojet.model.metier.Salarie;
import miniprojet.model.metier.SansEmploie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AjouterPersonne extends JPanel implements ActionListener {

    protected final String[] ROLE = new String[]{"Sans Emploi", "Salarie" , "Etudiant"};

    protected  Window window;
    protected JButton btnRetour;
    protected JButton btnSubmit;
    protected JTextField txtBxLastName;
    protected JTextField txtBxFirstName;
    protected JTextField txtBxAdr;
    protected JComboBox cbxRole;
    protected JPanel center;


    /**
     * Constructeur du panel d'ajout d'une personne
     */
    public AjouterPersonne(Window window){
        this.setLayout(new BorderLayout());
        this.window = window;
        createComponent();
        placeComponent("Sans Emploi");
        this.addListener();
        this.setBackground(Color.BLUE);

    }
    protected void createComponent(){
        this.btnRetour = new JButton("Retour");
        this.btnSubmit = new JButton("Submit");
        this.txtBxLastName = new JTextField(20);
        this.txtBxFirstName = new JTextField(20);
        this.txtBxAdr = new JTextField(50);
        this.cbxRole = new JComboBox();
        for(String s : ROLE)
            cbxRole.addItem(s);

        this.center = new JPanel(new GridLayout(1,0));
    }
    /**
     * Méthode de reformation du formulaire en fonction du statut
     * @param statut String
     */
    protected void placeComponent(String statut){

        JPanel q = new JPanel(new GridLayout(0,1));
        JPanel tmp = new JPanel();

        tmp.add(new JLabel("Nom :"), BorderLayout.EAST);
        tmp.add(this.txtBxLastName);
        q.add(tmp);

        tmp = new JPanel();
        tmp.add(new JLabel("Prenom :"));
        tmp.add(this.txtBxFirstName);
        q.add(tmp);

        tmp = new JPanel();
        tmp.add(new JLabel("Adresse :"));
        tmp.add(this.txtBxAdr);
        q.add(tmp);

        tmp = new JPanel();
        tmp.add(new JLabel("Statut :"));
        tmp.add(this.cbxRole);
        q.add(tmp);
        center.add(q);

        this.add(center);

        tmp = new JPanel(new FlowLayout());
        tmp.add(btnSubmit);
        tmp.add(btnRetour);
        this.add(tmp, BorderLayout.SOUTH);
    }
    protected void addListener()
    {

        this.btnRetour.addActionListener(new ActionListener()
        {
            // en cas d'appuye sur le bouton retour, changer l'écran pour l'écran de menu
            @Override
            public void actionPerformed(ActionEvent e)
            {
                window.changerEcran("Menu");
            }
        });

        this.cbxRole.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Lors du changement de choix dans la combobox role, supprime les composants existants et recrée un panel en reformant le formulaire
        if (e.getSource() == cbxRole) {
            switch((String)(cbxRole.getSelectedItem()))
            {
                case "Sans Emploi" :
                    window.changerEcran("AddPersonneSansEmploi");
                    break;
                case "Salarie" :
                    window.changerEcran("AddPersonneSalarie");
                    break;
                case "Etudiant":
                    window.changerEcran("AddPersonneEtudiant");
                    break;
            }
        }

    }
}
