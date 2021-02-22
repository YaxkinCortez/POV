package Principal.Modelos;

import BaseDeDatos.Conectar;
import Principal.Controlador.VentasControlador;
import Principal.Vistas.RegistroVentas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yaxkin-pc
 */
public class VentasModelo {

    static ResultSet rs;
    static Statement st;
    static Conectar cc = new Conectar();
    static Connection cn = cc.GetConexion();
    static PreparedStatement ps;

    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) Principal.Vistas.RegistroVentas.TBregistro.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql=VentasControlador.LISTAR;
        String datos[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("factura");
                datos[1] = rs.getString("codigo");
                datos[2] = rs.getString("cantidad");
                datos[3] = rs.getString("precioVenta");
                datos[4] = rs.getString("precioTotal");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentasModelo.class.getName()).log(Level.SEVERE, null, ex);
           /* JOptionPane.showMessageDialog(null, "No se encontro una factura");
            RegistroVentas.buscar.setText("");*/
        }
    }

}
