package miniprojet.IHM;

import miniprojet.model.metier.Adherent;
import miniprojet.model.metier.Etudiant;
import miniprojet.model.metier.Salarie;
import miniprojet.model.metier.SansEmploie;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import java.util.*;

public class Formulaire extends JFrame implements ActionListener
{

    private JRadioButton etudiant;
    private JRadioButton salarie;
    private JRadioButton sansEmploie;
    private ButtonGroup choix = new ButtonGroup();
    private JButton ok;
    private JTextField tnom;
    private JTextField tprenom;
    private ArrayList<Adherent> adherents;
    private JScrollPane scrollpane;
    private JPanel scrollable;

    public Formulaire()
    {

        adherents = new ArrayList<>();
        setBounds(250, 250, 250, 350);
        setTitle("Formulaire");
        JLabel labelnom= new JLabel("Nom:");
        tnom= new JTextField(15);
        JLabel labelprenom= new JLabel("Prenom:");
        tprenom= new JTextField(15);
        ok = new JButton("OK") ;
        etudiant = new JRadioButton("Etudiant", false);
        salarie =  new JRadioButton("Salarié", false);
        sansEmploie =  new JRadioButton("Sans-emploie", false);
        JPanel pane= new JPanel();
        JPanel p = new JPanel(new BorderLayout());

        scrollable = new JPanel();
        p.add(scrollable);
        scrollable.setLayout(new GridLayout(0,1));
        scrollable.add(new JLabel("Liste des adherents"));

        scrollpane = new JScrollPane(p);

        scrollpane.setPreferredSize(new Dimension(this.getHeight()/2,this.getWidth()));



        ok.addActionListener(this);
        pane.add(labelnom);
        pane.add(tnom);
        pane.add(labelprenom);
        pane.add(tprenom);
        pane.add(etudiant);
        pane.add(salarie);
        pane.add(sansEmploie);
        pane.add(ok);
        pane.add(scrollpane);


        choix.add(etudiant);
        choix.add(salarie);
        choix.add(sansEmploie);


        setContentPane(pane);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==ok)
        {
            String nom = tnom.getText();
            String prenom = tprenom.getText();
            String emploie = "";
            if(salarie.isSelected())
            {
                emploie = "salarie";
                adherents.add(new Salarie(nom, prenom));
            }
            else if(etudiant.isSelected())
            {
                emploie = "etudiant";
                adherents.add(new Etudiant(nom, prenom));
            }
            else if(sansEmploie.isSelected())
            {
                emploie = "sans-emploie";
                adherents.add(new SansEmploie(nom, prenom));
            }
            JLabel label = new JLabel(adherents.get(adherents.size()-1).toString());
            label.setBackground(Color.BLUE);
            scrollable.add(label);
            scrollable.repaint();
            scrollpane.repaint();
            this.repaint();
            this.revalidate();

            System.out.println(nom + " " + prenom + " " + emploie);
        }
    }

    public static void main(String[] argv)
    {
        new Formulaire();
    }
}
