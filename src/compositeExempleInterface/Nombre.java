package compositeExempleInterface;
public class Nombre implements Expression{
public int valeur;
public Nombre(int valeur){
this.valeur = valeur;
}
@Override
public int getResultat() {
	// TODO Auto-generated method stub
	return this.valeur;
}
} 