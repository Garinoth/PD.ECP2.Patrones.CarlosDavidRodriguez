package composite.expression;

public class Numero extends Expresion {

    private int valor;
    
    public Numero(int valor) {
        this.valor = valor;
    }

    @Override
    public int operar() {
        return this.valor;
    }

    @Override
    public String toString() {
        return Integer.toString(this.valor);
    }
}
