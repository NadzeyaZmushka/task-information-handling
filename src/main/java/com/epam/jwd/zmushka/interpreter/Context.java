package com.epam.jwd.zmushka.interpreter;

import java.util.ArrayDeque;
import java.util.Deque;

public class Context {

    private final Deque<MathExpression> contextValues = new ArrayDeque<>();
    private static Context instance;

    private Context() {
    }

    static Context getInstance() {
        if (instance == null) {
            instance = new Context();
        }
        return instance;
    }

    public MathExpression popValue() {
        return contextValues.pop();
    }

    public void pushValue(MathExpression expression) {
        contextValues.push(expression);
    }

}
