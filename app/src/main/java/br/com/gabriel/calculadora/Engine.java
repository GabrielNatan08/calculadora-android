package br.com.gabriel.calculadora;

import org.mariuszgromada.math.mxparser.*;

public class Engine {
    protected String result;

    public Engine() { }

    public String calc(String visor) {
        Expression expression = new Expression(visor);
        result = String.valueOf(expression.calculate());

        return result;
    }
}
