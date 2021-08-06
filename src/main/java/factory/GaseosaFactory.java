package factory;

public class GaseosaFactory {

    private static GaseosaFactory instance;

    private GaseosaFactory() {
    }

    public static GaseosaFactory getInstance() {
        if(instance == null) {
            instance = new GaseosaFactory();
        }
        return instance;
    }

    public Gaseosa construir(String tipo) {
        switch (tipo) {
            case "Coca Cola":
                return new Coca();
            case "Pepsi":
                return new Pepsi();
            default:
                return null;
        }
    }
}
