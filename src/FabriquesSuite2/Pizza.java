package FabriquesSuite2;
import java.util.ArrayList;

public abstract class Pizza {
String nom;
String pate;
String sauce;
ArrayList garnitures = new ArrayList();

void preparer() {
System.out.println("Preparation de " + nom);
System.out.println("etalage de la pate "+ pate);
System.out.println("Ajout de la sauce "+ sauce);
System.out.println("Ajout des garnitures: ");
for (int i = 0; i < garnitures.size(); i++) {
System.out.println(" " + garnitures.get(i));
}
}
void cuire() {
System.out.println("Cuisson 25 minutes a 180°");
}
void couper() {
System.out.println("Decoupage en parts triangulaires");
}
void emballer() {
System.out.println("Emballage dans une bo�te offcielle");
}
public String getNom() {
return nom;
}
}