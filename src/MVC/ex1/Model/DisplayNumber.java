package MVC.ex1.Model;


import java.util.Observable;

public class DisplayNumber extends Observable
{
    private int value;

    public DisplayNumber(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
        setChanged();
        notifyObservers();
    }


}
