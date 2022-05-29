package decorator;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thin dough";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of dough: " + 4.00);
        return 4.00;
    }

}
