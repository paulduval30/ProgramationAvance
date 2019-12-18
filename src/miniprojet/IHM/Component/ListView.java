package miniprojet.IHM.Component;

import miniprojet.metier.Adherent;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ListView<E> extends JComponent {
    private ArrayList<E> toDispaly;
    private String text;

    public ListView(){
        this.toDispaly = new ArrayList<>();
        this.setPreferredSize(new Dimension(500,500));
        this.setEnabled(false);
        this.setForeground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i = 0; i < toDispaly.size(); i++)
        {
            if(i%2 ==0)
                g.setColor(Color.white);
            else
                g.setColor(Color.LIGHT_GRAY);
            g.fillRect(0,i * 30 + 15, this.getWidth(), 30);
            g.setColor(Color.BLACK);
            g.drawString(toDispaly.get(i).toString(),0, i * 30);

        }
    }

    public void add(E object)
    {
        this.toDispaly.add(object);
        this.displayTest();
        this.repaint();
    }

    public void displayTest()
    {
        String str = "";

        for(E e : this.toDispaly)
        {
            str += e.toString() + "\n";
        }

        this.setText(str);
    }

    private void setText(String str) {
        this.text = str;

    }
}
