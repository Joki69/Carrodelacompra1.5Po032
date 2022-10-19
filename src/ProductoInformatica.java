public class ProductoInformatica extends Producto{
    private int garantia;

    public ProductoInformatica(float precio, String nombre, int codigoDeBarras, int garantia) {
        super(precio, nombre, codigoDeBarras);
        this.garantia=garantia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ProductoInformatica{" +
                "garantia=" + garantia +
                '}';
    }
}
