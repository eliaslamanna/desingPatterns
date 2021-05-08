package state;

public class Ventanilla {

    private String cajero;
    private EstadoVentanilla estado;

    public Ventanilla() {
        this.estado = new Abierta();
    }

    public void suspendete() {
        this.estado = new Suspendida();
    }

    public void cerrate() {
        this.estado = new Cerrada();
    }

    public void abrite() {
        this.estado = new Abierta();
    }

    public void atende(Persona persona) {
        this.estado.atende(persona);
    }

    public String getCajero() {
        return this.cajero;
    }
}
