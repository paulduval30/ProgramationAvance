package Cours2;

public class SupplementFromage extends DecorateurPizza {

	
	public SupplementFromage(Pizza p){
		super(p);
		this.pizza = p;
	}
		
	
	@Override
	public String getnom() {
		// TODO Auto-generated method stub
		return pizza.getnom()+",supplément fromage";
	}

	@Override
	public double getprix() {
		// TODO Auto-generated method stub
		return pizza.getprix()+1;
	}

}
