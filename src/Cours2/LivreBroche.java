package Cours2;

public class LivreBroche implements Livre {
	public String titre;
	private double prix;
	
	public LivreBroche(){
	
		settitre("LivreBroche");
		setprix(10.50);
	
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
