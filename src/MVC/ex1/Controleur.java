package MVC.ex1;

import MVC.ex1.IHM.MainFrame;
import MVC.ex1.Model.DisplayNumber;

public class Controleur
{
    private final MainFrame frame;
    private DisplayNumber number;

    public Controleur(DisplayNumber number)
    {
        this.number = number;
        this.frame = new MainFrame(this);
        this.number.addObserver(frame);
    }

    public int getNumber()
    {
        return number.getValue();
    }

    public void setNumber(int num)
    {
        this.number.setValue(num);
    }

    public static void main(String[] argv)
    {
        new Controleur(new DisplayNumber(4));
    }
}
