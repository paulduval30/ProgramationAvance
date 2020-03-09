package Cours2;

public class ConsoSurPlace extends DecorateurPizza{

public ConsoSurPlace(Pizza p){
		super(p);
		pizza = p;
	}
	
	@Override
	public String getnom() {
		// TODO Auto-generated method stub
		return pizza.getnom()+", sur place";
	}

	@Override
	public double getprix() {
		// TODO Auto-generated method stub
		return pizza.getprix()+0.50;
	}

}
