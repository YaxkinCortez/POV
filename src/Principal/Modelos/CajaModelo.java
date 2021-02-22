/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.Modelos;

import BaseDeDatos.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Principal.Controlador.CajaControlador;
import Principal.Controlador.MercanciaControlador;
import Principal.Vistas.Caja;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yaxkin-pc
 */
public class CajaModelo {

    private int dato;
    private int cont = 1;
    private String num = "";
    static Conectar cc = new Conectar();
    static Connection cn = cc.GetConexion();
    static PreparedStatement ps;
    static ResultSet rs;
    MercanciaControlador mc = new MercanciaControlador();
    Caja cj = new Caja();
    static int rsu = 0;

    public static int guardarVenta(CajaControlador uc) {
        String sql = CajaControlador.REGISTRARVENTA;
        String sql2 = CajaControlador.REGISTRARDETALLE;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getFactura());
            ps.setString(2, uc.getRFC());
            ps.setString(3, uc.getMonto());
            ps.setString(4, uc.getFecha());
            rsu = ps.executeUpdate();
            
            ps = cn.prepareStatement(sql2);
            ps.setString(1, uc.getIdVenta());
            ps.setString(2, uc.getCodigo());
            ps.setString(3, uc.getCantidad());
            ps.setString(4, uc.getPrecioVenta());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        System.out.println(sql);
        return rsu;
    }

    public static int detalleVenta(CajaControlador uc) {
        String sql = CajaControlador.REGISTRARDETALLE;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getFactura());
            ps.setString(2, uc.getCodigo());
            ps.setString(3, uc.getCantidad());
            ps.setString(4, uc.getPrecioVenta());
            ps.setString(5, uc.getPrecioTotal());
            rsu = ps.executeUpdate();
     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        System.out.println(sql);
        return rsu;
    }

    
    public static int eliminar(String id) {
        String sql = CajaControlador.ELIMINAR;

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminaTodos() {
        String sql = CajaControlador.ELIMINAR_TODO;
        try {
            ps = cn.prepareStatement(sql);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        System.out.println(sql);
        return rsu;
    }

    public static boolean isNumber(String n) {
        try {
            if (Integer.parseInt(n) > 0) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
    }



    public void numeroId(int dato) {
        this.dato = dato;
        if ((this.dato >= 10000000) || (this.dato < 100000000)) {
            int can = cont + this.dato;
            num = "" + can;
        }
        if ((this.dato >= 1000000) || (this.dato < 10000000)) {
            int can = cont + this.dato;
            num = "0" + can;
        }
        if ((this.dato >= 100000) || (this.dato < 1000000)) {
            int can = cont + this.dato;
            num = "00" + can;
        }
        if ((this.dato >= 10000) || (this.dato < 100000)) {
            int can = cont + this.dato;
            num = "000" + can;
        }
        if ((this.dato >= 1000) || (this.dato < 10000)) {
            int can = cont + this.dato;
            num = "0000" + can;
        }
        if ((this.dato >= 100) || (this.dato < 1000)) {
            int can = cont + this.dato;
            num = "00000" + can;
        }
        if ((this.dato >= 9) || (this.dato < 100)) {
            int can = cont + this.dato;
            num = "000000" + can;
        }
        if (this.dato < 9) {
            int can = cont + this.dato;
            num = "0000000" + can;
        }
    }

    public String serie() {
        return this.num;
    }

    public static void numeros() {
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = CajaControlador.FACTURAMAXIMA;
        try {
            Statement st = cn.createStatement();
            rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                Principal.Vistas.Caja.Factura.setText("00000001");
            } else {
                j = Integer.parseInt(c);
                GenerarNumero gen = new GenerarNumero();
                gen.generar(j);
                Principal.Vistas.Caja.Factura.setText(gen.serie());

            }

        } catch (SQLException ex) {
            Logger.getLogger(CajaModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
