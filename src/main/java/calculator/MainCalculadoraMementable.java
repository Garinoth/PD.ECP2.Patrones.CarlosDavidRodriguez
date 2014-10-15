package calculator;

import upm.jbb.IO;
import calculator.controllers.ComandoDeshacer;
import calculator.controllers.ComandoGuardar;
import calculator.controllers.ComandoImprimir;
import calculator.controllers.ComandoIniciar;
import calculator.controllers.ComandoRestar;
import calculator.controllers.ComandoSumar;
import calculator.controllers.GestorComandos;
import calculator.models.CalculadoraMementable;
import calculator.models.GestorMementos;
import calculator.models.MementoCalculadora;

public class MainCalculadoraMementable {
    private GestorComandos gestorComandos;
    
    public MainCalculadoraMementable() {
        CalculadoraMementable calc = new CalculadoraMementable();
        GestorMementos<MementoCalculadora> gestorMementos = new GestorMementos<MementoCalculadora>();
        this.gestorComandos = new GestorComandos();
        this.gestorComandos.add(new ComandoSumar(calc));
        this.gestorComandos.add(new ComandoRestar(calc));
        this.gestorComandos.add(new ComandoIniciar(calc));
        this.gestorComandos.add(new ComandoImprimir(calc));
        this.gestorComandos.add(new ComandoGuardar(calc, gestorMementos));
        this.gestorComandos.add(new ComandoDeshacer(calc, gestorMementos));
        
    }

    public void ejecutar() {
        String key = (String) IO.in.select(this.gestorComandos.keys());
        this.gestorComandos.execute(key);
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCalculadoraMementable());
    }
}
