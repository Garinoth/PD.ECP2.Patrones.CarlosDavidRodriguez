package text;

public class Caracter extends Componente {
    
    private char caracter;

    public Caracter(char c) {
        this.caracter = c;
    }

    @Override
    public void add(Componente c) {
        
    }

    @Override
    public void remove(Componente c) {
        
    }

    @Override
    public boolean isCompuesto() {
        return false;
    }

    @Override
    public String dibujar(boolean mayusculas) {
        String res = "";
        if (mayusculas){
            res = res + Character.toUpperCase(caracter);
        } else {
            res = res + caracter;
        }
        return res;
    }

}
