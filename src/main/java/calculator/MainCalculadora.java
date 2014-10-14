package calculator;

import upm.jbb.IO;
import calculator.controllers.ComandoImprimir;
import calculator.controllers.ComandoIniciar;
import calculator.controllers.ComandoRestar;
import calculator.controllers.ComandoSumar;
import calculator.controllers.GestorComandos;
import calculator.models.Calculadora;

public class MainCalculadora {
    private GestorComandos gestor;

    public MainCalculadora() {
        Calculadora calc = new Calculadora();
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoSumar(calc));
        this.gestor.add(new ComandoRestar(calc));
        this.gestor.add(new ComandoIniciar(calc));
        this.gestor.add(new ComandoImprimir(calc));
    }

    public void ejecutar() {
        String key = (String) IO.in.select(this.gestor.keys());
        this.gestor.execute(key);
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCalculadora());
    }
}
