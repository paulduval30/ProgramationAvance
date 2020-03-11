package Cours2;

public class SupplementCordonBleu extends DecorateurPizza{
    public SupplementCordonBleu(Pizza p){
        super(p);
        this.pizza = p;
    }


    @Override
    public String getnom() {
        // TODO Auto-generated method stub
        return pizza.getnom()+",supplément cordon-bleu";
    }

    @Override
    public double getprix() {
        // TODO Auto-generated method stub
        return pizza.getprix()+2.5;
    }
}
