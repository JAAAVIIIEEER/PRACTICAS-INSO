import java.io.IOException;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Conectar c = new Conectar();
		c.establecerConexion();
	}
}
