/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class MetEmpresa {
    Connection con;
    conectar cn = new conectar();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarEmpresa(Empresa pro){
        String consulta = "INSERT INTO empresa (nombre_empresa, telefono_empresa, correo_empresa, direccion_empresa, mision, vision, codigo_ciudad, estado) VALUES (?,?,?,?,?,?,?,?)";
        try {
            con= cn.getConnection2();
            ps= con.prepareStatement(consulta);
            ps.setString(1, pro.getNombre());
            ps.setInt(2, pro.getTelefono());
            ps.setString(3, pro.getCorreo());
            ps.setString(4, pro.getDireccion());
            ps.setString(5, pro.getMision());
            ps.setString(6, pro.getVision());
            ps.setInt(7, pro.getCodigo_ciudad());
            ps.setString(8, "activo");
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
    
    public List ListarEmpresa()
   {
       List<Empresa> ListaE = new ArrayList();
       String consulta = "SELECT * FROM empresa";
        try {
            con= cn.getConnection2();
            ps=con.prepareStatement(consulta);
            rs=ps.executeQuery();
            while(rs.next()){
                Empresa pr = new Empresa();
                pr.setCodigo_empresa(rs.getInt("codigo_empresa"));
                pr.setNombre(rs.getString("nombre_empresa"));
                pr.setTelefono(rs.getInt("telefono_empresa"));
                pr.setCorreo(rs.getString("correo_empresa"));
                pr.setDireccion(rs.getString("direccion_empresa"));
                pr.setMision(rs.getString("mision"));
                pr.setVision(rs.getString("vision"));
                pr.setCodigo_ciudad(rs.getInt("codigo_ciudad"));
                pr.setEstado(rs.getString("estado"));
                ListaE.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
       return ListaE;
    }
    
    public boolean EliminarEmpresa(int codigo_empresa){
        String consulta = "UPDATE `empresa`  SET `estado` = 'inactivo' WHERE `codigo_empresa` = ?";
        try { 
            con = cn.getConnection2();
            ps=con.prepareStatement(consulta);
            ps.setInt(1, codigo_empresa);
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
    
    public boolean ModificarEmpresa(Empresa pr){
        String sql = "UPDATE empresa SET nombre_empresa = ?, telefono_empresa = ?, correo_empresa = ? , direccion_empresa = ? , mision = ? , vision = ? , codigo_ciudad = ? WHERE codigo_empresa = ?";
        try {
            con = cn.getConnection2();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getNombre());
            ps.setInt(2, pr.getTelefono());
            ps.setString(3, pr.getCorreo());
            ps.setString(4, pr.getDireccion());
            ps.setString(5, pr.getMision());
            ps.setString(6, pr.getVision());
            ps.setInt(7, pr.getCodigo_ciudad());
             ps.setInt(8, pr.getCodigo_empresa());
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
    
    public boolean ActivarEmpresa(int codigo_empresa){
        String consulta = "UPDATE `empresa`  SET `estado` = 'activo' WHERE `codigo_empresa` = ?";
        try { 
            con = cn.getConnection2();
            ps=con.prepareStatement(consulta);
            ps.setInt(1, codigo_empresa);
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
    
    public void ConsultarCiudad(JComboBox ciudad){
        String sql = "SELECT nombre_ciudad FROM ciudad";
        try {
            con = cn.getConnection2();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               
                ciudad.addItem(rs.getString("nombre_ciudad"));
                
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
