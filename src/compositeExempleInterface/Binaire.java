package compositeExempleInterface;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;


public class Binaire implements Expression, Iterable<Expression>{

private Collection<Expression> sousExpressions;
public Expression op1;
public Expression op2;
public Binaire(Expression op1, Expression op2){
this.op1 = op1;
this.op2 = op2;
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
	int resultat =this.op1.getResultat()+this.op2.getResultat();
	return  resultat;

}

public Iterator<Expression> iterator() {
return this.sousExpressions.iterator();
}

} 