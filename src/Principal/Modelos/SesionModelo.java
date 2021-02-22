package Principal.Modelos;

import Principal.Vistas.Sesion;
import BaseDeDatos.Conectar;
import Principal.Vistas.DashBoard;
import Principal.Vistas.DashBoard2;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yaxkin-pc
 */
public class SesionModelo {

    Sesion AL = new Sesion();
    Conectar cc = new Conectar();
    Connection cn = cc.GetConexion();

    public void Ingresa(String id, String pas) {
        String dato = null;
        try {
            String sql = "SELECT nick FROM empleados WHERE nick = '" + id + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.first()) {
                String sql1 = "SELECT contra FROM empleados WHERE contra = '" + pas + "'";
                Statement st1 = cn.createStatement();
                ResultSet rs1 = st1.executeQuery(sql1);
                if (rs1.first()) {
                    String sql2 = "SELECT tipo_empleado FROM empleados WHERE nick = '" + id + "'"
                            + " and contra = '" + pas + "'";
                    Statement st2 = cn.createStatement();
                    ResultSet rs2 = st2.executeQuery(sql2);
                    while (rs2.next()) {
                        dato = rs2.getString(1);
                    }

                    if (dato.equals("gerente")) {

                        String sql3 = "SELECT nombre FROM empleados WHERE nick = '" + id + "'";
                        Statement st3 = cn.createStatement();
                        ResultSet rs3 = st3.executeQuery(sql3);
                        while (rs3.next()) {
                            dato = rs3.getString(1);
                        }
                        AL.dispose();
                        DashBoard mp = new DashBoard();
                        JOptionPane.showMessageDialog(AL, "BIENVENIDO " + dato, "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                        mp.UserConect.setText(dato);
                        mp.setVisible(true);

                    } else {

                        String sql3 = "SELECT nick FROM empleados WHERE nombre = '" + id + "'";
                        Statement st3 = cn.createStatement();
                        ResultSet rs3 = st3.executeQuery(sql3);
                        while (rs3.next()) {
                            dato = rs3.getString(1);
                        }
                        DashBoard2 mp2 = new DashBoard2();
                        JOptionPane.showMessageDialog(AL, "BIENVENIDO " + dato, "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                        //mp2.UserConect.setText(dato); falta agregar el jTextField en DashBoard2
                        mp2.setVisible(true);

                    }
                } else {
                    JOptionPane.showMessageDialog(AL, "Contraseña incorrecta", "Acceso", 0);
                    AL.Contra.setText("");
                    AL.Nombre.transferFocus();
                }
            } else {
                JOptionPane.showMessageDialog(AL, "No existe éste usuario.", "Acceso", 0);
                AL.Contra.setText("");
                AL.Nombre.transferFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SesionModelo.class.getName()).log(Level.SEVERE, null, ex);
        }AL.dispose();
    }
}
