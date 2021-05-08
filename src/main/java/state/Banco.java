package state;

public class Banco {

    private Ventanilla ventanilla;

    public Banco() {
        ventanilla = new Ventanilla();
    }

    public void atende(Persona persona) {
        System.out.println(persona.getNombre() + " ingrese a la fila.");
        this.ventanilla.atende(persona);
    }

    public void suspendeVentanilla() {
        ventanilla.suspendete();
    }

    public void cerraVentanilla() {
        ventanilla.cerrate();
    }

    public void abrirVentanilla() {
        ventanilla.abrite();
    }
}
