package decorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        //Para ir chequeando que voy haciendo
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", mozzarella";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + .50;
    }

}
