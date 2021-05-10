package visitor;

public class ProductoNormal implements Visitable {

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private double precio;

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
