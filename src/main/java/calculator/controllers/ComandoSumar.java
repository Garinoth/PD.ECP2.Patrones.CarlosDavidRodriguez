package calculator.controllers;

import upm.jbb.IO;
import calculator.models.Calculadora;

public class ComandoSumar extends ComandoGeneral {

    private static final String NAME = "Sumar";

    public ComandoSumar(Calculadora calculadora) {
        super(calculadora, NAME);
    }

    @Override
    public void execute() {
        this.getCalculadora().sumar(IO.in.readInt());
    }
}
