package Principal.Controlador;

/**
 *
 * @author yaxkin-pc
 */
public class VentasControlador {

    public static String LISTAR = "SELECT factura, codigo, cantidad, precioVenta, precioTotal FROM detalles_venta";

    public static String ELIMINAR = "DELETE FROM detalles_venta WHERE factura=?";

    private static String factura;
    private static String codigo;
    private static String cantidad;
    private static String precioVenta;

    public static String getFactura() {
        return factura;
    }

    public static void setFactura(String factura) {
        VentasControlador.factura = factura;
    }

    public static String getCodigo() {
        return codigo;
    }

    public static void setCodigo(String codigo) {
        VentasControlador.codigo = codigo;
    }

    public static String getCantidad() {
        return cantidad;
    }

    public static void setCantidad(String cantidad) {
        VentasControlador.cantidad = cantidad;
    }

    public static String getPrecioVenta() {
        return precioVenta;
    }

    public static void setPrecioVenta(String precioVenta) {
        VentasControlador.precioVenta = precioVenta;
    }

}
