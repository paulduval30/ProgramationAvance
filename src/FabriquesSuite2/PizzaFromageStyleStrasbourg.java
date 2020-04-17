package FabriquesSuite2;

public class PizzaFromageStyleStrasbourg extends Pizza {
public PizzaFromageStyleStrasbourg() {
nom = "Pizza fromage style Strasbourg ";
pate = "Extra �paisse";
sauce = "aux tomates cerise";
garnitures.add("Lamelles de mozzarella");
}
void couper() {
System.out.println("Decoupage en parts carrees");
}
}