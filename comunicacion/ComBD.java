package comunicacion;

import java.sql.*;
import javax.swing.JOptionPane;



public class ComBD {
	
	ComBD(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/BDT_CONCESIONARIO","root", "root");
			System.out.println("Conexión OK");
		} catch(ClassNotFoundException e){
			System.out.println("Error al cargar el controlador");
		} catch (SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
		
		
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
