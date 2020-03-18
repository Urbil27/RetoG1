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
				float precio =respuesta.getFloat(4);
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
	
	//A este metodo se le pasa una matricula y devuelve todas las caracteristicas del coche que tenga esa matricula
	vehiculos.Coche consultaCoche(String matri) {
		
		vehiculos.Coche c1= new vehiculos.Coche(0,0,"",0,"",0,0,0,false);
		Statement stm = null;
		ResultSet respuesta = null;
		
		try {
			stm=conexion.createStatement();
			System.out.println("SELECT * FROM coche WHERE matricula = \""+matri+"\"");
			respuesta = stm.executeQuery("SELECT * FROM coche WHERE matricula = \""+matri+"\"");
			while(respuesta.next()) {
				int numBastidor=respuesta.getInt(1);
				String color = respuesta.getString(2);
				int numAsientos=respuesta.getInt(3);
				float precio =respuesta.getFloat(4);
				boolean pintado = respuesta.getBoolean(5);
				int codSerie= respuesta.getInt(6);
				String matricula =respuesta.getString(7);
				int numPuertas= respuesta.getInt(8);
				float capacidadMaletero = respuesta.getFloat(9);
			
				vehiculos.Coche c2=new vehiculos.Coche(numPuertas, capacidadMaletero,matricula, numBastidor,color, numAsientos,codSerie,precio,pintado);
				c1=c2;
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return c1;
	}
	//A este metodo se le pasa un coche y lo introduce en la base de datos
	void meteCoche(vehiculos.Coche cocheAMeter) {
			Statement stm = null;
			try {
				stm=conexion.createStatement();
				int numBastidor= cocheAMeter.getNumBastidor();
				String color = cocheAMeter.getColor();
				int numAsientos = cocheAMeter.getNumAsientos();
				float precio = cocheAMeter.getPrecio();
				boolean pintado = cocheAMeter.isPintado();
				int codSerie = cocheAMeter.getSerie();
				String matricula = cocheAMeter.getMatricula();
				int numPuertas= cocheAMeter.getNumPuertas();
				float capacidadMaletero= cocheAMeter.getCapacidadMaletero();
				stm.executeUpdate("INSERT into coche (numBastidor, color, numAsientos, precio, pintado, codSerie, matricula, numPuertas, capacidadMaletero) VALUES ("+numBastidor+","+"\""+color+"\""+","+numAsientos+","+precio+","+pintado+","+codSerie+","+"\""+matricula+"\""+","+numPuertas+","+capacidadMaletero+");");
				System.out.println("El coche se ha añadido correctamente");
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
						
	}
	void borraCoche(vehiculos.Coche cocheABorrar) {
		Statement stm = null;
		try {
			stm=conexion.createStatement();
			String matricula = cocheABorrar.getMatricula();
			stm.executeUpdate("DELETE from coche WHERE matricula=\""+matricula+"\"");
			System.out.println("Coche eliminado correctamente");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	//Todo funcional hasta aqui
	/*
	void cambiarColorCoche(vehiculos.Coche cocheACambiarElColor, String nuevoColor) {
		Statement stm = null;
		try {
			stm=conexion.createStatement();
			String matricula = cocheACambiarElColor.getMatricula();
			String viejoColor = cocheACambiarElColor.getColor();
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
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
		
	}*/
}
