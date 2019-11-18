package projet1.solarsystem;

public enum Matiere
{
    GAZ("gaz"),
    FER("fer"),
    ROCHE("roche");

    private String name;

    Matiere(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
