import java.util.ArrayList;

public class Producto {
    
    String nombre;
    private int codigo;

    public Producto(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public static String buscar(int codigo, ArrayList<Producto> lista){
        for (Producto producto : lista) {
            if (producto.getCodigo() == codigo){
                return producto.nombre;
            }
        }
        return "Producto no esta registrado";
    }

    public String getNombre() {
        return nombre;
    }

    
}
