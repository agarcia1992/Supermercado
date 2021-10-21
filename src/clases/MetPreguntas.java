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

public class MetPreguntas {
    Connection con;
    conectar cn = new conectar();
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListarPreguntas(){
       List<Pregunta> ListaU = new ArrayList();
       String sql = "SELECT `codigo`, `pregunta`, `descripcion`, `estado` FROM `preguntas`  ";
       try {
           con = cn.getConnection2();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Pregunta pre = new Pregunta();
               pre.setCodigo(rs.getInt("codigo"));
               pre.setPregunta(rs.getString("pregunta"));
               pre.setDescripcion(rs.getString("descripcion"));
               pre.setEstado(rs.getString("estado")); 
               ListaU.add(pre);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaU;
    }
    
    public boolean EliminarPreguntas(int codigo){
        String consulta = "UPDATE `preguntas`  SET `estado` = 'inactivo' WHERE `codigo` = ?";
        try { 
            con = cn.getConnection2();
            ps=con.prepareStatement(consulta);
            ps.setInt(1, codigo);
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
    
    public boolean ActivarPreguntas(int codigo){
        String consulta = "UPDATE `preguntas`  SET `estado` = 'activo' WHERE `codigo` = ?";
        try { 
            con = cn.getConnection2();
            ps=con.prepareStatement(consulta);
            ps.setInt(1, codigo);
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
    
    public boolean RegistrarPreguntas(Pregunta pre){
        String consulta = "INSERT INTO `preguntas`( `pregunta`, `descripcion`, `estado`) VALUES (?,?,? )";
        try {
            con= cn.getConnection2();
            ps= con.prepareStatement(consulta);
            ps.setString(1, pre.getPregunta());
            ps.setString(2, pre.getDescripcion()); 
            ps.setString(3, pre.getEstado()); 
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
    
    public boolean ModificarPreguntas(Pregunta pre){
        String sql = "UPDATE `preguntas` SET `pregunta` = ? ,`descripcion`= ?  WHERE `codigo`= ?";
        try {
            con = cn.getConnection2();
            ps = con.prepareStatement(sql);
            ps.setString(1, pre.getPregunta());
            ps.setString(2, pre.getDescripcion()); 
            ps.setInt(3, pre.getCodigo());
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
