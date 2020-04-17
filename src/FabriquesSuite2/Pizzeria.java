package FabriquesSuite2;

public abstract class Pizzeria {
abstract Pizza creerPizza(String type);
public Pizza commanderPizza(String type) {
Pizza pizza;
pizza = creerPizza(type);
pizza.preparer();
pizza.cuire();
pizza.couper();
pizza.emballer();
return pizza;
}

}