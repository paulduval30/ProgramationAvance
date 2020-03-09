package MVC.ex1.IHM;


import MVC.ex1.Controleur;
import MVC.ex1.Model.DisplayNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observer;

public class MainFrame extends JFrame implements Observer
{
    private JLabel value;
    private JButton plus;
    private JButton minus;
    private Controleur c;

    public MainFrame(Controleur c)
    {
        this.c = c;
        this.setLayout(new FlowLayout());
        this.value = new JLabel(c.getNumber() + "");
        this.plus = new JButton("+");
        this.minus = new JButton("-");

        this.plus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                c.setNumber(c.getNumber() + 1);
                System.out.println(c.getNumber());
            }
        });

        this.minus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                c.setNumber(c.getNumber() -1);
            }
        });

        this.add(plus);
        this.add(value);
        this.add(minus);

        this.setVisible(true);

    }



    @Override
    public void update(java.util.Observable o, Object arg)
    {
        if(o instanceof DisplayNumber)
        {
            this.value.setText(c.getNumber() + "");
            this.repaint();
            System.out.println("repaint");
        }
    }
}
