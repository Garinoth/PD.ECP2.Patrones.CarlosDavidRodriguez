package state.connection;

public class EstadoEsperando extends EstadoConexion {

    public EstadoEsperando() {

    }

    @Override
    public void abrir(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void cerrar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void parar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void iniciar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        conexion.getLink().recibir(respuesta);
        if (respuesta == 0) {
            conexion.setEstado(new EstadoPreparado());
        } else if (respuesta > 0) {
            conexion.setEstado(new EstadoCerrado());
        }
        assert false: "Código de respuesta no válido";
    }

    @Override
    public Estado getEstado() {
        return Estado.ESPERANDO;
    }

}
