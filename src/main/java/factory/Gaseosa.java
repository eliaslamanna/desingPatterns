package factory;

public abstract class Gaseosa {
    protected String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void abrir() {
        System.out.println("Abriste una gaseosa " + this.getNombre());
    }
}
