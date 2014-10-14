package calculator.controllers;

import upm.jbb.IO;
import calculator.models.Calculadora;
import calculator.models.CalculadoraMementable;
import calculator.models.GestorMementos;
import calculator.models.MementoCalculadora;

public class ComandoDeshacer extends ComandoGeneral implements Comando {
    
    private static final String NAME = "Deshacer";

    private GestorMementos<MementoCalculadora> gestorMementos;
    
    public ComandoDeshacer(Calculadora calculadora, GestorMementos<MementoCalculadora> gestorMementos) {
        super(calculadora, NAME);
        this.gestorMementos = gestorMementos;
    }

    @Override
    public void execute() {
        CalculadoraMementable calc = (CalculadoraMementable)this.getCalculadora();
        calc.restoreMemento(this.gestorMementos.getMemento((String) IO.in.select(gestorMementos.keys(), "Restaurar")));
    }

}
