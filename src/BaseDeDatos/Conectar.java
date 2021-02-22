package BaseDeDatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author yaxkin-pc
 */
public class Conectar {

    public Connection GetConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost/sam", "root", "");
            return conect;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos");
        }
        return null;
    }
}
