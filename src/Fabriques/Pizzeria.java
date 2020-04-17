package Fabriques;
public class Pizzeria {
	
	/***
	 * Le client fait appel a cette methode pour commander une pizza.
	 * Mais, a priori,  On ne sait pas quelle pizza serait choisie.
	 * On peut pr�voir des instanciations a gogo : fromage, grecque, poivrons,...
	 * Que se passe -t-il si on doit supprimer une pizza du menu, ou en rajouter, ou changer de constructeur, ...
	 * On sera obliq� de modifier le code dans toutes les classes faisant appel aux dff�rentes instanciations. 
	 */
	
	Pizza commanderPizza(String type) {
		Pizza pizza=null;
		if (type.equals("fromage")) {
		pizza = new PizzaFromage();
		} else if (type.equals("grecque")) {
		pizza = new PizzaGrecque();
		} else if (type.equals("poivrons")) {
		pizza = new PizzaPoivrons();
		} else if (type.equals("fruitsDeMer")) {
		pizza = new PizzaFruitsDeMer();
		} else if (type.equals("vegetarienne")) {
		pizza = new PizzaVegetarienne();
		}
		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();
		return pizza;
	}
// autres m�thodes
}