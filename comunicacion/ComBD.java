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
		} 
		catch (SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
		
	}

	//Muestra todos los coches que tenemos en Stock y sus caracteristicas
	
	
	public void muestraStockCoche() {
	
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
				System.out.println("------------------------------------------------");
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
	
	//muestra todos los coches y sus atributos dependiendo del color que tenga.
	public void muestraColorCoche(String colo) {
		Statement stm = null;
		ResultSet respuesta = null;
		try {
			stm=conexion.createStatement();
			respuesta = stm.executeQuery("SELECT * FROM coche WHERE color = \""+colo+"\"");
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
	
	//muestra todos los camiones y sus atributos dependiendo del color que tenga.
	public void muestraColorCamion(String colo) {
		Statement stm = null;
		ResultSet respuesta = null;
		try {
			stm=conexion.createStatement();
			respuesta = stm.executeQuery("SELECT * FROM camion WHERE color = \""+colo+"\"");
			while(respuesta.next()) {
				int numBastidor=respuesta.getInt(1);
				String color = respuesta.getString(2);
				int numAsientos=respuesta.getInt(3);
				float precio =respuesta.getFloat(4);
				int codSerie= respuesta.getInt(5);
				boolean pintado = respuesta.getBoolean(6);
				String matricula =respuesta.getString(7);
				float carga= respuesta.getFloat(8);
				char tipoMercancia = respuesta.getString(9).charAt(0);
				System.out.println("Numero de bastidor: "+ numBastidor);
				System.out.println("Color: "+color);
				System.out.println("Numero de asientos: "+numAsientos);
				System.out.println("Precio: "+ precio+"€");
				System.out.println("Numero de serie: "+codSerie);
				System.out.println("Matricula: "+matricula);
				System.out.println("Carga: "+carga);
				System.out.println("Tipo de mercancia: "+ tipoMercancia);
				System.out.println("Pintado: "+ pintado);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//muestra todos los camiones que tenemos en stock y sus características
	
	void muestraStockCamion() {
		
		Statement stm = null;
		ResultSet respuesta = null;
		try {
			stm=conexion.createStatement();
			respuesta = stm.executeQuery("SELECT * FROM camion");
			while(respuesta.next()) {
				int numBastidor=respuesta.getInt(1);
				String color = respuesta.getString(2);
				int numAsientos=respuesta.getInt(3);
				float precio =respuesta.getFloat(4);
				int codSerie= respuesta.getInt(5);
				boolean pintado = respuesta.getBoolean(6);
				String matricula =respuesta.getString(7);
				float carga= respuesta.getFloat(8);
				char tipoMercancia = respuesta.getString(9).charAt(0);
				System.out.println("------------------------------------------------");
				System.out.println("Numero de bastidor: "+ numBastidor);
				System.out.println("Color: "+color);
				System.out.println("Numero de asientos: "+numAsientos);
				System.out.println("Precio: "+ precio+"€");
				System.out.println("Numero de serie: "+codSerie);
				System.out.println("Matricula: "+matricula);
				System.out.println("Carga: "+carga);
				System.out.println("Tipo de mercancia: "+ tipoMercancia);
				System.out.println("Pintado: "+ pintado);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	

	//A este metodo se le pasa una matricula y devuelve el coche que corresponde con esa matricula
	public vehiculos.Coche consultaCoche(String matri) {
		
		vehiculos.Coche c1= new vehiculos.Coche(0,0,"",0,"",0,0,0,false);
		Statement stm = null;
		ResultSet respuesta = null;
		
		try {
			stm=conexion.createStatement();
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
	public void meteVehiculo(vehiculos.Coche cocheAMeter) {
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
	
	//A este metodo se le pasa un coche y lo eliminar de la base de datos
	public void borraVehiculo(vehiculos.Coche cocheABorrar) {
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
	
	//A este metodo le pasamos un vehiculo y un color y cambia el el color al vehiculo en la base de datos, tyambien pone pintado como true.
	public void cambiarColor(vehiculos.Vehiculo cocheACambiarElColor, String nuevoColor) {
		Statement stm = null;
		try {
			stm=conexion.createStatement();
			String matricula = cocheACambiarElColor.getMatricula();
			String viejoColor = cocheACambiarElColor.getColor();
			stm.executeUpdate("UPDATE coche SET color=\""+nuevoColor+"\""+" WHERE matricula =\""+matricula+"\"");
			System.out.println("El coche ha cambiado de color de "+viejoColor+" a "+nuevoColor+".");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//A este metodo de le pasa un vehiculo y cambia el atributo pintado a true
	public void pintarVehiculo(vehiculos.Vehiculo vehiculoAPintar) {
		Statement stm = null;
		try {
			stm=conexion.createStatement();
			String matricula = vehiculoAPintar.getMatricula();
			stm.executeUpdate("UPDATE coche SET pintado= true WHERE matricula =\""+matricula+"\"");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//A este metodo le pasamos una matricula y nos devuelve el camion que corresponda con esa matricula


	public vehiculos.Camion consultaCamion(String matri) {

		vehiculos.Camion c1= new vehiculos.Camion(0,'a',"",0,"",0,0,0,false);
		Statement stm = null;
		ResultSet respuesta = null;
		
		try {
			stm=conexion.createStatement();
			respuesta = stm.executeQuery("SELECT * FROM camion WHERE matricula = \""+matri+"\"");
			while(respuesta.next()) {
				int numBastidor=respuesta.getInt(1);
				String color = respuesta.getString(2);
				int numAsientos=respuesta.getInt(3);
				float precio =respuesta.getFloat(4);
				boolean pintado = respuesta.getBoolean(5);
				int codSerie= respuesta.getInt(6);
				String matricula =respuesta.getString(7);
				float carga= respuesta.getFloat(8);
				char tipoMercancia = respuesta.getString(9).charAt(0);
			
				vehiculos.Camion c2=new vehiculos.Camion(carga, tipoMercancia,matricula, numBastidor,color, numAsientos,codSerie,precio,pintado);
				c1=c2;
			}
			

		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return c1;
	}
	//A este metodo le pasamos un camion y lo introduce en la base de datos
	public void meteVehiculo(vehiculos.Camion camionAMeter) {
		Statement stm = null;
		try {
			stm=conexion.createStatement();
			int numBastidor= camionAMeter.getNumBastidor();
			String color = camionAMeter.getColor();
			int numAsientos = camionAMeter.getNumAsientos();
			float precio = camionAMeter.getPrecio();
			boolean pintado = camionAMeter.isPintado();
			int codSerie = camionAMeter.getSerie();
			String matricula = camionAMeter.getMatricula();
			float carga= camionAMeter.getCarga();
			char tipoMercancia= camionAMeter.getTipoMercancia();
			stm.executeUpdate("INSERT into camion (numBastidor, color, numAsientos, precio, pintado, codSerie, matricula, carga, tipoMercancia) VALUES ("+numBastidor+","+"\""+color+"\""+","+numAsientos+","+precio+","+pintado+","+codSerie+","+"\""+matricula+"\""+","+carga+",'"+tipoMercancia+"');");
			System.out.println("El camión se ha añadido correctamente");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
					
	}
	//Le pasamos un camion y lo borra de la base de datos
	public void borraVehiculo(vehiculos.Camion camionABorrar) {
		Statement stm = null;
		try {
			stm=conexion.createStatement();
			String matricula = camionABorrar.getMatricula();
			stm.executeUpdate("DELETE from camion WHERE matricula=\""+matricula+"\"");
			System.out.println("Camion eliminado correctamente");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
//Le pasamos una serie y la introduce en la base de datos
	public void meteSerie(otros.Serie serieAMeter) {
		Statement stm = null;
		
		try {
			stm=conexion.createStatement();
			int codSerie = serieAMeter.getCodSerie();
			String modelo = serieAMeter.getModelo();
			String marca = serieAMeter.getMarca();
			int añoFabricacion = serieAMeter.getAñoFabricacion();
			stm.executeUpdate("INSERT into serie (codSerie,modelo,marca,añoFabricacion) VALUES ("+codSerie+","+"\""+modelo+"\""+","+"\""+marca+"\""+","+"\""+añoFabricacion+"\""+");");

		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Le pasamos el codigo de serie y nos devuelve una serie
	public otros.Serie consultaSerie(int codSerie) {
		otros.Serie s1= new otros.Serie(0,"","",0);
		Statement stm = null;
		ResultSet respuesta = null;
		try {
			stm=conexion.createStatement();
			respuesta = stm.executeQuery("SELECT * FROM serie WHERE codSerie = \""+codSerie+"\"");
			while(respuesta.next()) {
				int cod = respuesta.getInt(1);
				String modelo =respuesta.getString(2);
				String marca = respuesta.getString(3);
				int añoFabricacion = respuesta.getInt(4);
				otros.Serie s2 = new otros.Serie(cod,modelo,marca,añoFabricacion);
				s1=s2;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return s1;
	}
	}
