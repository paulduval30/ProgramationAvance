package Cours2;

public class MainDecorateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Pizza pizza1 = new PizzaCalzone();
	pizza1 = new SupplementFromage(pizza1);
	System.out.println(pizza1.getnom());
	System.out.println(pizza1.getprix());

	Pizza pizza2 = new PizzaMargarita();
	pizza2 = new SupplementFromage(pizza2);
	System.out.println(pizza2.getnom());
	System.out.println(pizza2.getprix());
	
	Pizza pizza3 = new PizzaMargarita();
	pizza3 = new SupplementFromage(pizza3);
	pizza3 = new ConsoSurPlace(pizza3);
	System.out.println(pizza3.getnom());
	System.out.println(pizza3.getprix());

	Pizza pizza4 = new PizzaMargarita();
	pizza4 = new SupplementFromage(pizza4);
	pizza4 = new SupplementCordonBleu(pizza4);
	pizza4 = new ConsoSurPlace(pizza4);
	System.out.println(pizza4.getnom());
	System.out.println(pizza4.getprix());
			
	}

}
