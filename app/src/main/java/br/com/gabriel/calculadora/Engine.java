package br.com.gabriel.calculadora;

import org.mariuszgromada.math.mxparser.*;

public class Engine {
    protected String result;

    public Engine() { }

    public String calc(String visor) {
        String novoVisor = visor.replaceAll(",", ".");
        Expression expression = new Expression(novoVisor);
        result = String.valueOf(expression.calculate());

        return result.replace(".", ",");
    }
}
