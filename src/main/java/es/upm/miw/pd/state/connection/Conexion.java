package es.upm.miw.pd.state.connection;

public class Conexion {
    private Context estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = new Context(link);
        estado.setState(new CloseState());
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estado.getEstado();
    }

    public void abrir() {
    	estado.open();
    }

    public void cerrar() {
    	estado.close();
    }

    public void parar() {
    	estado.stop();
    }

    public void iniciar() {
    	estado.start();
    }

    public void enviar(String msg) {
    	estado.send(msg);
    }

    public void recibir(int respuesta) {
    	estado.fetch(respuesta);
    }

}
