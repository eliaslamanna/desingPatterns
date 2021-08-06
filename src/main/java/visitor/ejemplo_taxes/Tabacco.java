package visitor.ejemplo_taxes;

class Tabacco implements Visitable {

    private double price;

    Tabacco(double item) {
        price = item;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}
