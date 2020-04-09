package Specialisation;
import java.util.ArrayList;

/**
 * Classe Main
 * @author Richard
 * @version 0.1
 * */
//avant chaque méthode renseigner les méthodes et ce qu'elle retourne
public class Test {

	public static void main(String[] args) {
		/**
		 * @see cours()
		 * @see TP()
		 * @see TD()
		 * 
		 * Création des objets cours, TP, TD
		 */
		Cours m1=new Cours("Réseaux");
		Cours m2=new Cours("Programmation");
		TP m3=new TP("SQL");
		TP m4=new TP("Virtualisation");
		TD m5=new TD("Maths");
		TD m6=new TD("Statistiques");
		
		/**
		 * On entre les différents cours, tps ou tds dans une liste par prof 
		 */
		ArrayList<Enseignement> ServicePapillon=new ArrayList<Enseignement>();
		ServicePapillon.add(m1);
		ServicePapillon.add(m2);
		ServicePapillon.add(m5);
		
		ArrayList<Enseignement> ServiceDavid=new ArrayList<Enseignement>();
		ServiceDavid.add(m3);
		ServiceDavid.add(m4);
		
		ArrayList<Enseignement> ServiceMartin=new ArrayList<Enseignement>();
		ServiceMartin.add(m6);
		/**
		 * Les services selon chaque enseignant
		 */
		MaitreConf p1=new MaitreConf(1,"Alain","Papillon",ServicePapillon);
		Doctorant p2=new Doctorant(2,"Julie","David",ServiceDavid);
		Vacataire p3=new Vacataire(3,"Guillaume","Martin", ServiceMartin);
		
		System.out.println(".............................................");
		p1.afficher();
		p1.enseigner();
		System.out.println(".............................................");
		p2.afficher();
		p2.enseigner();
		System.out.println("............................................");
		p3.afficher();
		p3.enseigner();
	
		
	   
		

}
}
