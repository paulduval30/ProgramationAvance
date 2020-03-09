package Cours2;

public abstract class DecorateurLivre implements Livre {
	protected Livre livre;

	public DecorateurLivre(Livre l){

		this.livre=l;	
	}
	public abstract String gettitre();
	public abstract double getprix();

}
