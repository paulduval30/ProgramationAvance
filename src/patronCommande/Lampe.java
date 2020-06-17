package patronCommande;

public class Lampe {

	String nom;
	
	public Lampe() {
	}
	public Lampe(String nom) {
		this.nom=nom;
	}
	
	public void marche() {
		System.out.println(this.nom+": lampe allum�e" );
		}
	
	public void arret() {
		System.out.println(this.nom+": lampe �teinte" );
		}
}
