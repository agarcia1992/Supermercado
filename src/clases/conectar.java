//Clases para la conexión
package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Variables de conexión
public class conectar {
    Connection con;
    Connection con2;
    public Connection getConnection(){
        try {
            String BD = "jdbc:mysql://localhost:3306/productos";
            con=DriverManager.getConnection(BD,"root","");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
     
    public Connection getConnection2(){
        try {
            String BD = "jdbc:mysql://localhost:3306/usuariosadmin";
            con2=DriverManager.getConnection(BD,"root","");
            return con2;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
            }
    
}
