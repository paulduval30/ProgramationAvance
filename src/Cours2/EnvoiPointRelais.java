package Cours2;

public class EnvoiPointRelais extends DecorateurLivre{

public EnvoiPointRelais(Livre l){
		super(l);
		livre=l;	
	}
	
	@Override
	public String gettitre() {
		// TODO Auto-generated method stub
		return livre.gettitre()+", � un point relais";
	}

	@Override
	public double getprix() {
		// TODO Auto-generated method stub
		return livre.getprix()+1.50;
	}

}
