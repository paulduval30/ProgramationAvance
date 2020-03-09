package Cours2;

public class EnvoiAvecPoste extends DecorateurLivre {

	
	public EnvoiAvecPoste(Livre l){
		super(l);
		this.livre=l;	
	}
		
	
	@Override
	public String gettitre() {
		// TODO Auto-generated method stub
		return livre.gettitre()+",envoye par la poste";
	}

	@Override
	public double getprix() {
		// TODO Auto-generated method stub
		return livre.getprix()+3.80;
	}

}
