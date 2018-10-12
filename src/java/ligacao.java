import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ligacao {

    //Vai guardar a conexão com o banco
    private static Connection liga = null;

    //cria a conexão com o banco
    public Connection criarconexcao() throws SQLException, ClassNotFoundException {
                                                                       //aqui deve se colocar a senha para o banco             
    String u = "jdbc:mysql://localhost:3306/banco?user=root&password=&autoReconnect=true";
        Class.forName("com.mysql.jdbc.Driver");
         liga = DriverManager.getConnection(u);
        
        return liga;
    }
    
}
