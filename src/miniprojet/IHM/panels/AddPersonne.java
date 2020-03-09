package miniprojet.IHM.panels;
import miniprojet.IHM.Window;
import miniprojet.model.metier.Etudiant;
import miniprojet.model.metier.Salarie;
import miniprojet.model.metier.SansEmploie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPersonne extends JPanel implements ActionListener {
    private final String[] ROLE = new String[]{"Sans Emploi", "Salarie" , "Etudiant"};
    private  Window window;
    private JButton btnRetour;
    private JButton btnSubmit;
    private JTextField txtBxLastName;
    private JTextField txtBxFirstName;
    private JTextField txtBxAdr;
    private JTextField txtBxNum;
    private JComboBox cbxRole;
    private JTextField txtBtxrefEtudiant;
    private JTextField txtBtxnumEtudiant;
    private JTextField txtBtxtRefSalarie;
    private JTextField txtBtxSalaireBrut;
    private JPanel mainPanel;

    /**
     * Constructeur du panel d'ajout d'une personne
     */
    public AddPersonne(Window window){
        this.setLayout(new BorderLayout());
        this.window = window;
        createComponent();
        placeComponent("Sans Emploi");
        this.addListener();
    }

    private void addListener()
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
        this.btnSubmit.addActionListener(new ActionListener()
        {
            // en cas d'appuye sur le bouton d'envoie,  incrit un nouvel adhérent
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String nom = txtBxLastName.getText();
                String prenom = txtBxLastName.getText();
                String adresse = txtBxAdr.getText();
                String num = txtBxNum.getText();
                String statut = cbxRole.getSelectedItem().toString();
                switch(statut){
                    case "Sans Emploi":
                        SansEmploie chomeur = new SansEmploie(nom,prenom,adresse,num);
                        window.getControleur().inscrireAdherent(chomeur);
                        break;
                    case "Etudiant":
                        String refEtu = txtBtxrefEtudiant.getText();
                        String numEtu = txtBtxnumEtudiant.getText();
                        Etudiant etu = new Etudiant(nom,prenom,adresse,num,refEtu,numEtu);
                        window.getControleur().inscrireAdherent(etu);
                        break;
                    case "Salarie":
                        String refSala = txtBtxtRefSalarie.getText();
                        int salaire = new Integer(txtBtxSalaireBrut.getText());
                        Salarie sala = new Salarie(nom,prenom,adresse,num,salaire,refSala);
                        window.getControleur().inscrireAdherent(sala);
                }

            }
        });
        this.cbxRole.addActionListener(this);
    }

    /**
     * Méthode de création des composants nécessaires
     */
    private void createComponent(){
        this.btnRetour = new JButton("Retour");
        this.btnSubmit = new JButton("Submit");
        this.txtBxLastName = new JTextField(20);
        this.txtBxFirstName = new JTextField(20);
        this.txtBxAdr = new JTextField(50);
        this.txtBxNum = new JTextField(10);
        this.cbxRole = new JComboBox();
        this.txtBtxnumEtudiant = new JTextField(20);
        this.txtBtxrefEtudiant = new JTextField(20);
        this.txtBtxSalaireBrut = new JTextField(20);
        this.txtBtxtRefSalarie = new JTextField(20);
        for(String s : ROLE)
            cbxRole.addItem(s);
        this.mainPanel = new JPanel(new GridLayout(0,1));

    }

    /**
     * Méthode de création du formaire d'ajout d'un adherent en fonction du status
     * @param statut String
     * @return JPanel nouveau formulaire
     */
    private JPanel createForm(String statut)
    {
        JPanel panel = new JPanel(new GridLayout(0,1));
        JPanel tmp = new JPanel();
        if(statut.equals("Etudiant"))
        {
            tmp.add(new JLabel("Ref Etudiant"));
            tmp.add(txtBtxrefEtudiant);
            panel.add(tmp);

            tmp = new JPanel();
            tmp.add(new JLabel("Num Etudiant"));
            tmp.add(txtBtxnumEtudiant);
            panel.add(tmp);

            return panel;
        }
        else if(statut.equals("Salarie"))
        {
            tmp.add(new JLabel("Ref Salarie"));
            tmp.add(txtBtxtRefSalarie);
            panel.add(tmp);

            tmp = new JPanel();
            tmp.add(new JLabel("Salaire Brut"));
            tmp.add(txtBtxSalaireBrut);
            panel.add(tmp);

            return panel;
        }

        return panel;
    }

    /**
     * Méthode de reformation du formulaire en fonction du statut
     * @param statut String
     */
    private void placeComponent(String statut){

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
        tmp.add(new JLabel("Statut :"));
        tmp.add(this.cbxRole);
        q.add(tmp);

        this.mainPanel.add(q);
        createForm("Sans Emploie");
        this.mainPanel.add(createForm(statut));

        tmp =  new JPanel();
        tmp.add(this.btnSubmit);
        tmp.add(this.btnRetour);
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(tmp, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Lors du changement de choix dans la combobox role, supprime les composants existants et recrée un panel en reformant le formulaire
        if(e.getSource() == cbxRole)
        {
            String statut = (String)this.cbxRole.getSelectedItem();
            this.removeAll();
            this.mainPanel = new JPanel(new GridLayout(0,1));
            this.placeComponent(statut);
            mainPanel.revalidate();
            this.addListener();
        }

    }
    
    
}
