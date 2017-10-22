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
        System.out.println("Entrando al metodo ConectorBD");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL_BASEDATOS, USUARIO, CONTRASEÑA);
            System.out.println("Conexión exitosa");
        } catch (SQLException ex) {
            System.out.println("Conexión fallada");
        }
    }

    public void insertar(String carrera,String apellido,String nombre,String tipodoc, String dni, String provincia, String departamento, String extranjero, String nacionalidad, String nacimiento, String sexo, String obrasocial, String becado, String segurovida, String establecimiento, String jurisdiccion, String establecimientosecundario, String titulosecundario, String egresosecundario, String adeudaasignatura, String cuantasasignaturas, String juridisccionescuela, String estudios, String estudiosuper) {
        Statement statement;
        try {
            String sentencia;
            sentencia = "INSERT INTO `Alumno` (`idAlumno`, `carrera`,`apellido`, `nombre`, `tipodoc`, `dni`, `provincia`, `departamento`, `extranjero`, `nacionalidad`, `nacimiento`, `sexo`, `obrasocial`, `becado`, `segurovida`, `establecimiento`, `egreso`, `jurisdiccion`, `establecimientosecundario`, `titulosecundario`, `egresosecundario`, `adeudaasignatura`, `cuantasasignaturas`, `juridisccionescuela`, `estudios`, `estudiosuper`) VALUES (NULL,'"+carrera+"', '"+apellido+"', '"+nombre+"', '"+tipodoc+"', '"+dni+"', '"+provincia+"', '"+departamento+"', '"+extranjero+"', '"+nacionalidad+"', '"+nacimiento+"', '"+sexo+"', '"+obrasocial+"', '"+becado+"', '"+segurovida+"', '"+establecimiento+"', '"+jurisdiccion+"', '"+establecimientosecundario+"', '"+titulosecundario+"', '"+egresosecundario+"', '"+adeudaasignatura+"', '"+cuantasasignaturas+"', '"+juridisccionescuela+"', '"+estudios+"', '"+estudiosuper+"');";
  
            statement = this.conexion.createStatement();
            statement.executeUpdate(sentencia);
            System.out.println("Realizados");
        } catch (SQLException ex) {
            System.out.println("No se pudo ingresar los datos error: "+ ex);
        }
    }
    
    

}
