package br.com.gabriel.calculadora;

//Aqui é realizada importação da lib resonsável pelos cálculos.
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
