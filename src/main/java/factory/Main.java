package factory;

public class Main {
    public static void main(String[] args) {
        Gaseosa coca = GaseosaFactory.getInstance().construir("Coca Cola");
        coca.abrir();

        Gaseosa pepsi = GaseosaFactory.getInstance().construir("Pepsi");
        pepsi.abrir();
    }
}
