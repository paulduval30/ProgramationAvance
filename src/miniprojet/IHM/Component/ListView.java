package miniprojet.IHM.Component;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ListView<E> extends JTextArea {

    private ArrayList<E> toDispaly;

    public ListView(){
        this.toDispaly = new ArrayList<>();
        this.setPreferredSize(new Dimension(500,500));
        this.setEnabled(false);
        this.setForeground(Color.BLACK);
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
}
