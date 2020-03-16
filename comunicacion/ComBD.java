package comunicacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ComBD {
	private static final String CONTROLADOR ="com.mysql.cj.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/BDT_CONCESIONARIO";
	private static final String USUARIO ="root";
	private static final String CONTRASE�A="root";
	
	static {
		 try {
			 Class.forName(CONTROLADOR);
		 } 
		 catch(ClassNotFoundException e) {
			 System.out.println("Error al cargar el controlador");
			 e.printStackTrace();
		 }
	}
	
	
	
	public Connection Conectar() {
		Connection conexion = null;
		try {
			
			conexion = DriverManager.getConnection(URL,USUARIO, CONTRASE�A);
			System.out.println("Conexi�n OK");
		} 
		catch (SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
		
		return conexion;
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
