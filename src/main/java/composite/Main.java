package composite;

public class Main {
    public static void main(String[] args) {
        //clases individuales
        DeptoFinanciero deptoFinanciero = new DeptoFinanciero();
        DeptoVentas deptoVentas = new DeptoVentas();
        DeptoFinanciero deptoFinanciero2 = new DeptoFinanciero();
        DeptoVentas deptoVentas2 = new DeptoVentas();

        //clases composite
        DeptoComposite deptoComposite = new DeptoComposite();
        DeptoComposite deptoComposite2 = new DeptoComposite();

        deptoComposite.agregarDepto(deptoFinanciero);
        deptoComposite.agregarDepto(deptoVentas);

        deptoComposite2.agregarDepto(deptoFinanciero2);
        deptoComposite2.agregarDepto(deptoVentas2);

        //meto un composite dentro de otro
        deptoComposite.agregarDepto(deptoComposite2);

        //Para obtener los nombres ejecuto desde la clase compostie y esta va a recorrer cada uno ejecutandolo
        deptoComposite.getName();
    }
}
