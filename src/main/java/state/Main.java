package state;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez", 21);
        Persona persona2 = new Persona("Sabrina", "Campas", 71);
        Persona persona3 = new Persona("Liz", "Juarez", 82);
        Persona persona4 = new Persona("JJ", "Rodriguez", 42);

        Banco banco = new Banco();
        banco.atende(persona1);

        banco.suspendeVentanilla();

        banco.atende(persona2);
        banco.atende(persona3);

        banco.cerraVentanilla();
        banco.atende(persona4);
    }
}
