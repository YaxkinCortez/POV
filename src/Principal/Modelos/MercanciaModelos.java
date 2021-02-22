package Principal.Modelos;

import BaseDeDatos.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Principal.Controlador.MercanciaControlador;
import Principal.Vistas.Mercancia;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author yaxkin-pc
 */
public class MercanciaModelos {
    Principal.Vistas.Mercancia me = new Mercancia();
    static ResultSet rs;
    static Statement st;
    static Conectar cc = new Conectar();
    static Connection cn = cc.GetConexion();
    static PreparedStatement ps;
    int r;

    public static int registrar(MercanciaControlador uc) {
        int rsu = 0;
        String sql = MercanciaControlador.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getPrimaryKey());
            ps.setString(2, uc.getProducto());
            ps.setString(3, uc.getPrecio());
            ps.setString(4, uc.getStock());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Codigo Repetido"+Mercancia.Codigo.getText());
        }
        System.out.println(sql);
        return rsu;
    }

    public static int actualizar(MercanciaControlador uc) {
        int rsu = 0;
        String sql = MercanciaControlador.ACTUALIZAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getProducto());
            ps.setString(2, uc.getPrecio());
            ps.setString(3, uc.getStock());
            ps.setString(4, uc.getPrimaryKey());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Codigo Repetido"+Mercancia.Codigo.getText());
        }
        return rsu;
    }

    public static int eliminar(String id) {
        int rsu = 0;
        String sql = MercanciaControlador.ELIMINAR;

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminaTodos() {
        int rsu = 0;
        String sql = MercanciaControlador.ELIMINAR_TODO;
        try {
            ps = cn.prepareStatement(sql);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(sql);
        return rsu;
    }
    
    public int actualizarStock(String cantidad, String codigo){
        String sql=MercanciaControlador.ACTUALIZARSTOCK;
        try {
            ps=cn.prepareStatement(sql);
            ps.setString(1, cantidad);
            ps.setString(2, codigo);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MercanciaModelos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) Principal.Vistas.Mercancia.TBproductos.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = MercanciaControlador.LISTAR;
        } else {
            sql = "SELECT * FROM mercancias WHERE (codigo like'" + busca + "%'"
                    + " or producto like'" + busca + "%')"
                    + " ORDER BY producto";
        }
        String datos[] = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("codigo");
                datos[1] = rs.getString("producto");
                datos[2] = rs.getString("precio");
                datos[3] = rs.getString("stock");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MercanciaModelos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void listar2(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) Principal.Vistas.ListarMercancia.TBlistar.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = MercanciaControlador.LISTAR;
        } else {
            sql = "SELECT * FROM mercancias WHERE (codigo like'" + busca + "%'"
                    + " or producto like'" + busca + "%')"
                    + " ORDER BY producto";
        }
        String datos[] = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("codigo");
                datos[1] = rs.getString("producto");
                datos[2] = rs.getString("precio");
                datos[3] = rs.getString("stock");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MercanciaModelos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
