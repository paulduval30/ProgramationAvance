package Cours2;

public class MainDecorateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Livre livre1=new LivreBroche();
	livre1=new EnvoiAvecPoste(livre1);
	
	Livre livre2=new LivreBroche();
	livre2=new EnvoiAvecPoste(livre2);
	System.out.println(livre2.gettitre());
	System.out.println(livre2.getprix());
	
	Livre livre3=new LivreBroche();
	livre3=new EnvoiAvecPoste(livre3);
	livre3=new EnvoiPointRelais(livre3);
	System.out.println(livre3.gettitre());
	System.out.println(livre3.getprix());
			
	}

}
