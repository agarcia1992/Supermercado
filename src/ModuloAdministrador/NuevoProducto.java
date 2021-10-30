/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloAdministrador;

import static ModuloAdministrador.Proveedores.isBlank;
import clases.MetProducto;
import clases.Productos;
import clases.Proveedor;
import clases.conectar;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComponent;

/**
 *
 * @author agarc
 */
public class NuevoProducto extends javax.swing.JInternalFrame {
    
    DefaultTableModel tabla1 = new DefaultTableModel();
    Productos pro = new Productos();
    MetProducto mpro = new MetProducto();
    Proveedor prov = new Proveedor();
    String idPro = " ";
    
    Connection con;
    conectar cn = new conectar();
    PreparedStatement ps;
    ResultSet rs;
    
    public NuevoProducto() {
        initComponents();
        //LimpiarTabla();
        Deshabilitar();
        ListarProducto();
        mpro.ConsultarProveedor(cboProveedor);
        txtTipo.addItem("despensa");
        txtTipo.addItem("carne");
        txtTipo.addItem("pescados");
        txtTipo.addItem("bebida");
        txtTipo.addItem("frutas");
        txtTipo.addItem("verduras");
        txtTipo.addItem("higiene");
        txtTipo.addItem("limpieza");
       
    }
public static boolean isBlank(String str)
    {
        return str.trim().isEmpty();
    }

