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

public class MetUsuario {
    Connection con;
    conectar cn = new conectar();
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListarUsuarios(){
       List<Usuario> ListaU = new ArrayList();
       String sql = "SELECT u.codigo_usuario, u.usuario, u.contrasena_usuario, u.estado_usuario,  u.fecha_creacion_usuario, r.nombre_rol FROM usuario u, rol r WHERE u.codigo_rol = r.codigo_rol";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Usuario user = new Usuario();
               user.setCodigo_usuario(rs.getInt("codigo_usuario"));
               user.setUsuario(rs.getString("usuario"));
               user.setContrasena_usuario(rs.getString("contrasena_usuario"));
               user.setEstado_usuario(rs.getString("estado_usuario"));
               user.setNombre_rol(rs.getString("nombre_rol")); 
               ListaU.add(user);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaU;
    }
    
    public void ConsultarRol(JComboBox Rol){
        String sql = "SELECT nombre_rol FROM rol";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               
                Rol.addItem(rs.getString("nombre_rol"));
                
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
  
    
    public boolean EliminarUsuarios(int codigo_usuario){
        String consulta = "UPDATE `usuario`  SET `estado_usuario` = 'inactivo' WHERE `codigo_usuario` = ?";
        try { 
            con = cn.getConnection();
            ps=con.prepareStatement(consulta);
            ps.setInt(1, codigo_usuario);
            System.out.println(""+consulta);
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
    
    public boolean ActivarUsuarios(int codigo_usuario){
        String consulta = "UPDATE `usuario`  SET `estado_usuario` = 'activo' WHERE `codigo_usuario` = ?";
        try { 
            con = cn.getConnection();
            ps=con.prepareStatement(consulta);
            ps.setInt(1, codigo_usuario);
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
    
    public boolean RegistrarUsuarios(Usuario user){
        String consulta = "INSERT INTO `usuario`( `usuario`, `contrasena_usuario`, `estado_usuario`, `codigo_rol`, `fecha_creacion_usuario`) VALUES (?,?,?,?,sysdate())";
        try {
            con= cn.getConnection();
            ps= con.prepareStatement(consulta);
            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getContrasena_usuario()); 
            ps.setString(3, user.getEstado_usuario());
            ps.setInt(4, user.getCodigo_rol()); 
            //ps.setString(5, "sysdate()");
            ps.execute();
            
            return true;
            
        } catch (SQLException e) {
            System.out.println(e.toString());
           
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    public boolean ModificarUsuarios(Usuario user){
        String sql = "UPDATE `usuario` SET `usuario` = ?,`contrasena_usuario`= ?, codigo_rol = ? WHERE `codigo_usuario`= ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getContrasena_usuario());
            ps.setString(3, user.getNombre_rol());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
}
