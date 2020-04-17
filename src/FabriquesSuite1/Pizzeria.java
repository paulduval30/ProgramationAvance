package FabriquesSuite1;

public class Pizzeria {
	
//La reference a la fabrique.
	
SimpleFabriqueDePizzas fabrique;

//Transmision de la fabrique a la Pizzeria.

public Pizzeria(SimpleFabriqueDePizzas fabrique) {
this.fabrique = fabrique;
}


public Pizza commanderPizza(String type) {
Pizza pizza;
pizza = fabrique.creerPizza(type);
pizza.preparer();
pizza.cuire();
pizza.couper();
pizza.emballer();
return pizza;
}
// autres methodes
}