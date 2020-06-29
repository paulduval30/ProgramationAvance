package miniprojet.IHM.listview;

import miniprojet.util.Match;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

/**
 * Code du composant List View, qui affiche une ArrayList d'objet de type <E>
 * @param <E> le type de l'objet a afficher. Il doit implementer Sortable
 */
public class ListView<E extends Sortable> extends JComponent implements MouseMotionListener
{
    protected ArrayList<E> toDispaly;
    protected ArrayList<E> objects;
    protected final int BOX_HEIGHT = 30;
    protected int selected;
    protected String regex;
    protected Match match;

    /**
     * Constructeur de la classe ListView
     * @param d Dimension du composant
     */
    public ListView(Dimension d){
        this.match = new Match();
        this.toDispaly = new ArrayList<>();
        this.objects = new ArrayList<>();
        this.regex = ".*";
        this.filter();
        this.setPreferredSize(new Dimension((int)d.getWidth(), toDispaly.size() * 30));
        this.setSize(d);
        this.setEnabled(false);
        this.setForeground(Color.BLACK);
        this.addMouseMotionListener(this);
        this.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(selected > toDispaly.size())
                {
                    e.consume();
                    return;
                }
               JOptionPane.showMessageDialog(null, toDispaly.get(selected).getDetail());
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i = 0; i < toDispaly.size(); i++)
        {
            if(i == selected)
                g.setColor(new Color(196, 214, 255));
            else if(i%2 ==0)
                g.setColor(Color.LIGHT_GRAY);
            else
                g.setColor(new Color(217, 215, 215));
            g.fillRect(0,i * BOX_HEIGHT + 50, this.getWidth(), BOX_HEIGHT);

            g.setColor(Color.BLACK);
            g.drawString(toDispaly.get(i).getText(),0, i * BOX_HEIGHT - BOX_HEIGHT / 2 + 30 + 50);

        }
    }

    /**
     * Ajoute un objet a la liste
     * @param object l'objet a ajouter
     */
    public void add(E object)
    {
        this.objects.add(object);
        this.filter();
        this.setPreferredSize(new Dimension(this.getWidth(), toDispaly.size() * 30));
        this.repaint();
    }

    /**
     *Filtre les elements de la liste selon la regex en variable de classe
     */
    public void filter()
    {
        toDispaly = new ArrayList<>();
        this.match.setPattern(this.regex);
        for(E e : objects)
        {
            if(match.matching(e.getId()))
                toDispaly.add(e);
        }

        for(E e : toDispaly)
            System.out.println(e.getId());
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {

    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        int  id = (e.getY() - 50) / BOX_HEIGHT;
        if(id < toDispaly.size())
            selected = id;
        this.repaint();
    }

    public void setRegex(String regex)
    {
        this.regex = regex;
    }
}
