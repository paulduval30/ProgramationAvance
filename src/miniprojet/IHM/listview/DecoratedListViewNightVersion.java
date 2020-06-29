package miniprojet.IHM.listview;

import java.awt.*;

public class DecoratedListViewNightVersion<E extends Sortable> extends DecoratedListView
{
    /**
     * Constructeur de la classe ListView
     *
     * @param d Dimension du composant
     */
    public DecoratedListViewNightVersion(Dimension d)
    {
        super(d);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(int i = 0; i < toDispaly.size(); i++)
        {
            if(i == selected)
                g.setColor(Color.LIGHT_GRAY);
            else if(i%2 ==0)
                g.setColor(Color.BLACK);
            else
                g.setColor(Color.GRAY);
            g.fillRect(0,i * BOX_HEIGHT + 50, this.getWidth(), BOX_HEIGHT);

            if(i == selected)
                g.setColor(Color.BLACK);
            else
                g.setColor(Color.WHITE);
            g.drawString(((Sortable)toDispaly.get(i)).getText(),0, i * BOX_HEIGHT - BOX_HEIGHT / 2 + 30 + 50);

        }
    }
}
