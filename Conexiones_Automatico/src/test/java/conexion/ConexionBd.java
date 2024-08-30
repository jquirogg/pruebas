import java.sql.Connection; // Importar la clase Connection
import java.sql.DriverManager; // Importar la clase DriverManager
import java.sql.SQLException; // Importar la clase SQLException
public class ConexionBd {

        // Método para establecer la conexión con la base de datos
        public Connection conectar() {
            Connection conexion = null;
            try {
                // Cambia la URL, usuario y contraseña según tu configuración
                String url = "jdbc:mysql://10.250.2.39/system_preproduccion?serverTimezone=UTC";// URL de conexión a la base de datos
                String username = "jquirogg";      // Nombre de usuario de la base de datos
                String password = "$av14Aprendiz2024";   // Contraseña de la base de datos

                // Establece la conexión
                conexion = DriverManager.getConnection(url, username, password);
                System.out.println("Conexión exitosa!");

            } catch (SQLException e) {
                System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            }
            return conexion;

        }
}
