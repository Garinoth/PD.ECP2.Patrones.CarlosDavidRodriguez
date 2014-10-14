package calculator.controllers;

import upm.jbb.IO;
import calculator.models.Calculadora;

public class ComandoImprimir extends ComandoGeneral {
    
    private static final String NAME = "Imprimir";

    public ComandoImprimir(Calculadora calculadora) {
        super(calculadora, NAME);
    }

    @Override
    public void execute() {
        IO.out.println(this.getCalculadora().getTotal());
    }

}
