public class Importado extends Producto{

    public String licenciaImporacion;

    public Importado(String nombre, int codigo, String licenciaImporacion) {
        super(nombre, codigo);
        this.licenciaImporacion = licenciaImporacion;
    }
    
}
