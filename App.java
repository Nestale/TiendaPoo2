import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Producto> listaProductos = new ArrayList<>();

        Nacional salpicon = new Nacional("Salpicon", 15, "DBC142");

        Importado teclado = new Importado("Teclado logitech A24", 1238, "IPA45");

        AgregarProductos.Agregar(listaProductos, salpicon);

        AgregarProductos.Agregar(listaProductos, teclado);

        ListarProductos.listar(listaProductos);

       System.out.println(Producto.buscar(15, listaProductos));

       System.out.println(Producto.buscar(235, listaProductos));
    }
}