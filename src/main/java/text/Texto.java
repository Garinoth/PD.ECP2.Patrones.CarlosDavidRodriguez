package text;

public class Texto extends CompuestoTexto {

    public Texto() {
    }

    @Override
    public void add(Componente c) {
        if (!c.isCompuesto()) {
            throw new UnsupportedOperationException();
        }
        this.getTexto().add(c);
    }

    @Override
    public String dibujar(boolean mayusculas) {
        return super.dibujar(mayusculas) + "---o---\n";
    }

}
