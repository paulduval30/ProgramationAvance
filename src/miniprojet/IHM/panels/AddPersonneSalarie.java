package miniprojet.IHM.panels;

import miniprojet.IHM.Window;
import miniprojet.model.metier.Salarie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPersonneSalarie extends AjouterPersonne {

    private JTextField txtBtxtRefSalarie;
    private JTextField txtBtxSalaireBrut;
    private JTextField txtBxNum;


    /**
     * Constructeur du panel d'ajout d'une personne
     *
     * @param window
     */
    public AddPersonneSalarie(Window window) {
        super(window);
        createComponent();
        placeComponent("Sans Emploi");
        this.addListener();
        this.setBackground(Color.BLUE);

    }

    @Override
    protected void createComponent() {
        super.createComponent();
        this.txtBtxSalaireBrut = new JTextField(20);
        this.txtBtxtRefSalarie = new JTextField(20);
    }

    @Override
    protected void placeComponent(String statut) {
        super.placeComponent(statut);

        JPanel panel = new JPanel(new GridLayout(0,1));
        JPanel tmp = new JPanel();

        tmp.add(new JLabel("Ref Salarie"));
        tmp.add(txtBtxtRefSalarie);
        panel.add(tmp);

        tmp = new JPanel();
        tmp.add(new JLabel("Salaire Brut"));
        tmp.add(txtBtxSalaireBrut);
        panel.add(tmp);

        cbxRole.setSelectedItem(ROLE[1]);

        this.center.add(panel);

    }

    @Override
    protected void addListener() {
        super.addListener();

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = txtBxLastName.getText();
                String prenom = txtBxLastName.getText();
                String adresse = txtBxAdr.getText();
                String num ="";
                String refSala = txtBtxtRefSalarie.getText();
                int salaire = new Integer(txtBtxSalaireBrut.getText());
                Salarie sala = new Salarie(nom,prenom,adresse,num, salaire,refSala);
                window.getControleur().inscrireAdherent(sala);
            }
        });
    }
}
