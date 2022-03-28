package conexion;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexionSQL {
    Connection conectar=null;
    public Connection conexion(){
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","root");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de conexion");
        }
        return conectar;
}   
}
