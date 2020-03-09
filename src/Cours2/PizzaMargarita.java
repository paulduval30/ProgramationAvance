package Cours2;

public class PizzaMargarita implements Pizza {
	public String titre;
	private double prix;
	
	public PizzaMargarita(){
	
		setnom("PizzaMargarita");
		setprix(10.50);
	
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
