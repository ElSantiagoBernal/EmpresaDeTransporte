/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import excepciones.CampoIdVacioException;
import excepciones.UsuarioNoRegistradoException;
import javax.swing.JOptionPane;
import modelos.Administrador;
import modelos.Cajero;
import modelos.Despachador;
import modelos.Pasajero;
import modelos.Usuario;

/**
 *
 * @author SANTIAGO
 */
public class VentanaGestionInfo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaGestionInfo
     */
    VentanaLogIn ventanaLogIn;

    public VentanaGestionInfo(VentanaLogIn ventanaLogIn) {
        initComponents();
        setLocationRelativeTo(this);
        this.ventanaLogIn = ventanaLogIn;
        txtCantidadVehiculosDespachados.setEditable(false);
        txtCantidadTiquetesVendidos.setEditable(false);
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
        jPanel2 = new javax.swing.JPanel();
        txtIdUsuarioBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtApellidoUsuario = new javax.swing.JTextField();
        cmbGeneroUsuario = new javax.swing.JComboBox<>();
        txtContraseña = new javax.swing.JTextField();
        txtCantidadVehiculosDespachados = new javax.swing.JTextField();
        txtCantidadTiquetesVendidos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEditarInformacion = new javax.swing.JButton();
        btnElimianarUsuario = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 150));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTION DE INFORMACION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR USUARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        txtIdUsuarioBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdUsuarioBuscar.setText("Identificación");
        txtIdUsuarioBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdUsuarioBuscarMouseClicked(evt);
            }
        });
        txtIdUsuarioBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdUsuarioBuscarKeyTyped(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBuscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Id");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addComponent(txtIdUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACION USUARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        txtNombreUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreUsuario.setText("Nombre/s");
        txtNombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreUsuarioMouseClicked(evt);
            }
        });
        txtNombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreUsuarioKeyTyped(evt);
            }
        });

        txtApellidoUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoUsuario.setText("Apellidos/s");
        txtApellidoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApellidoUsuarioMouseClicked(evt);
            }
        });
        txtApellidoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoUsuarioKeyTyped(evt);
            }
        });

        cmbGeneroUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el genero", "Masculino", "Femenino", " " }));

        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseña.setText("Contraseña");
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
        });

        txtCantidadVehiculosDespachados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadVehiculosDespachados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCantidadVehiculosDespachadosMouseClicked(evt);
            }
        });
        txtCantidadVehiculosDespachados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadVehiculosDespachadosActionPerformed(evt);
            }
        });

        txtCantidadTiquetesVendidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cantidad vehiculos despachados");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad tiquetes vendidos");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Genero");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido/s");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre/s");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña");

        btnEditarInformacion.setText("Editar");
        btnEditarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarInformacionActionPerformed(evt);
            }
        });

        btnElimianarUsuario.setText("Eliminar");
        btnElimianarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimianarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbGeneroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarInformacion))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCantidadVehiculosDespachados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(txtCantidadTiquetesVendidos, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(btnElimianarUsuario))
                        .addGap(36, 36, 36))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadVehiculosDespachados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbGeneroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadTiquetesVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnElimianarUsuario)
                    .addComponent(btnEditarInformacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 550, 380));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVolver.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 110, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Bus2.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            if (txtIdUsuarioBuscar.getText().isEmpty() || txtIdUsuarioBuscar.getText().equals("Identificación")) {
                throw new CampoIdVacioException();
            }
            String id = txtIdUsuarioBuscar.getText();
            Usuario p = ventanaLogIn.controladorUsuario.buscarUsuarioIdentificacion(id);
            if (p instanceof Administrador) {
                JOptionPane.showMessageDialog(null, "No puedes gestionar la infirmacion de otro administradior");
            } else if (p instanceof Pasajero) {
                JOptionPane.showMessageDialog(null, "No puedes gestionar la informacion de un pasajero");
            } else if (p != null) {
                limpiarCampos();
                llenarCampos(p);
            } else {
                JOptionPane.showMessageDialog(null, "No hay usuario registrado");
            }

        } catch (CampoIdVacioException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        VentanaAdministrador ventana = new VentanaAdministrador(ventanaLogIn);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtCantidadVehiculosDespachadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadVehiculosDespachadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadVehiculosDespachadosActionPerformed

    private void txtIdUsuarioBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdUsuarioBuscarMouseClicked
        // TODO add your handling code here:
        txtIdUsuarioBuscar.setText(null);
    }//GEN-LAST:event_txtIdUsuarioBuscarMouseClicked

    private void txtIdUsuarioBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdUsuarioBuscarKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdUsuarioBuscarKeyTyped

    private void txtNombreUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreUsuarioMouseClicked
        // TODO add your handling code here:
        txtNombreUsuario.setText(null);
    }//GEN-LAST:event_txtNombreUsuarioMouseClicked

    private void txtNombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuarioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreUsuarioKeyTyped

    private void txtApellidoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoUsuarioMouseClicked
        // TODO add your handling code here:
        txtApellidoUsuario.setText(null);
    }//GEN-LAST:event_txtApellidoUsuarioMouseClicked

    private void txtApellidoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoUsuarioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoUsuarioKeyTyped

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        // TODO add your handling code here:
        txtContraseña.setText(null);
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void txtCantidadVehiculosDespachadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadVehiculosDespachadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadVehiculosDespachadosMouseClicked

    private void btnEditarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarInformacionActionPerformed
        // TODO add your handling code here:
        try {
            String id = txtIdUsuarioBuscar.getText();
            String nuevoNombre = txtNombreUsuario.getText();
            String nuevoApellido = txtApellidoUsuario.getText();
            String nuevoGenero = cmbGeneroUsuario.getSelectedItem().toString();
            String nuevaContra = txtContraseña.getText();

            Usuario usuario = ventanaLogIn.controladorUsuario.buscarUsuarioIdentificacion(id);
            if (usuario != null) {
                if (usuario instanceof Pasajero) {
                    JOptionPane.showMessageDialog(null, "No puedes editar un pasajero");
                } else if (usuario instanceof Administrador) {
                    JOptionPane.showMessageDialog(null, "No puedes editar un administrador");
                } else if (usuario instanceof Pasajero) {
                    ventanaLogIn.controladorUsuario.editarInfoUsuario(id, nuevoNombre,
                            nuevoApellido, nuevoGenero, nuevaContra);
                    JOptionPane.showMessageDialog(null, "Se edito");
                    limpiarCampos();
                } else {
                    ventanaLogIn.controladorUsuario.editarInfoUsuario(id, nuevoNombre,
                            nuevoApellido, nuevoGenero, nuevaContra);
                    JOptionPane.showMessageDialog(null, "Se edito");
                    limpiarCampos();
                }

            } else {
                JOptionPane.showMessageDialog(null, "El usuario no esta registrado");
            }

        } catch (UsuarioNoRegistradoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_btnEditarInformacionActionPerformed

    private void btnElimianarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimianarUsuarioActionPerformed
        // TODO add your handling code here:
        try {
            if (txtIdUsuarioBuscar.getText().isEmpty() || txtIdUsuarioBuscar.getText().equals("Identificación")) {
                throw new CampoIdVacioException();
            }
            String idUsuario = txtIdUsuarioBuscar.getText();
            Usuario usuario = ventanaLogIn.controladorUsuario.buscarUsuarioIdentificacion(idUsuario);
            if (usuario != null) {
                if (usuario instanceof Pasajero) {
                    JOptionPane.showMessageDialog(null, "No puedes eliminar un pasajero");
                } else if (usuario instanceof Administrador) {
                    JOptionPane.showMessageDialog(null, "No puedes eliminar un administrador");
                } else if (usuario instanceof Cajero) {
                    ventanaLogIn.controladorUsuario.eliminarUsuario(idUsuario);
                    ventanaLogIn.controladorUsuario.eliminarPersonaRegistradaAdmin(ventanaLogIn.usuarioLogeado);
                    JOptionPane.showMessageDialog(null, "Se elimino el cajero");
                    limpiarCampos();
                } else {
                    ventanaLogIn.controladorUsuario.eliminarPersonaRegistradaAdmin(ventanaLogIn.usuarioLogeado);
                    ventanaLogIn.controladorUsuario.eliminarUsuario(idUsuario);
                    JOptionPane.showMessageDialog(null, "Se elimino el despachador");
                    limpiarCampos();
                }

            } else {
                JOptionPane.showMessageDialog(null, "El usuario no esta registrado");
            }
        } catch (CampoIdVacioException ex) {
        }

    }//GEN-LAST:event_btnElimianarUsuarioActionPerformed
    private void llenarCampos(Usuario p) {
        txtNombreUsuario.setText(p.getNombre());
        txtApellidoUsuario.setText(p.getApellido());
        cmbGeneroUsuario.setSelectedItem(p.getGenero());
        txtContraseña.setText(p.getContraseña());
        if (p instanceof Cajero) {
            txtCantidadTiquetesVendidos.setText(String.valueOf(((Cajero) p).getNumTiquetesVendidos()));
        } else if (p instanceof Despachador) {
            txtCantidadVehiculosDespachados.setText(String.valueOf(((Despachador) p).getCantidadVehiculosDespachados()));
        }
    }

    private void limpiarCampos() {
        txtCantidadTiquetesVendidos.setText(null);
        txtCantidadVehiculosDespachados.setText(null);
        txtNombreUsuario.setText("Nombre/s");
        txtApellidoUsuario.setText("Apellidos/s");
        cmbGeneroUsuario.setSelectedIndex(0);
        txtContraseña.setText("Contraseña");
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaGestionInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaGestionInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaGestionInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaGestionInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaGestionInfo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditarInformacion;
    private javax.swing.JButton btnElimianarUsuario;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbGeneroUsuario;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtApellidoUsuario;
    private javax.swing.JTextField txtCantidadTiquetesVendidos;
    private javax.swing.JTextField txtCantidadVehiculosDespachados;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtIdUsuarioBuscar;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
