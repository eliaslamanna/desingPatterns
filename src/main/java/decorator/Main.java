package decorator;

public class Main {
    public static void main(String[] args) {

        //va de atras para adelante agregando las cosas
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());

        /*
        Adding Dough
        Adding Moz
        Adding Sauce
        Ingredients: Thin dough, mozzarella, tomato sauce
        Cost of dough: 4.0
        Price: 4.85
         */
    }
}
