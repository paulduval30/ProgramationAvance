package miniprojet.IHM.panels;

import miniprojet.IHM.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPersonneSansEmploi extends AjouterPersonne {
    /**
     * Constructeur du panel d'ajout d'un chomeur
     *
     * @param window
     */
    public AddPersonneSansEmploi(Window window) {
        super(window);
        createComponent();
        placeComponent("Sans Emploi");
        this.addListener();
        System.out.println("Add Personne sans emploie");
        this.setBackground(Color.red);
    }

    @Override
    protected void placeComponent(String statut) {
        super.placeComponent(statut);
        cbxRole.setSelectedItem(ROLE[0]);


    }

    @Override
    protected void createComponent() {
        super.createComponent();
    }

    @Override
    protected void addListener() {
        super.addListener();

        this.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = txtBxLastName.getText();
                String prenom = txtBxLastName.getText();
                String adresse = txtBxAdr.getText();
                String statut = cbxRole.getSelectedItem().toString();
            }
        });
    }
}
