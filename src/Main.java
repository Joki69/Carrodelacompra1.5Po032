import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        ArrayList<Producto>carrito=new ArrayList<>();

        carrito.add(new ProductoInformatica(2,"Ordenador",1232131123,2));
        carrito.add(new ProductoAlimentacion(3,"Arroz",23131232,2022,10,22));

        System.out.println(carrito);


    }

}