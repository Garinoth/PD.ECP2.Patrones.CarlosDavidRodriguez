package calculator.controllers;

import calculator.models.Calculadora;

public class ComandoIniciar extends ComandoGeneral {
    
    private static final String NAME = "Iniciar";

    public ComandoIniciar(Calculadora calc) {
        super(calc, NAME);
    }

    @Override
    public void execute() {
        this.getCalculadora().iniciar();
    }

}
