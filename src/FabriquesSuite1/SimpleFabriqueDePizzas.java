package FabriquesSuite1;

/**
 * Une fabrique qui n'a pour vocation que de c�er des pizzas.
 * Le code qui d�pend des instanciations a �t� d�plac� � cette fabrique.
 *
 */
public class SimpleFabriqueDePizzas {
	
// La m�thode appelee par les clients. Elle s'occupe des intanciations.
	
public Pizza creerPizza(String type) {
Pizza pizza = null;
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
	} else if (type.equals("burger")) {
	pizza = new PizzaBurger();
	}else if (type.equals("carnivore")) {
	pizza = new PizzaCarnivore();
	}return pizza;
}
}