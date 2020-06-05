package liste;

public class Binaire implements Expression{
    /**
     * On considère le cas binaire,c'est à dire deux opérandes.
     * Composition ---->Il faut deux expressions.
     */
    public Expression op1;
    public Expression op2;
    public Binaire(Expression op1, Expression op2){
        this.op1 = op1;
        this.op2 = op2;
    }


    @Override
    public int getResultat() {
        int résultat =this.op1.getResultat()+this.op2.getResultat();
        return  résultat;

    }


}
