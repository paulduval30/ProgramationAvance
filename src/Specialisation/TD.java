package Specialisation;

public class TD extends Matiere implements Enseignement{

	public TD(String idm) {
		super(idm);
		
	}

	public void enseigner(){
		System.out.println("                   le TD de ------>" + this.idmatiere);
	}
		

}
