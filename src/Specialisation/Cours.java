package Specialisation;
public class Cours extends Matiere implements Enseignement{
	
	/**
	 * Constructeur afin de creer les cours
	 * 
	 * @param idm
	 * @see Matiere
	 */
	public Cours(String idm) {
		super(idm); 
		
	/**
		*Renseigne l'ID de la matiere
	*/
		
		
	}

	
	public void enseigner(){
		System.out.println("                   le cours de ------>" + this.idmatiere);
	}
	

}
