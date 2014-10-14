package calculator.controllers;

import upm.jbb.IO;
import calculator.models.Calculadora;

public class ComandoRestar extends ComandoGeneral {

    private static final String NAME = "Restar";
    
    public ComandoRestar(Calculadora calculadora) {
        super(calculadora, NAME);
    }
    
    @Override
    public void execute() {
        this.getCalculadora().restar(IO.in.readInt());
    }

}
