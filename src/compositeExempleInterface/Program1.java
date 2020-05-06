package compositeExempleInterface;
public class Program1  {
public static void main(String[] args) {

Expression exp1 = new Nombre(10);
Expression exp2 = new Nombre(20);

ExpressionsComposites exp3 = new ExpressionsComposites();
exp3.ajouter(exp1);
exp3.ajouter(exp2);

ExpressionsComposites exp4 = new ExpressionsComposites();
exp4.ajouter(exp1);
exp4.ajouter(exp3);
//System.out.println("Addition = " +exp4.getResultat());

ExpressionsComposites exp5 = new ExpressionsComposites();
exp5.ajouter(exp2);
exp5.ajouter(exp3);
exp5.ajouter(exp4);
System.out.println("Addition = " +exp5.getResultat());







}
}