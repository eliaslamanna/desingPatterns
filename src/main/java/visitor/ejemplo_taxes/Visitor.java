package visitor.ejemplo_taxes;

//visita distintos casos de tipo de objeto

public interface Visitor {
    double visit(Liquor liquorItem);
    double visit(Tabacco tabaccoItem);
    double visit(Necessity necessityItem);
}
