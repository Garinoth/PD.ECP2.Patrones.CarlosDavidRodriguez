package text;

import java.util.ArrayList;

public abstract class CompuestoTexto extends Componente {
    
    private ArrayList<Componente> texto;

    public CompuestoTexto() {
        this.texto = new ArrayList<Componente>();
    }
    
    public ArrayList<Componente> getTexto() {
        return texto;
    }
    
    @Override
    public void remove(Componente c) {
        this.texto.remove(c);
    }

    @Override
    public boolean isCompuesto() {
        return true;
    }

    @Override
    public String dibujar(boolean mayusculas) {
        String res = "";
        for (Componente c : texto) {
            res = res + c.dibujar(mayusculas);
        }
        return res;
    }

}
