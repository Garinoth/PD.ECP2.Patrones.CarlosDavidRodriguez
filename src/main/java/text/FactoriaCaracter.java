package text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

    private static FactoriaCaracter factory;
    private Map<Character, Caracter> caracteres;
    
    private FactoriaCaracter() {
        this.caracteres = new HashMap<Character, Caracter>();
    }
    
    public static FactoriaCaracter getFactoria() {
        if (factory == null) {
            factory = new FactoriaCaracter();
        }
        return factory;
    }
    
    public Caracter get(char c) {
        if (!this.caracteres.containsKey(c)) {
            this.caracteres.put(c, new Caracter(c));
        }
        return this.caracteres.get(c);
    }
}
