package PatronAdapteur;

public class Adapter implements PileI {
    public StackI stack;
    public Adapter(StackI stack){
        this.stack = stack;
    }

    @Override
    public void empiler(Object o) {
        stack.push(o);
    }

    @Override
    public Object depiler() {
        stack.pop();
        return null;
    }

    @Override
    public boolean estVide() {
        stack.isEmpty();
        return false;
    }
}
