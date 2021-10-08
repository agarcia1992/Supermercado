/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author agarc
 */
public class MetProducto {
    Connection con;
    conectar cn = new conectar();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarProductos(Productos produc){
        String sql="INSERT INTO producto (nombre_producto, descripcion, precio_producto, cantidad_producto, codigo_proveedor) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            FileInputStream archivoFoto;
            
           
            ps.setString(1, produc.getNombre_producto());
            ps.setString(2, produc.getDescripcion());
            ps.setInt(3, produc.getPrecio_producto());
            ps.setInt(4, produc.getCantidad_producto());
            ps.setString(5, produc.getProveedor());
            ps.setString(6, produc.getImagen());
            
            ps.execute();
            return true;
        } catch (SQLException e) {
           System.out.println(e.toString());
            return false;
        }
    }
    
    public List ListarProductos(){
       List<Productos> ListaP = new ArrayList();
       String sql = "SELECT p.codigo_producto, p.nombre_producto, p.precio_producto, p.cantidad_producto, p.descripcion, pro.nombre_proveedor  FROM producto p, proveedor pro WHERE p.codigo_proveedor = pro.codigo_proveedor";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Productos pro = new Productos();
               pro.setCodigo_producto(rs.getInt("codigo_producto"));
               pro.setNombre_producto(rs.getString("nombre_producto"));
               pro.setPrecio_producto(rs.getInt("precio_producto"));
               pro.setCantidad_producto(rs.getInt("cantidad_producto"));
               pro.setProveedor(rs.getString("nombre_proveedor"));
               pro.setDescripcion(rs.getString("descripcion"));
               ListaP.add(pro);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaP;
    }
    public void ConsultarProveedor(JComboBox proveedor){
        String sql = "SELECT nombre_proveedor FROM proveedor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               
                proveedor.addItem(rs.getString("nombre_proveedor"));
                
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
  
    public boolean EliminarProducto(int codigo_producto){
        String consulta = "DELETE FROM producto WHERE codigo_producto = ?";
        try {
            con = cn.getConnection();
            ps=con.prepareStatement(consulta);
            ps.setInt(1, codigo_producto);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
            
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
    
    public boolean ActualizarProducto (Productos produc){
        String sql = "UPDATE producto SET nombre_producto = ?, descripcion = ?, precio_producto= ?, cantidad_producto = ?, codigo_proveedor = ? WHERE codigo_producto = ?";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, produc.getNombre_producto());
            ps.setString(2, produc.getDescripcion());
            ps.setInt(3, produc.getPrecio_producto());
            ps.setInt(4, produc.getCantidad_producto());
            ps.setString(5, produc.getProveedor());
            ps.setInt(6, produc.getCodigo_producto());
            ps.execute();
          
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
    
}

    