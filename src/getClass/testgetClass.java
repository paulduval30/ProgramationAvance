package getClass;
import java.util.*;

public class testgetClass {
    public static void main(String[] args) {
        Personne2 p = new Personne2("Remy","Emmanuel");
        Class cl= p.getClass();
        Class cl1 = Personne.class ; // Pour le suffixe .class il faut importer java.util.*;
        Class cl2 = int.class ;
        Class cl3 = Double[].class ;
    }

}
class Personne2 {
    private String nom,prenom;
    public Personne2 (String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }
}
