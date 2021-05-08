package state;

public class Suspendida implements EstadoVentanilla {

    @Override
    public void atende(Persona persona) {
        //El cajero esta ocupado pero si ve que hay una personamayor la atiende igual
        if(persona.getEdad() > 65) {
            System.out.println("Atendiendo a: " + persona.getNombre());
        }
        else {
            System.out.println("Espere 5 minutos por favor...");
        }
    }

}
