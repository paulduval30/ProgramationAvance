package Cours2;

public class PizzaCalzone implements Pizza {

	public String titre;
	private double prix;

	public PizzaCalzone(){

		setnom("PizzaCalzone");
		setprix(11.80);
	}
	public String getnom(){
		return titre;	
	}
	public double getprix(){
		return prix;	
	}

	public void setnom(String titre){
		this.titre=titre;	
	}

	public void setprix(double prix){
		this.prix=prix;	
	}		
}
