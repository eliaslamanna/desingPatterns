package visitor.ejemplo_taxes;

//acepta un visitor, este se le pasa en la ejecucion entonces tanto la accion como la forma de realizar esta accion
//va a depender completamente del visitor

public interface Visitable {
    double accept(Visitor visitor);
}
