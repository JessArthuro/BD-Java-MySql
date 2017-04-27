package jdbcaplication;

import java.sql.*;

/**
 *
 * @author JessArthuro
 */
public class JDBCAplication {

    public static void main(String[] args) {
       try {
         Class.forName("com.mysql.jdbc.Driver");
         System.out.println("Carga exitosa");
         String url = "jdbc:mysql://localhost/bd_proyecto?user=root";
         Connection conn = DriverManager.getConnection(url);
         System.out.println("Conexion realizada"); 
         Statement st = conn.createStatement();
         st.execute("insert into " +
                 "prueba(nombre, apellido, edad)" +
                 "values ('Jesus', 'Carmona', '20')");
         conn.close();
       } catch (ClassNotFoundException ex) {
           System.out.println("Error imposible de cargar controlador");
           System.exit(1);
        } catch (SQLException ex)
        { 
            System.out.println("Error de conexion");
            ex.printStackTrace();  
        }
    }
    
}
