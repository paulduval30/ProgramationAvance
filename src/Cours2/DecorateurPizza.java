package Cours2;

public abstract class DecorateurPizza implements Pizza {
	protected Pizza pizza;

	public DecorateurPizza(Pizza l){
		this.pizza=l;
	}
	public abstract String getnom();
	public abstract double getprix();

}
