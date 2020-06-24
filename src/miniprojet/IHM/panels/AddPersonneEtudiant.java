package miniprojet.IHM.panels;

import miniprojet.IHM.Window;
import miniprojet.model.metier.Etudiant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPersonneEtudiant extends AjouterPersonne {

    private JTextField txtBtxrefEtudiant;
    private JTextField txtBtxnumEtudiant;

    public AddPersonneEtudiant(Window window) {
        super(window);
        createComponent();
        placeComponent("Sans Emploi");
        this.addListener();
    }

    @Override
    protected void createComponent() {
        super.createComponent();
        this.txtBtxnumEtudiant = new JTextField(20);
        this.txtBtxrefEtudiant = new JTextField(20);
    }

    @Override
    protected void placeComponent(String statut) {
        super.placeComponent(statut);
        JPanel panel = new JPanel(new GridLayout(0,1));
        JPanel tmp = new JPanel();

        tmp.add(new JLabel("Ref Etudiant"));
        tmp.add(txtBtxrefEtudiant);
        panel.add(tmp);

        tmp = new JPanel();
        tmp.add(new JLabel("Num Etudiant"));
        tmp.add(txtBtxnumEtudiant);
        panel.add(tmp);

        cbxRole.setSelectedItem(ROLE[2]);
        this.center.add(panel);
    }

    @Override
    protected void addListener() {
        super.addListener();
        btnSubmit.addActionListener(e -> {
            String nom = txtBxLastName.getText();
            String prenom = txtBxLastName.getText();
            String adresse = txtBxAdr.getText();
            String num = "0606060606";
            String refEtu = txtBtxrefEtudiant.getText();
            String numEtu = txtBtxnumEtudiant.getText();
            Etudiant etu = new Etudiant(nom,prenom,adresse, num, refEtu,numEtu);
            window.getControleur().inscrireAdherent(etu);
            ((ViewPanel)window.getEcrans().get("Vue")).getAdherentListView().add(etu);
        });

        cbxRole.addActionListener(this);
    }
}