package Principal.Vistas;

import BaseDeDatos.Conectar;
import Principal.Modelos.SesionModelo;
import com.placeholder.PlaceHolder;
import com.sun.awt.AWTUtilities;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author yaxkin-pc
 */
public class Sesion extends javax.swing.JFrame {

    /**
     * Creates new form Sesion
     */
    public Sesion() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        this.setLocationRelativeTo(null);
        PlaceHolder();
        this.setResizable(false);
    }

    private void PlaceHolder() {
        PlaceHolder Pl = new PlaceHolder(Nombre, "Usuario");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Contra = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        Entrar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(140, 30, 110, 120);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contrasena.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 270, 64, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 190, 64, 70);
        jPanel2.add(Nombre);
        Nombre.setBounds(110, 220, 170, 30);

        Contra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContraKeyPressed(evt);
            }
        });
        jPanel2.add(Contra);
        Contra.setBounds(110, 280, 170, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("INICIO DE SESION");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(110, 150, 180, 30);

        Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciar-sesion.png"))); // NOI18N
        Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarMouseClicked(evt);
            }
        });
        jPanel2.add(Entrar);
        Entrar.setBounds(160, 340, 70, 80);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTRAR");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(170, 410, 60, 17);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/apagar.png"))); // NOI18N
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        jPanel2.add(Salir);
        Salir.setBounds(360, 10, 24, 24);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 0, 400, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseClicked
        Acceso();
    }//GEN-LAST:event_EntrarMouseClicked

    private void ContraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Acceso();
        }
    }//GEN-LAST:event_ContraKeyPressed

    private void Acceso() {
        String Usuario = this.Nombre.getText();
        String Pass = this.Contra.getText();
        if (Usuario.equals("") && Pass.equals("")) {
            JOptionPane.showMessageDialog(this, "Campos requeridos");
        } else {
            Ingresa(Usuario, Pass);
        }
    }

    Conectar cc = new Conectar();
    Connection cn = cc.GetConexion();

    private void Ingresa(String id, String pas) {
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
                        dispose();
                        DashBoard mp = new DashBoard();
                        JOptionPane.showMessageDialog(this, "BIENVENIDO " + dato, "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                        mp.UserConect.setText(dato);
                        mp.setVisible(true);
                        mp.setSize(1090, 710);
                        mp.setLocationRelativeTo(null);

                    } else {

                        String sql3 = "SELECT nick FROM empleados WHERE nick = '" + id + "'";
                        Statement st3 = cn.createStatement();
                        ResultSet rs3 = st3.executeQuery(sql3);
                        while (rs3.next()) {
                            dato = rs3.getString(1);
                        }
                        dispose();
                        DashBoard2 mp2 = new DashBoard2();
                        JOptionPane.showMessageDialog(this, "BIENVENIDO " + dato, "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                        mp2.UserConect.setText(dato);
                        mp2.setVisible(true);
                        mp2.setLocationRelativeTo(null);

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Contraseña incorrecta", "Acceso", 0);
                    this.Contra.setText("");
                    this.Nombre.transferFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "No existe éste usuario.", "Acceso", 0);
                this.Contra.setText("");
                this.Nombre.transferFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SesionModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPasswordField Contra;
    private javax.swing.JLabel Entrar;
    public static javax.swing.JTextField Nombre;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}