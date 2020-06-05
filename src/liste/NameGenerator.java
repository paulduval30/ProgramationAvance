package liste;

import java.util.ArrayList;
import java.util.Comparator;

public class NameGenerator {
    private ArrayList<String> names;
    private int indice;

    public NameGenerator()
    {
        this.names = new ArrayList<>();
    }

    public void addName(String s)
    {
        this.names.add(s);
    }

    public void sortName()
    {
        names.sort(Comparator.comparing(String::toString));
    }

    public String getName()
    {
        return names.get(indice++);
    }

    public ArrayList<String> getNames()
    {
        return names;
    }
}
