public class Producto {
    private float precio;
    private String nombre;
    private int codigoDeBarras;

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Producto(float precio, String nombre, int codigoDeBarras) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigoDeBarras = codigoDeBarras;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", codigoDeBarras=" + codigoDeBarras +
                '}';
    }
}
