package FabriquesSuite2;

public class PizzeriaStrasbourg extends Pizzeria{

	Pizza creerPizza(String choix) {
		if (choix.equals("fromage")) {
		return new PizzaFromageStyleStrasbourg();
		} else if (choix.equals("fruitsDeMer")) {
		return new PizzaFruitsDeMerStyleStrasbourg();
		} else return null;
		}	
}
