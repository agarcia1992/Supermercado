/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloAdministrador;
import clases.MetUsuario; 
import clases.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Usuarios extends javax.swing.JInternalFrame {

    DefaultTableModel tablauser = new DefaultTableModel();
    Usuario user = new Usuario();
    MetUsuario muser = new MetUsuario();
    
    public Usuarios() {
        initComponents();
        ListarUsuario();
    }

    public void ListarUsuario(){
     List<Usuario> Listaruser = muser.ListarUsuarios();
        tablauser = (DefaultTableModel) TablaUsuarios.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < Listaruser.size(); i++) {
            ob[0] = Listaruser.get(i).getCodigo_usuario();
            ob[1] = Listaruser.get(i).getUsuario();
            ob[2] = Listaruser.get(i).getContrasena_usuario();
            ob[3] = Listaruser.get(i).getEstado_usuario();
            ob[4] = "Cliente";
            tablauser.addRow(ob);
        }
        TablaUsuarios.setModel(tablauser);
    }
    
    public void Habilitar(){
       txtUsuario.setEnabled(true);
       txtContrasena.setEnabled(true);
       //txtDireccion.setEnabled(true);
    }
    
    public void Deshabilitar(){
       txtUsuario.setEnabled(false);
       txtContrasena.setEnabled(false);
       //txtDireccion.setEnabled(false);
    }
    
    public void LimpiarCampos(){
        txtID.setText("");
        txtUsuario.setText("");
        txtContrasena.setText("");
        //txtDireccion.setText("");
    }
    
     public void LimpiarTabla()
     {
        for (int i = 0; i < tablauser.getRowCount(); i++) {
           tablauser.removeRow(i);
           i=i-1;
        }
     }
     
     private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
      TablaUsuarios.clearSelection();
      LimpiarCampos();
      btnGuardar.setEnabled(true);
      btnNuevo.setEnabled(true);
      btnActualizar.setEnabled(true);
      btnEliminar.setEnabled(true);
      Deshabilitar();
    }                                    

    private void formMouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
      TablaUsuarios.clearSelection();
      LimpiarCampos();
      btnGuardar.setEnabled(true);
      btnNuevo.setEnabled(true);
      btnActualizar.setEnabled(true);
      btnEliminar.setEnabled(true);
      Deshabilitar();
    } 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombre3 = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Usuario", "Contrasena", "Estado", "Rol"
            }
        ));
        TablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaUsuarios);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel3.setText("Telefono");

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        jScrollPane2.setViewportView(txtDireccion);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel4.setText("Direccion");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/emblemunreadable_93487.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/emblemunreadable_93487.png"))); // NOI18N
        btnActivar.setText("Activar");
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel6.setText("PANTALLA USUARIOS");

        txtID.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel5.setText("Codigo");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel7.setText("Usuario");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel8.setText("Contrasena");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel9.setText("Rol");

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/diskette_save_saveas_1514.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1497619949-jd13_85182.png"))); // NOI18N
        btnActualizar.setText("Acualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(314, 314, 314))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(34, 34, 34)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(7, 7, 7)
                        .addComponent(btnGuardar)
                        .addGap(7, 7, 7)
                        .addComponent(btnActualizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(btnActivar)
                        .addComponent(btnEliminar))
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaUsuariosMouseClicked
        Habilitar();
        int fila = TablaUsuarios.rowAtPoint(evt.getPoint());

        txtID.setText(TablaUsuarios.getValueAt(fila, 0).toString());
        txtUsuario.setText(TablaUsuarios.getValueAt(fila, 1).toString());
        txtContrasena.setText(TablaUsuarios.getValueAt(fila, 2).toString());
        //txtTelefono.setText(TablaUsuarios.getValueAt(fila, 2).toString());
        //txtDireccion.setText(TablaUsuarios.getValueAt(fila, 3).toString());
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);

    }//GEN-LAST:event_TablaUsuariosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigo = txtID.getText();

        if(isBlank(codigo)){
            JOptionPane.showMessageDialog(null, "Seleccione la fila a eliminar");
        }else{
            int confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if(confirmacion == 0){
                int id = Integer.parseInt(txtID.getText());
                muser.EliminarUsuarios(id);
                LimpiarTabla();
                LimpiarCampos();
                ListarUsuario();
                Deshabilitar();
                btnGuardar.setEnabled(true);
                btnNuevo.setEnabled(true);
                btnActualizar.setEnabled(true);
                btnEliminar.setEnabled(true);

            }
        }

        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        // TODO add your handling code here:
        String codigo = txtID.getText();

        if(isBlank(codigo)){
            JOptionPane.showMessageDialog(null, "Seleccione la fila a activar");
        }else{
            int confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro de activar");
            if(confirmacion == 0){
                int id = Integer.parseInt(txtID.getText());
                muser.ActivarUsuarios(id);
                LimpiarTabla();
                LimpiarCampos();
                ListarUsuario();
                Deshabilitar();
                btnGuardar.setEnabled(true);
                btnNuevo.setEnabled(true);
                btnActualizar.setEnabled(true);
                btnActivar.setEnabled(true);

            }
        }
    }//GEN-LAST:event_btnActivarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        Habilitar();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String Usuario = txtUsuario.getText();
        String Contrasena = txtContrasena.getText();
        String Direccion = txtDireccion.getText();

        if(isBlank(Usuario) || isBlank(Contrasena) ){
            JOptionPane.showMessageDialog(null,"Los campos estan vacios");
            Deshabilitar();
        }else{
            user.setUsuario(Usuario);
            user.setContrasena_usuario(Contrasena);
            user.setEstado_usuario("activo");
            user.setCodigo_rol(Integer.parseInt("1"));
            muser.RegistrarUsuarios(user);
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
            LimpiarTabla();
            LimpiarCampos();
            Deshabilitar();
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            ListarUsuario();
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked

    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String codigo = txtID.getText();
        String Usuario = txtUsuario.getText();
        String Contrasena = txtContrasena.getText();
        //String telefono = txtTelefono.getText();

        if(isBlank(codigo)){
            JOptionPane.showMessageDialog(null, "Seleccione la fila para actualizar");
        }else{
            if(isBlank(Usuario) || isBlank(Contrasena) ){

            }else{
                user.setUsuario(Usuario);
                user.setContrasena_usuario(Contrasena);
                //user.setDireccion_proveedor(direccion);
                user.setCodigo_usuario(Integer.parseInt(codigo));
                muser.ModificarUsuarios(user);

                LimpiarTabla();
                ListarUsuario();
                LimpiarCampos();
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
                Deshabilitar();
                btnGuardar.setEnabled(true);
                btnNuevo.setEnabled(true);
                btnActualizar.setEnabled(true);
                btnEliminar.setEnabled(true);

            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    public static boolean isBlank(String str)
    {
        return str.trim().isEmpty();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre3;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
