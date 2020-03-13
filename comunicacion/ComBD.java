package comunicacion;

import java.sql.*;
import javax.swing.JOptionPane;


public class ComBD {
	public String color;
	public vehiculos.Vehiculo v;
	private String nombre ="bdt-concesionario";
	private String url ="jdbc:mysql://localhost";
	private String usuario = "root";
	private String contraseña = "root";
	public Connection Conectar() {
		Connection link = null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			link = DriverManager.getConnection(this.url,this.usuario,this.contraseña);
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
		return link;
	}
	void consultaCoche() {
		
	}
	void meteCoche() {
		
	}
	void borraCoche() {
		
	}
	void cambiarColorCoche() {
		
	}
	void consultaCamion() {
		
	}
	void meteCamion() {
		
	}
	void borraCamion() {
		
	}
	void cambiarColorCamion() {
		
	}
}
