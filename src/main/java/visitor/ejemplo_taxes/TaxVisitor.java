package visitor.ejemplo_taxes;
import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

    //calcula el precio del item con su impuesto

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor Item: Price with Tax");
        return (liquorItem.getPrice() * .18) + liquorItem.getPrice();
    }

    @Override
    public double visit(Tabacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with Tax");
        return (tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice();
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity Item: Price with Tax");
        return necessityItem.getPrice();
    }

}
