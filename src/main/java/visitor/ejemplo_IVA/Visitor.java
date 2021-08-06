package visitor.ejemplo_IVA;

public interface Visitor {
    public double visit(ProductoNormal normal);
    public double visit(ProductoDescuento reducido);
}
