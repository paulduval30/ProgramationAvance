package FabriquesSuite2;

public class Test {
public static void main(String[] args) {
Pizzeria boutiqueBrest = new PizzeriaBrest();
Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg();
Pizza pizza = boutiqueBrest.commanderPizza("fromage");
System.out.println("Luc a commande une " + pizza.getNom() + "\n");
pizza = boutiqueStrasbourg.commanderPizza("fromage");
System.out.println("Michel a commande une " + pizza.getNom() + "\n");
}
}