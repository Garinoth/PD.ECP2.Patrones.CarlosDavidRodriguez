package composite.expression;

public class Sumar extends Operacion {

    public Sumar(Expresion operando1, Expresion operando2) {
        super(operando1, operando2);
    }

    @Override
    public int operar() {
        return this.getOperando1().operar() + this.getOperando2().operar();
    }

    @Override
    public String toString() {
        return "("+this.getOperando1().toString()+"+"+this.getOperando2().toString()+")";
    }

}
