package visitor.ejemplo_taxes;

public class Main {
    public static void main(String[] args) {
        //Distintos tipos de visitor
        TaxVisitor taxCalc = new TaxVisitor();
        HolidayTaxVisitor taxHolidayCalc = new HolidayTaxVisitor();

        //productos
        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tabacco cigars = new Tabacco(19.99);

        //calculo el impuesto normal para cada item
        System.out.println(milk.accept(taxCalc) + "\n");
        System.out.println(vodka.accept(taxCalc) + "\n");
        System.out.println(cigars.accept(taxCalc) + "\n");

        System.out.println("TAX HOLIDAY PRICES\n");

        //impuesto de festividades
        System.out.println(milk.accept(taxHolidayCalc) + "\n");
        System.out.println(vodka.accept(taxHolidayCalc) + "\n");
        System.out.println(cigars.accept(taxHolidayCalc) + "\n");
    }
}
