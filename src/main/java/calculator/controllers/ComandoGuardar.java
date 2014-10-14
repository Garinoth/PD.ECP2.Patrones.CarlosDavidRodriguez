package calculator.controllers;

import calculator.models.Calculadora;
import calculator.models.CalculadoraMementable;
import calculator.models.GestorMementos;
import calculator.models.MementoCalculadora;

public class ComandoGuardar extends ComandoGeneral implements Comando {
    
    private static final String NAME = "Guardar";
    private static int mementoID = 0;
    
    private GestorMementos<MementoCalculadora> gestorMementos;

    public ComandoGuardar(Calculadora calculadora, GestorMementos<MementoCalculadora> gestorMementos) {
        super(calculadora, NAME);
        this.gestorMementos = gestorMementos;
    }

    @Override
    public void execute() {
        CalculadoraMementable calc = (CalculadoraMementable)this.getCalculadora();
        this.gestorMementos.addMemento(Integer.toString(mementoID++), calc.createMemento());
    }

}
