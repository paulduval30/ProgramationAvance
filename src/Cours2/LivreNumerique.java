package Cours2;

public class LivreNumerique implements Livre {

	public String titre;
	private double prix;

	public LivreNumerique(){

		settitre("LivreNumerique");
		setprix(6.80);	
	}
	public String gettitre(){
		return titre;	
	}
	public double getprix(){
		return prix;	
	}

	public void settitre(String titre){
		this.titre=titre;	
	}

	public void setprix(double prix){
		this.prix=prix;	
	}		
}
