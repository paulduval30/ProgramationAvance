package miniprojet.IHM.Panels;
import miniprojet.IHM.Window;
import miniprojet.metier.Etudiant;
import miniprojet.metier.SansEmploie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPanel extends JPanel implements ActionListener {
    private final String[] ROLE = new String[]{"Sans Emploi", "Salarie" , "Etudiant"};
    private  Window window;
    private JButton btnRetour;
    private JButton btnSubmit;
    private JTextField txtBxLastName;
    private JTextField txtBxFirstName;
    private JTextField txtBxAdr;
    private JTextField txtBxNum;
    private JComboBox cbxRole;

    public AddPanel(Window window){
        this.setLayout(new BorderLayout());
        this.window = window;
        createComponent();
        placeComponent();
        this.btnRetour.addActionListener(this);
        this.btnSubmit.addActionListener(this);
    }
    
    private void createComponent(){
        this.btnRetour = new JButton("Retour");
        this.btnSubmit = new JButton("Submit");
        this.txtBxLastName = new JTextField(20);
        this.txtBxFirstName = new JTextField(20);
        this.txtBxAdr = new JTextField();
        this.txtBxNum = new JTextField();
        this.cbxRole = new JComboBox();
        for(String s : ROLE)
            cbxRole.addItem(s);

    }

    private void placeComponent(){
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
        this.add(q, BorderLayout.CENTER);

        tmp = new JPanel();
        tmp.add(new JLabel("Adresse :"));
        tmp.add(this.txtBxAdr);
        q.add(tmp);
        this.add(q, BorderLayout.CENTER);

        tmp = new JPanel();
        tmp.add(new JLabel("Numero :"));
        tmp.add(this.txtBxNum);
        q.add(tmp);
        this.add(q, BorderLayout.CENTER);

        tmp=  new JPanel();
        tmp.add(this.btnSubmit);
        tmp.add(this.btnRetour);
        this.add(tmp, BorderLayout.SOUTH);

        JPanel r = new JPanel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRetour){
            window.changerEcran("Menu");
        }

        if (e.getSource() == btnSubmit){
            String nom = this.txtBxLastName.getText();
            String prenom = this.txtBxLastName.getText();
            String adresse = this.txtBxAdr.getText();
            String num = this.txtBxNum.getText();
            String statut = this.cbxRole.getSelectedItem().toString();
            switch(statut){
                case "Sans Emploi":
                    SansEmploie chomeur = new SansEmploie(nom,prenom,adresse,num);
                    break;
                case "Etudiant":
            }
        }

    }
    
    
}
