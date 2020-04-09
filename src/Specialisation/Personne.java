package Specialisation;

import java.util.ArrayList;
import java.util.Iterator;




public abstract class Personne {

	public int ref_Personne;
	public String nom;
	public String prenom;
	
	public ArrayList<Enseignement> listeEns;
	
	/**
	 * <strong> Toutes les informations des contructeurs sont renseigné ici et hérités par les sous sous classes </strong>
	 * @param r ID de la personne 
	 * @param n Nom de la personne
	 * @param p Prénom de la personne
	 * @param e Cours données 
	 * @see Doctorant()
	 * @see MaitreConf()
	 * @see Vacataire()
	 * 
	 */
	public Personne (int r, String n, String p, ArrayList<Enseignement> e){
		ref_Personne=r;
		nom=n;
		prenom=p;
		listeEns=e;
	}
	
	
	
	/**
	 * <strong>Utilise l'iterator pour faire le tour des cours que donne les profs</strong>
	 */
	public void enseigner(){
	Iterator <Enseignement> itr = listeEns.iterator();
		while (itr.hasNext()){
			Enseignement element = itr.next();
			element.enseigner();
			
		}
		
	}
	
		
	public int getRef_Personne() {
		return ref_Personne;
	}

	public void setRef_Personne(int ref_Personne) {
		this.ref_Personne = ref_Personne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 *<p> Affiche que le prof x donne le cours de : </p>
	 */
	public void afficher(){
		System.out.println(prenom+" "+nom+" fait cours de :");
	}
	
	
	
	
	
	 
}
