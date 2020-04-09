package Specialisation;
public class TP extends Matiere implements Enseignement {

	public TP(String idm) {
		super(idm);
		
	}

	public void enseigner(){
		System.out.println("                   le TP de ------>" + this.idmatiere);
	}
	
	
}
