package visitor.ejemplo_taxes;

public class HolidayTaxVisitor implements Visitor {

    //calcula el precio de cada clase

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor Item: Price with Tax");
        return (liquorItem.getPrice() * .10) + liquorItem.getPrice();
    }

    @Override
    public double visit(Tabacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with Tax");
        return (tobaccoItem.getPrice() * .30) + tobaccoItem.getPrice();
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity Item: Price with Tax");
        return necessityItem.getPrice();
    }
}