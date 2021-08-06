package singleton;

public class Main {
    public static void main(String[] args) {
        //Accedo a el metodo saludar pero desde la instancia
        System.out.println(SingletonClass.getInstance().saludar());
    }
}
