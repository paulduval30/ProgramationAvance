	package compositeExempleInterface;
	import java.util.Collection;
	import java.util.ArrayList;
	import java.util.Iterator;

	public class ExpressionsComposites implements Expression, Iterable<Expression>{

	private Collection<Expression> sousExpressions;
	
	public ExpressionsComposites(){
	this.sousExpressions = new ArrayList<Expression>();
	}

	public void ajouter(Expression expression) {
	this.sousExpressions.add(expression);
	}
	public void supprimer(Expression expression) {
	this.sousExpressions.remove(expression);
	}
	@Override
	public int getResultat() {
		int resultat=0;
		 Iterator<Expression> it = this.iterator();
		while(it.hasNext()){
			Expression x = it.next();
 		
 		resultat=resultat+x.getResultat();		
		}
		return  resultat;
	}

	public Iterator<Expression> iterator() {
	return this.sousExpressions.iterator();
	}

	}	

