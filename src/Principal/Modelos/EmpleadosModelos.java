package Principal.Modelos;

import BaseDeDatos.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import Principal.Vistas.Empleados;
import Principal.Controlador.EmpleadosControlador;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author yaxkin-pc
 */
public class EmpleadosModelos extends Conectar {

    static Conectar cc = new Conectar();
    static Connection cn = cc.GetConexion();
    static PreparedStatement ps;


    public static int registrarUsuario(EmpleadosControlador uc) {
        int rsu = 0;
        String sql = EmpleadosControlador.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getPrimaryKey());
            ps.setString(2, uc.getNick());
            ps.setString(3, uc.getNombre());
            ps.setString(4, uc.getApellidoP());
            ps.setString(5, uc.getApellidoM());
            ps.setString(6, uc.getSexo());
            ps.setString(7, uc.getDireccion());
            ps.setString(8, uc.getPassword());
            ps.setString(9, uc.getTelefono());
            ps.setString(10, uc.getTipoEmpleado());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "RFC "+Empleados.RFC.getText()+" Esta repetido o\n"
            +"Nick "+Empleados.Nick.getText()+" Esta repetido");
        }
        System.out.println(sql);
        return rsu;
    }

    public static int actualizarUsuario(EmpleadosControlador uc) {
        int rsu = 0;
        String sql = EmpleadosControlador.ACTUALIZAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getNick());
            ps.setString(2, uc.getNombre());
            ps.setString(3, uc.getApellidoP());
            ps.setString(4, uc.getApellidoM());
            ps.setString(5, uc.getSexo());
            ps.setString(6, uc.getDireccion());
            ps.setString(7, uc.getPassword());
            ps.setString(8, uc.getTelefono());
            ps.setString(9, uc.getTipoEmpleado());
            ps.setString(10, uc.getPrimaryKey());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "RFC "+Empleados.RFC.getText()+" Esta repetido o\n"
            +"Nick "+Empleados.Nick.getText()+" Esta repetido");
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminarUsuario(String id) {
        int rsu = 0;
        String sql = EmpleadosControlador.ELIMINAR;

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminaTodos() {
        int rsu = 0;
        String sql = EmpleadosControlador.ELIMINAR_TODO;
        try {
            ps = cn.prepareStatement(sql);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }

    public static void ListarEmpleado(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) Empleados.TbEmpleados.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = EmpleadosControlador.LISTAR_US;
        } else {
            sql = "SELECT * FROM empleados WHERE (RFC like'" + busca + "%' or nombre like'" + busca + "%') "
                    + " order by nombre";
        }
        String datos[] = new String[10];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("RFC");
                datos[1] = rs.getString("nick");
                datos[2] = rs.getString("nombre");
                datos[3] = rs.getString("apellidop");
                datos[4] = rs.getString("apellidom");
                datos[5] = rs.getString("sexo");
                datos[6] = rs.getString("direccion");
                datos[7] = rs.getString("contra");
                datos[8] = rs.getString("telefono");
                datos[9] = rs.getString("tipo_empleado");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadosModelos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
