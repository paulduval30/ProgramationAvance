package FabriquesSuite1;

public class Test {
	
	public static void main(String[] args) {
			
/***
* On doit prevoir notre fabrique : l'objet qui va s'occuper de l'appel des constructeurs.
*/
		SimpleFabriqueDePizzas fabrique = new SimpleFabriqueDePizzas();
		Pizzeria pizzeria = new Pizzeria(fabrique);
/***
* IL suffit de faire le choix de la pizza dans cet appel !	
*/	
		pizzeria.commanderPizza("fromage");
		pizzeria.commanderPizza("burger");
		pizzeria.commanderPizza("carnivore");
		
		}
}
