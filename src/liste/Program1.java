package liste;


import java.util.ArrayList;
import java.util.HashMap;

public class Program1 {
    public static void main(String[] args) {

        HashMap<String, Expression> expressionHashMap = new HashMap<>();

        NameGenerator nameGenerator = new NameGenerator();

        ArrayList<String> names = new ArrayList<>();

        names.add("Tesla");
        names.add("Alpha");
        names.add("Newton");
        names.add("Gama");
        names.add("Beta");
        names.add("Bob");
        names.add("Jean");
        names.add("Delta");
        names.add("Charli");
        names.add("Bravo");

        for(int i = 0; i < names.size(); i++)
        {
            int random = (int)(Math.random() * names.size());
            nameGenerator.addName(names.remove(random));
        }

        Expression exp1 = new Nombre(3210);
        Expression exp2 = new Binaire(new Nombre(33), new Nombre(33));
        Expression exp3 = new Binaire(new Nombre(33), new Binaire(new Nombre(33), new Nombre(11)));
        Expression exp4 = new Binaire(exp1, exp3);
        Expression exp5 = new Binaire(exp1, exp4);

        expressionHashMap.put(nameGenerator.getName(), exp1);
        expressionHashMap.put(nameGenerator.getName(), exp2);
        expressionHashMap.put(nameGenerator.getName(), exp3);
        expressionHashMap.put(nameGenerator.getName(), exp4);
        expressionHashMap.put(nameGenerator.getName(), exp5);

        nameGenerator.sortName();

        for (String key : nameGenerator.getNames()) {
            if(expressionHashMap.containsKey(key))
                System.out.println(key + " : " + expressionHashMap.get(key).getResultat());
        }
    }
}
