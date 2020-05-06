package composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class Operation implements IExpression, Iterable<Expression>
{
    protected Collection<Expression> expressions;

    /**
     * Initialise l�Operation avec les operandes op1 et op2
     */
    public Operation()
    {
        this.expressions = new ArrayList<>();
    }

    public void add(Expression e)
    {
        this.expressions.add(e);
    }

    public Iterator<Expression> iterator() {
        return this.expressions.iterator();
    }
}

