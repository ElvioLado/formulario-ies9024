package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectorBD {
    Connection conexion;
    final String URL_BASEDATOS = "jdbc:mysql://localhost/registroies";
    final String USUARIO = "root";
    final String CONTRASEÑA = "";
    Statement state;
    public ConectorBD() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL_BASEDATOS, USUARIO, CONTRASEÑA);
        } catch (SQLException ex) {
            System.out.println("Conexión fallada");
        }
    }

    public void insertar(String apellido,String nombre) {
        Statement statement;
        try {
            String sentencia;
            sentencia = "INSERT INTO `alumno`(`id`, `apellido`,`nombre`) VALUES (null,'"+apellido+"','"+nombre+"')";
            statement = this.conexion.createStatement();
            statement.executeUpdate(sentencia);
            System.out.println("Realizados");
        } catch (SQLException ex) {
        }
    }
    
    

}
