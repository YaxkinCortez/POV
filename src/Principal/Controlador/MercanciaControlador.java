package Principal.Controlador;

/**
 *
 * @author yaxkin-pc
 */
public class MercanciaControlador {

    public static String LISTAR = "SELECT * FROM mercancias ORDER BY producto";

    public static String REGISTRAR = "INSERT INTO mercancias(codigo,producto,precio,stock) "
            + "VALUES(?,?,?,?)";

    public static String ACTUALIZAR = "UPDATE mercancias SET "
            + "producto=?,"
            + "precio=?,"
            + "stock=? WHERE codigo=?";
    
    public static String ACTUALIZARSTOCK = "UPDATE mercancias SET "
            + "stock=? WHERE codigo=?";

    public static String ELIMINAR = "DELETE FROM mercancias WHERE codigo = ?";

    public static String ELIMINAR_TODO = "DELETE FROM mercancias";

    private String primaryKey;
    private String producto;
    private String precio;
    private String stock;

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
