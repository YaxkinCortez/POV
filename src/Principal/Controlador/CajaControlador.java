package Principal.Controlador;

/**
 *
 * @author yaxkin-pc
 */
public class CajaControlador {

    public static String LISTAR = "SELECT * FROM venta";

    public static String REGISTRARVENTA = "INSERT INTO venta(factura, RFC, monto, fecha) "
            + "VALUES(?,?,?,?)";
    
    public static String REGISTRARDETALLE = "INSERT INTO detalles_venta(factura, codigo, cantidad, precioVenta, precioTotal) "
            + "VALUES(?,?,?,?,?)";

    public static String ELIMINAR = "DELETE FROM venta WHERE numero = ?";

    public static String ELIMINAR_TODO = "DELETE FROM venta";
    
    public static String FACTURAMAXIMA = "SELECT MAX(factura) FROM detalles_venta";

    private String factura;
    private String RFC;
    private String monto;
    private String fecha;
    private String idVenta;
    private String codigo;
    private String cantidad;
    private String precioVenta;
    private String precioTotal;

    public String getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(String precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }
    

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
