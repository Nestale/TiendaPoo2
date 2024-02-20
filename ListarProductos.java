import java.util.ArrayList;

public class ListarProductos {
    public static void listar(ArrayList<Producto> listaProductos) {
        for (Producto producto : listaProductos) {
            if (producto instanceof Nacional) {
                System.out.println("Tipo de producto Nacional");
            } else if (producto instanceof Importado) {
                System.out.println("Tipo de producto Importado");
            }

            System.out.println("Código: " + producto.getCodigo() + "\n" + "Nombre: " + producto.getNombre() + "\n");

        }
    }
}
