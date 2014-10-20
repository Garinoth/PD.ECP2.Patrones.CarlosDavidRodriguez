package text;

public abstract class Componente {

    public Componente() {
        
    }
    
    public abstract void add(Componente c);
    public abstract void remove(Componente c);
    public abstract boolean isCompuesto();
    public abstract String dibujar(boolean mayusculas);
}
