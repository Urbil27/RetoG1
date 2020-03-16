package comunicacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ComBD {
	private static final String CONTROLADOR ="com.mysql.cj.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/BDT_CONCESIONARIO";
	private static final String USUARIO ="root";
	private static final String CONTRASEÑA="root";
	
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
			
			conexion = DriverManager.getConnection(URL,USUARIO, CONTRASEÑA);
			System.out.println("Conexión OK");
		} 
		catch (SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
		
		return conexion;
	}

	
	
	
	void consultaCoche() {
		ComBD conexion = new ComBD();
		Connection cn= null;
		Statement stm = null;
		ResultSet respuesta = null;
		try {
			cn =conexion.Conectar();
			stm=cn.createStatement();
			respuesta = stm.executeQuery("SELECT * FROM coche");
			while(respuesta.next()) {
				int numBastidor=respuesta.getInt(1);
				String color = respuesta.getString(2);
				int numAsientos=respuesta.getInt(3);
				int precio =respuesta.getInt(4);
				int codSerie= respuesta.getInt(5);
				String matricula =respuesta.getString(6);
				int numPuertas= respuesta.getInt(7);
				int capacidadMaletero = respuesta.getInt(8);
				System.out.println("Numero de bastidor: "+ numBastidor);
				System.out.println("Color: "+color);
				System.out.println("Numero de asientos: "+numAsientos);
				System.out.println("Precio: "+ precio+"€");
				System.out.println("Numero de serie: "+codSerie);
				System.out.println("Matricula: "+matricula);
				System.out.println("Numero de puertas: "+numPuertas);
				System.out.println("Capacidad del maletero: "+ capacidadMaletero);
			}
		}
		catch(SQLException e) {
			
		}
		
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
	void meteSerie() {
		
	}
	void consultaSerie() {
		
	}
}
