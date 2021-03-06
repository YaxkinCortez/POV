/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.Vistas;

import Principal.Controlador.EmpleadosControlador;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Principal.Modelos.EmpleadosModelos;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author yaxkin-pc
 */
public class Empleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form Usuarios
     */
    Principal.Modelos.EmpleadosModelos EM;

    public Empleados() {
        initComponents();
        TbEmpleados.getTableHeader().setDefaultRenderer(new Principal.Modelos.EstiloTablaHeader());
        TbEmpleados.setDefaultRenderer(Object.class, new Principal.Modelos.EstiloTablaRenderer());
        TbEmpleados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        limpiaCampos();
        this.setResizable(false);

        TbEmpleados.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (TbEmpleados.getSelectedRow() != -1) {
                    cambiaDatos();
                }
            }
        });
    }

    void cambiaDatos() {
        int fila = TbEmpleados.getSelectedRow();
        RFC.setText(TbEmpleados.getValueAt(fila, 0).toString());
        Nick.setText(TbEmpleados.getValueAt(fila, 1).toString());
        Nombre.setText(TbEmpleados.getValueAt(fila, 2).toString());
        ApellidoP.setText(TbEmpleados.getValueAt(fila, 3).toString());
        ApellidoM.setText(TbEmpleados.getValueAt(fila, 4).toString());
        Sexo.setText(TbEmpleados.getValueAt(fila, 5).toString());
        Direccion.setText(TbEmpleados.getValueAt(fila, 6).toString());
        Contra.setText(TbEmpleados.getValueAt(fila, 7).toString());
        Telefono.setText(TbEmpleados.getValueAt(fila, 8).toString());
        Tipo.setText(TbEmpleados.getValueAt(fila, 9).toString());
    }

    void limpiaCampos() {
        if (TbEmpleados.getSelectedRow() > -1) {
            TbEmpleados.removeRowSelectionInterval(TbEmpleados.getSelectedRow(),
                    TbEmpleados.getSelectedRow());
        }
        RFC.setText("");
        Nombre.setText("");
        Sexo.setText("");
        Tipo.setText("");
        Contra.setText("");
        ApellidoP.setText("");
        ApellidoM.setText("");
        Nick.setText("");
        Direccion.setText("");
        Telefono.setText("");
        buscar.setText("");
        EmpleadosModelos.ListarEmpleado("");
    }

    void selecionaFila(String id) {
        for (int i = 0; i < TbEmpleados.getRowCount(); i++) {
            if (id.equals(TbEmpleados.getValueAt(i, 0))) {
                TbEmpleados.setRowSelectionInterval(i, i);
                break;
            }
        }

    }

    boolean seleccionRegistro = false;
    boolean seleccionNick = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Nombre = new javax.swing.JTextField();
        ApellidoP = new javax.swing.JTextField();
        ApellidoM = new javax.swing.JTextField();
        Nick = new javax.swing.JTextField();
        RFC = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Contra = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Direccion = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        Sexo = new javax.swing.JTextField();
        Tipo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Registrar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        EliminarBase = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        buscar = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbEmpleados = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setTitle("Usuarios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(940, 120));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 120, -1));

        ApellidoP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(ApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 120, -1));

        ApellidoM.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(ApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 120, -1));

        Nick.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(Nick, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 150, -1));

        RFC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(RFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 150, -1));

        Telefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 150, -1));

        jLabel1.setText("Nombre(s)");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 31, -1, -1));

        jLabel2.setText("Apellido Paterno");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 58, -1, -1));

        jLabel3.setText("Apellido Materno");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 85, -1, -1));

        jLabel4.setText("Nick");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel5.setText("R.F.C");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel6.setText("Telefono");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jLabel7.setText("Direccion");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jLabel8.setText("Contraseña");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        jLabel9.setText("Sexo");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, -1, -1));

        Contra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 114, -1));

        Direccion.setColumns(20);
        Direccion.setRows(5);
        jScrollPane1.setViewportView(Direccion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jLabel19.setText("Tipo Usuario");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, -1, -1));

        Sexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 110, -1));

        Tipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 973, 127));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registrar.setBackground(new java.awt.Color(255, 255, 255));
        Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrar.png"))); // NOI18N
        Registrar.setText("REGISTRAR");
        Registrar.setBorderPainted(false);
        Registrar.setContentAreaFilled(false);
        Registrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Registrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        jPanel3.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        Actualizar.setBackground(new java.awt.Color(255, 255, 255));
        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualiza-base.png"))); // NOI18N
        Actualizar.setText("ACTUALIZAR");
        Actualizar.setBorderPainted(false);
        Actualizar.setContentAreaFilled(false);
        Actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Actualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 16, -1, -1));

        Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar-empleado.png"))); // NOI18N
        Eliminar.setText("ELIMINAR");
        Eliminar.setBorderPainted(false);
        Eliminar.setContentAreaFilled(false);
        Eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel3.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 16, -1, -1));

        EliminarBase.setBackground(new java.awt.Color(255, 255, 255));
        EliminarBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        EliminarBase.setText("ELIMINAR BASE");
        EliminarBase.setBorderPainted(false);
        EliminarBase.setContentAreaFilled(false);
        EliminarBase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EliminarBase.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EliminarBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBaseActionPerformed(evt);
            }
        });
        jPanel3.add(EliminarBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 16, -1, -1));

        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escoba.png"))); // NOI18N
        Limpiar.setText(" LIMPIAR CAMPOS");
        Limpiar.setBorderPainted(false);
        Limpiar.setContentAreaFilled(false);
        Limpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Limpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 16, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 138, -1, 130));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });
        jPanel4.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 164, 31));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 27, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 138, 280, 130));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel5.setToolTipText("");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TbEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RFC", "NICK", "NOMBRE", "APELLIDO P", "APELLIDO M", "SEXO", "DIRECCION", "CONTRASEÑA", "TELEFONO", "TIPO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TbEmpleados);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 16, 963, 230));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 278, 973, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 983, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        buscar.setText(buscar.getText().toUpperCase());
        Principal.Modelos.EmpleadosModelos.ListarEmpleado(buscar.getText());
    }//GEN-LAST:event_buscarKeyReleased

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        limpiaCampos();
    }//GEN-LAST:event_buscarMouseClicked

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        String pas = new String(Contra.getPassword());
        if (RFC.getText().equals("") || Nombre.getText().equals("") || Sexo.getText().equals("SEXO")
                || Tipo.getText().equals("TIPO USUARIO") || pas.equals("")
                || ApellidoP.getText().equals("") || ApellidoM.getText().equals("")
                || Direccion.getText().equals("") || Telefono.getText().equals("")
                || Nick.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos los campos\nson obligatorios.", "Empleados", 0,
                    new ImageIcon(getClass().getResource("/imagenes/informacion.png")));
        } else {
            Principal.Controlador.EmpleadosControlador us = new EmpleadosControlador();
            us.setPrimaryKey(RFC.getText());
            us.setNick(Nick.getText());
            us.setNombre(Nombre.getText());
            us.setApellidoP(ApellidoP.getText());
            us.setApellidoM(ApellidoM.getText());
            us.setSexo(Sexo.getText());
            us.setDireccion(Direccion.getText());
            us.setTipoEmpleado(Tipo.getText());
            us.setTelefono(Telefono.getText());
            us.setPassword(pas);
            int opcion = EmpleadosModelos.registrarUsuario(us);
            if (opcion != 0) {
                String id = RFC.getText();
                limpiaCampos();
                selecionaFila(id);
                JOptionPane.showMessageDialog(this, "Registro éxitoso.", "Empleados", 0,
                        new ImageIcon(getClass().getResource("/imagenes/verificar.png")));
            }
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        if (TbEmpleados.getRowCount() > 0) {
            if (TbEmpleados.getSelectedRowCount() > 0) {
                String pas = new String(Contra.getPassword());
                if (RFC.getText().equals("") || Nombre.getText().equals("") || Sexo.getText().equals("SEXO")
                        || Tipo.getText().equals("TIPO USUARIO") || pas.equals("")
                        || ApellidoP.getText().equals("") || ApellidoM.getText().equals("")
                        || Direccion.getText().equals("") || Telefono.getText().equals("")
                        || Nick.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Todos los campos\nson obligatorios.", "Empleados", 0,
                            new ImageIcon(getClass().getResource("/imagenes/informacion.png")));
                } else if (JOptionPane.showConfirmDialog(this, "Esta a punto de actualizar\nun registro."
                        + "\n¿Desea continuar?", "Empleados", JOptionPane.YES_NO_OPTION, 0,
                        new ImageIcon(getClass().getResource("/imagenes/advertencia.png")))
                        == JOptionPane.YES_OPTION) {
                    Principal.Controlador.EmpleadosControlador us = new EmpleadosControlador();
                    us.setPrimaryKey(RFC.getText());
                    us.setNick(Nick.getText());
                    us.setNombre(Nombre.getText());
                    us.setApellidoP(ApellidoP.getText());
                    us.setApellidoM(ApellidoM.getText());
                    us.setSexo(Sexo.getText());
                    us.setDireccion(Direccion.getText());
                    us.setTipoEmpleado(Tipo.getText());
                    us.setTelefono(Telefono.getText());
                    us.setPassword(pas);
                    int opcion = EmpleadosModelos.actualizarUsuario(us);
                    if (opcion != 0) {
                        String id = RFC.getText();
                        limpiaCampos();
                        selecionaFila(id);
                        JOptionPane.showMessageDialog(this, "Registro éxitoso.", "Empleados", 0,
                                new ImageIcon(getClass().getResource("/imagenes/actualizado.png")));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un registro.", "Empleados", 0,
                        new ImageIcon(getClass().getResource("/imagenes/informacion.png")));
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara actualizar.", "Empleados", 0,
                    new ImageIcon(getClass().getResource("/imagenes/informacion.png")));
        }
    }//GEN-LAST:event_ActualizarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        if (TbEmpleados.getRowCount() > 0) {
            if (TbEmpleados.getSelectedRowCount() > 0) {
                if (JOptionPane.showConfirmDialog(this, "Esta a punto de eliminar\nun registro.\n¿Desea continuar?", "Empleados", JOptionPane.YES_NO_OPTION, 0,
                        new ImageIcon(getClass().getResource("/imagenes/advertencia.png"))) == JOptionPane.YES_OPTION) {
                    int fila = TbEmpleados.getSelectedRow();
                    String id = TbEmpleados.getValueAt(fila, 0).toString();
                    int elimina = EmpleadosModelos.eliminarUsuario(id);
                    if (elimina != 0) {
                        limpiaCampos();
                        JOptionPane.showMessageDialog(this, "Registro eliminado.", "Empleados", 0,
                                new ImageIcon(getClass().getResource("/imagenes/papelera.png")));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un registro.", "Empleados", 0,
                        new ImageIcon(getClass().getResource("/imagenes/informacion.png")));
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara eliminar.", "Empleados", 0,
                    new ImageIcon(getClass().getResource("/imagenes/informacion.png")));
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void EliminarBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBaseActionPerformed
        if (TbEmpleados.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(this, "Esta a punto de elimnar\ntodos los registros.\n¿Desea continuar?", "Empleados", JOptionPane.YES_NO_OPTION, 0,
                    new ImageIcon(getClass().getResource("/imagenes/advertencia.png"))) == JOptionPane.YES_OPTION) {
                int eliminaT = EmpleadosModelos.eliminaTodos();
                if (eliminaT != 0) {
                    limpiaCampos();
                    JOptionPane.showMessageDialog(this, "Registros eliminados.", "Empleados", 0,
                            new ImageIcon(getClass().getResource("/imagenes/borrar.png")));
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara eliminar.", "Empleados", 0,
                    new ImageIcon(getClass().getResource("/imagenes/informacion.png")));
        }
    }//GEN-LAST:event_EliminarBaseActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        limpiaCampos();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JTextField ApellidoM;
    private javax.swing.JTextField ApellidoP;
    private javax.swing.JPasswordField Contra;
    private javax.swing.JTextArea Direccion;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton EliminarBase;
    private javax.swing.JButton Limpiar;
    public static javax.swing.JTextField Nick;
    private javax.swing.JTextField Nombre;
    public static javax.swing.JTextField RFC;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField Sexo;
    public static javax.swing.JTable TbEmpleados;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField Tipo;
    private javax.swing.JTextField buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
