package projet1.solarsystem;

public class Etoile extends Objet
{
    private int age;
    private String type;

    public Etoile(int age, String type, double masse, String name, double diametre)
    {
        super(masse, name, diametre);
        this.age = age;
        this.type = type;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
