import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        LocalDate currentdate = LocalDate.now();
        int mes= currentdate.getMonthValue();
        int dia= currentdate.getDayOfMonth();
        int año= currentdate.getYear();


        ArrayList<Producto>carrito=new ArrayList<>();
        Producto Naranja= new ProductoAlimentacion();



    }
}