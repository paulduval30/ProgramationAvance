package Specialisation;

public abstract class Matiere {
	public String idmatiere;

	
	public Matiere (String idm){
		idmatiere=idm;
	}
	
	public void afficher() {
		System.out.println(idmatiere);
		}
	
}

