
package clases;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MetProveedor {
    Connection con;
    conectar cn = new conectar();
    PreparedStatement ps;
    ResultSet rs;
   
    public boolean RegistrarProveedor(Proveedor pro){
        String consulta = "INSERT INTO proveedor (nombre_proveedor, telefono_proveedor, direccion_proveedor) VALUES (?,?,?)";
        try {
            con= cn.getConnection();
            ps= con.prepareStatement(consulta);
            ps.setString(1, pro.getNombre_proveedor());
            ps.setInt(2, pro.getTelefono_proveedor());
            ps.setString(3, pro.getDireccion_proveedor());
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
    
    public List ListarProveedor()
   {
       List<Proveedor> ListaP = new ArrayList();
       String consulta = "SELECT * FROM proveedor";
        try {
            con= cn.getConnection();
            ps=con.prepareStatement(consulta);
            rs=ps.executeQuery();
            while(rs.next()){
                Proveedor pr = new Proveedor();
                pr.setCodigo_proveedor(rs.getInt("codigo_proveedor"));
                pr.setNombre_proveedor(rs.getString("nombre_proveedor"));
                pr.setTelefono_proveedor(rs.getInt("telefono_proveedor"));
                pr.setDireccion_proveedor(rs.getString("direccion_proveedor"));
                ListaP.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
       return ListaP;
    }
    
    public boolean EliminarProveedor(int codigo_proveedor){
        String consulta = "DELETE FROM proveedor WHERE codigo_proveedor = ?";
        try {
            con = cn.getConnection();
            ps=con.prepareStatement(consulta);
            ps.setInt(1, codigo_proveedor);
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
    
    public boolean ModificarProveedor(Proveedor pr){
        String sql = "UPDATE proveedor SET nombre_proveedor = ?, telefono_proveedor = ?, direccion_proveedor = ? WHERE codigo_proveedor = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getNombre_proveedor());
            ps.setInt(2, pr.getTelefono_proveedor());
            ps.setString(3, pr.getDireccion_proveedor());
            ps.setInt(4, pr.getCodigo_proveedor());
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
