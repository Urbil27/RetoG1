package comunicacion;
import java.sql.*;
import javax.swing.JOptionPane;

public class ComBD {
	private String nombre ="bdt-concesionario";
	private String url ="jdbc:mysql://localhost";
	private String usuario = "root";
	private String contraseņa = "root";
	public Connection Conectar() {
		Connection link = null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			link = DriverManager.getConnection(this.url,this.usuario,this.contraseņa);
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
		return link;
	}
}
