package liste;

public class Nombre implements Expression{
    // Elément primitif
    public int valeur;
    public Nombre(int valeur){
        this.valeur = valeur;
    }
    @Override
    public int getResultat() {
        return this.valeur;
    }
}