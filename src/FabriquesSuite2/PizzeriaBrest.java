package FabriquesSuite2;

public class PizzeriaBrest extends Pizzeria {
Pizza creerPizza(String choix) {
if (choix.equals("fromage")) {
return new PizzaFromageStyleBrest();
}  else if (choix.equals("fruitsDeMer")) {
return new PizzaFruitsDeMerStyleBrest();
} else return null;
}
}