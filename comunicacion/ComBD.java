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
	private Connection conexion;
	
	static {
		 try {
			 Class.forName(CONTROLADOR);
		 } 
		 catch(ClassNotFoundException e) {
			 System.out.println("Error al cargar el controlador");
			 e.printStackTrace();
		 }
	}
	
	
	
	public void conectar() {
		
		try {
			
			conexion = DriverManager.getConnection(URL,USUARIO, CONTRASEÑA);
			System.out.println("Conexión OK");
		} 
		catch (SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
		
	}

	
	
	
	void muestraStockCoche() {
	
		Statement stm = null;
		ResultSet respuesta = null;
		try {
			stm=conexion.createStatement();
			respuesta = stm.executeQuery("SELECT * FROM coche");
			while(respuesta.next()) {
				int numBastidor=respuesta.getInt(1);
				String color = respuesta.getString(2);
				int numAsientos=respuesta.getInt(3);
				int precio =respuesta.getInt(4);
				int codSerie= respuesta.getInt(5);
				boolean pintado = respuesta.getBoolean(6);
				String matricula =respuesta.getString(7);
				int numPuertas= respuesta.getInt(8);
				int capacidadMaletero = respuesta.getInt(9);
				System.out.println("Numero de bastidor: "+ numBastidor);
				System.out.println("Color: "+color);
				System.out.println("Numero de asientos: "+numAsientos);
				System.out.println("Precio: "+ precio+"€");
				System.out.println("Numero de serie: "+codSerie);
				System.out.println("Matricula: "+matricula);
				System.out.println("Numero de puertas: "+numPuertas);
				System.out.println("Capacidad del maletero: "+ capacidadMaletero);
				System.out.println("Pintado: "+ pintado);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	vehiculos.Coche consultaCoche(String matri) {
		
		vehiculos.Coche c1= new vehiculos.Coche(0,0,"",0,"",0,0,0,false);
		Statement stm = null;
		ResultSet respuesta = null;
		try {
			stm=conexion.createStatement();
			respuesta = stm.executeQuery("SELECT * FROM coche WHERE matricula like '"+matri+"';");
			
				int numBastidor=respuesta.getInt(1);
				String color = respuesta.getString(2);
				int numAsientos=respuesta.getInt(3);
				int precio =respuesta.getInt(4);
				boolean pintado = respuesta.getBoolean(5);
				int codSerie= respuesta.getInt(6);
				String matricula =respuesta.getString(7);
				int numPuertas= respuesta.getInt(8);
				int capacidadMaletero = respuesta.getInt(9);
				vehiculos.Coche c2=new vehiculos.Coche(numPuertas, capacidadMaletero,matricula, numBastidor,color, numAsientos,codSerie,precio,pintado);
				c1=c2;
			
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return c1;
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
