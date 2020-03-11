package miniprojet.IHM.listview;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class FilterListView<E extends Sortable> extends JPanel
{
    private ListView<E> listView;
    private JTextField filter;

    /**
     * Constructeur de FilterListView
     * @param d la dimension du composant
     */
    public FilterListView(Dimension d)
    {
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
                listView.setRegex(filter.getText());
                listView.filter();
                listView.repaint();
            }

            @Override
            public void removeUpdate(DocumentEvent e)
            {
                listView.setRegex(filter.getText());
                listView.filter();
                listView.repaint();
            }

            @Override
            public void changedUpdate(DocumentEvent e)
            {
                listView.setRegex(filter.getText());
                listView.filter();
                listView.repaint();
            }
        });

        this.listView = new ListView<E>(d);
        this.add(filter, BorderLayout.NORTH);
        JScrollPane j = new JScrollPane(listView);
        this.add(j, BorderLayout.CENTER);

    }

    public void add(E object)
    {
        listView.add(object);
    }
}
