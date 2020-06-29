package miniprojet.IHM.listview;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class DecoratedListView<E extends Sortable> extends ListView
{

    private JTextField filter;

    /**
     * Constructeur de la classe ListView
     *
     * @param d Dimension du composant
     */
    public DecoratedListView(Dimension d)
    {
        super(d);

        this.setLayout(new BorderLayout());
        this.filter = new JTextField(20);

        /**
         * Crée le document listener. Il permet de détécter les changements de texte dans le JTexField
         */
        this.filter.getDocument().addDocumentListener(new DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e)
            {
                setRegex(".*" + filter.getText()  + ".*");
                filter();
                repaint();
            }

            @Override
            public void removeUpdate(DocumentEvent e)
            {
                setRegex(".*" + filter.getText()  + ".*");
                filter();
                repaint();

            }

            @Override
            public void changedUpdate(DocumentEvent e)
            {
                setRegex(".*" + filter.getText() + ".*");
                filter();
                repaint();

            }
        });

        this.add(filter, BorderLayout.NORTH);
    }
}
