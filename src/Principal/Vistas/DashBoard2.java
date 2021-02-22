/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author yaxkin-pc
 */
public class DashBoard2 extends javax.swing.JFrame {

    public static boolean cerra = false;
    public static boolean cerra1 = false;

    public boolean estacerrado(Object obj) {
        JInternalFrame[] activos = Escritorio.getAllFrames();
        boolean cerrado = true;
        int i = 0;
        while (i < activos.length && cerrado) {
            if (activos[i] == obj) {
                cerrado = false;
                cerra = false;
                cerra1 = false;
            }
            i++;
        }
        return cerrado;
    }

    /**
     * Creates new form DashBoard2
     */
    public DashBoard2() {
        initComponents();
        this.setResizable(false);
        this.setSize(1090, 710);
        this.setTitle("MENU PRINCIPAL");
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UserConect = new javax.swing.JTextField();
        hora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vUsuarios = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Escritorio.jpg"));
        Image image = icon.getImage();
        Escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image, 0,0,getWidth(),getHeight(),this);
            }
        };
        Mercancias = new javax.swing.JLabel();
        Caja = new javax.swing.JLabel();
        registro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/conectado.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 50));

        UserConect.setEditable(false);
        UserConect.setBackground(new java.awt.Color(179, 202, 210));
        UserConect.setText("Usuario");
        jPanel1.add(UserConect, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 130, 30));

        hora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora.setText("HORA");
        jPanel1.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 140, -1));

        fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("FECHA");
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 140, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        jLabel4.setText("INFORMACION");
        jLabel4.setToolTipText("");
        jLabel4.setFocusable(false);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 90, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPrincipal.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 690));

        vUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vUsuariosMouseClicked(evt);
            }
        });
        jPanel1.add(vUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 70, 80));

        jPanel2.setLayout(null);
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 1000, 610));

        Escritorio.setPreferredSize(new java.awt.Dimension(970, 590));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jPanel1.add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 1000, 570));

        Mercancias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mercancias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MercanciasMouseClicked(evt);
            }
        });
        jPanel1.add(Mercancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 70, 100));

        Caja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CajaMouseClicked(evt);
            }
        });
        jPanel1.add(Caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 70, 100));

        registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroMouseClicked(evt);
            }
        });
        jPanel1.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 80, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 685));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Caja ca = new Caja();
    Mercancia me = new Mercancia();
    Empleados us = new Empleados();
    RegistroVentas rv = new RegistroVentas();
    private void vUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vUsuariosMouseClicked
        JOptionPane.showMessageDialog(null, "No tiene permisos" ,"Aviso" ,0,
                new ImageIcon(getClass().getResource("/imagenes/advertencia.png")));
    }//GEN-LAST:event_vUsuariosMouseClicked

    private void MercanciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MercanciasMouseClicked
        JOptionPane.showMessageDialog(null, "No tiene permisos" ,"Aviso" ,0,
                new ImageIcon(getClass().getResource("/imagenes/advertencia.png")));
    }//GEN-LAST:event_MercanciasMouseClicked

    private void CajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaMouseClicked
        if (estacerrado(ca)) {
            Escritorio.add(ca);
            ca.show();
            ca.setResizable(false);
            me.dispose();
            us.dispose();
            rv.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana LISTA DE Caja\nya esta abierta !!!", "Aviso", 0,
                    new ImageIcon(getClass().getResource("/imagenes/advertencia.png")));
        }
    }//GEN-LAST:event_CajaMouseClicked

    private void registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroMouseClicked
        JOptionPane.showMessageDialog(null, "No tiene permisos" ,"Aviso" ,0,
                new ImageIcon(getClass().getResource("/imagenes/advertencia.png")));
    }//GEN-LAST:event_registroMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Fehca del sistema
        Date sistemaFech = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd MMMM yyyy");
        fecha.setText(formato.format(sistemaFech));

        //Hora del sistema
        Timer tiempo = new Timer(100, new DashBoard2.horas());
        tiempo.start();
    }//GEN-LAST:event_formWindowOpened

    class horas implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date sistemaHora = new Date();
            String pmAm = "hh:mm:ss a";
            SimpleDateFormat formato = new SimpleDateFormat(pmAm);
            Calendar now = Calendar.getInstance();
            hora.setText(String.format(formato.format(sistemaHora), now));
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
            java.util.logging.Logger.getLogger(DashBoard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Caja;
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel Mercancias;
    public static javax.swing.JTextField UserConect;
    public static javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel registro;
    private javax.swing.JLabel vUsuarios;
    // End of variables declaration//GEN-END:variables
}