 public void ListarProducto() {
        List<Productos> ListarP = mpro.ListarProductos();
        tabla1 = (DefaultTableModel) TablaProducto.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarP.size(); i++) {
            ob[0] = ListarP.get(i).getCodigo_producto();
            ob[1] = ListarP.get(i).getNombre_producto();
            ob[2] = ListarP.get(i).getPrecio_producto();
            ob[3] = ListarP.get(i).getCantidad_producto();
            ob[4] = ListarP.get(i).getProveedor();
            ob[5] = ListarP.get(i).getDescripcion();
            tabla1.addRow(ob);
        }
        TablaProducto.setModel(tabla1);
 }
    
 public void ValidarRepetidos(){
     for (int i = 0; i < tabla1.getRowCount(); i++) {
         if(TablaProducto.getValueAt(i, 1).equals(txtNombre.getText())){
             JOptionPane.showMessageDialog(null, "El producto ya esta registrado");
             tabla1.removeRow(i);
         }
        
     }
      ListarProducto();
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboProveedor = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();
        txtCantidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        idProveedor = new javax.swing.JTextField();
        txtImagen = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbfoto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ingresar nuevo producto");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Registro de Productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 13, 281, -1));

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel6.setText("Precio");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel7.setText("Codigo");

        cboProveedor.setEditable(true);
        cboProveedor.setEnabled(false);
        cboProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProveedorActionPerformed(evt);
            }
        });

        txtCodigo.setEditable(false);

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
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/emblemunreadable_93487.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        TablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Cantidad", "Proveedor", "Descripcion"
            }
        ));
        TablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProducto);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel12.setText("Cantidad");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel13.setText("Proveedor");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel14.setText("Descripción");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel15.setText("Productos");

        idProveedor.setEditable(false);
        idProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProveedorActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel16.setText("Imagen");

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel3.setText("Tipo");

        txtTipo.setEditable(true);
        txtTipo.setEnabled(false);
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTipo, 0, 136, Short.MAX_VALUE))
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(28, 28, 28)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel16))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cboProveedor, 0, 156, Short.MAX_VALUE)
                                                .addComponent(txtImagen))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jButton1)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(idProveedor)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(75, 75, 75))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbfoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 863, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        Habilitar();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void cboProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProveedorActionPerformed
        
            idProveedor.setText("");
            String itemSeleecionado = (String)cboProveedor.getSelectedItem();   
            String sql = "SELECT codigo_proveedor  FROM proveedor WHERE nombre_proveedor = '"+itemSeleecionado+"'";
             
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               
                idPro = rs.getString("codigo_proveedor");
                   
            }
            idProveedor.setText(idPro);
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }  
    }//GEN-LAST:event_cboProveedorActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
       
        String Nombre = txtNombre.getText();
        String Descripcion = txtDescripcion.getText();
        String Precio = txtPrecio.getText();
        String Cantidad = txtCantidad.getText();
        String Proveedor = idProveedor.getText();
        if(isBlank(Nombre) || isBlank(Descripcion) || isBlank(Precio) || isBlank(Cantidad) || isBlank(Proveedor)){
           
           JOptionPane.showMessageDialog(null,"Los campos estan vacios");
           LimpiarCampos();
           Deshabilitar();
        }else{
          
           pro.setNombre_producto(txtNombre.getText());
           pro.setDescripcion(txtDescripcion.getText());
           pro.setPrecio_producto(Integer.parseInt(txtPrecio.getText()));
           pro.setCantidad_producto(Integer.parseInt(txtCantidad.getText()));
           pro.setTipo_producto((String)txtTipo.getSelectedItem());
           pro.setImagen(txtImagen.getText());
           pro.setProveedor(idProveedor.getText());
           mpro.RegistrarProductos(pro);
           
           LimpiarTabla();
           LimpiarCampos();
           Deshabilitar();
           btnActualizar.setEnabled(true);
           btnEliminar.setEnabled(true);
           ValidarRepetidos();
           JOptionPane.showMessageDialog(null, "Datos ingresados correctamente.");

          
           
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigo = txtCodigo.getText();
        
        if(isBlank(codigo)){
            JOptionPane.showMessageDialog(null, "Seleccione la fila a eliminar");
        }else{
            int confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if(confirmacion == 0){
                int id = Integer.parseInt(txtCodigo.getText());
                mpro.EliminarProducto(id);
                LimpiarTabla();
                LimpiarCampos();
                ListarProducto();
                Deshabilitar();
                btnGuardar.setEnabled(true);
                btnNuevo.setEnabled(true);
                btnActualizar.setEnabled(true);
                 btnEliminar.setEnabled(true);
                
            }
        }
   
      
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductoMouseClicked
        Habilitar();
        int fila = TablaProducto.rowAtPoint(evt.getPoint());
        txtCodigo.setText(TablaProducto.getValueAt(fila, 0).toString());
        txtNombre.setText(TablaProducto.getValueAt(fila, 1).toString());
        txtPrecio.setText(TablaProducto.getValueAt(fila, 2).toString());
        txtCantidad.setText(TablaProducto.getValueAt(fila, 3).toString());
        cboProveedor.setSelectedItem(TablaProducto.getValueAt(fila, 4).toString());
        txtDescripcion.setText(TablaProducto.getValueAt(fila, 5).toString());
        
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_TablaProductoMouseClicked

    private void idProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProveedorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_idProveedorActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
      TablaProducto.clearSelection();
      LimpiarCampos();
      btnGuardar.setEnabled(true);
      btnNuevo.setEnabled(true);
      btnActualizar.setEnabled(true);
      btnEliminar.setEnabled(true);
      Deshabilitar();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
      TablaProducto.clearSelection();
      LimpiarCampos();
      btnGuardar.setEnabled(true);
      btnNuevo.setEnabled(true);
      btnActualizar.setEnabled(true);
      btnEliminar.setEnabled(true);
      Deshabilitar();
    }//GEN-LAST:event_formMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String codigoProducto = txtCodigo.getText();
        String Nombre = txtNombre.getText();
        String Descripcion = txtDescripcion.getText();
        String Precio = txtPrecio.getText();
        String Cantidad = txtCantidad.getText();
        String Proveedor = idProveedor.getText();
        if(isBlank(Nombre) || isBlank(Descripcion) || isBlank(Precio) || isBlank(Cantidad) || isBlank(Proveedor)){
            JOptionPane.showMessageDialog(null, "Seleccione la fila para Actualizar");
        }else{
           pro.setNombre_producto(Nombre);
           pro.setDescripcion(Descripcion);
           pro.setPrecio_producto(Integer.parseInt(Precio));
           pro.setCantidad_producto(Integer.parseInt(Cantidad));
           pro.setProveedor(Proveedor);
           pro.setCodigo_producto(Integer.parseInt(codigoProducto));
           mpro.ActualizarProducto(pro);
           
            LimpiarTabla();
            ListarProducto();
            LimpiarCampos();
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
            Deshabilitar();
            btnGuardar.setEnabled(true);
            btnNuevo.setEnabled(true);
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser archivo = new JFileChooser();
        int ventana = archivo.showOpenDialog(null);
        File ruta = new File("C:\\xampp\\htdocs\\pagina_web-1\\pagina_web\\imagenes\\productos");
        archivo.setCurrentDirectory(ruta);
        if(ventana == JFileChooser.APPROVE_OPTION){
            File file = archivo.getSelectedFile();
            txtImagen.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(txtImagen.getText());
            foto = foto.getScaledInstance(150, 130, Image.SCALE_DEFAULT);
            lbfoto.setIcon(new ImageIcon(foto)); 
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtTipoActionPerformed

    public void LimpiarCampos(){
           txtCodigo.setText("");
           txtNombre.setText("");
           txtDescripcion.setText("");
           txtPrecio.setText("");
           txtCantidad.setText("");
    }
    public void Habilitar(){
        txtNombre.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtCodigo.setEnabled(true);
        txtCantidad.setEnabled(true);
        txtImagen.setEnabled(true);
        txtTipo.setEnabled(true);
        cboProveedor.setEnabled(true);
        txtDescripcion.setEnabled(true);
    }
    public void Deshabilitar(){
        txtNombre.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtCodigo.setEnabled(false);
        txtImagen.setEnabled(false);
        txtTipo.setEnabled(false);
        txtCantidad.setEnabled(false);
        cboProveedor.setEnabled(false);
        txtDescripcion.setEnabled(false);
    }
    public void LimpiarTabla(){
        for (int i = 0; i < tabla1.getRowCount(); i++) {
           tabla1.removeRow(i);
           i=i-1;
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProducto;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboProveedor;
    private javax.swing.JTextField idProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbfoto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtImagen;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JComboBox<String> txtTipo;
    // End of variables declaration//GEN-END:variables
}
