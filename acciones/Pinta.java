package acciones;

import java.util.Scanner;
import comunicacion.ComBD;
import otros.Historico;
import otros.Historico;
public class Pinta {

	vehiculos.Vehiculo p1;
	private ComBD conexion;
	public Pinta(ComBD conexion){
		this.conexion = conexion;
	}
	

	// Primero y gracias al siguiente metodo se cambiará el color del coche
	
	public String pintar() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Vehiculo a pintar:");
		System.out.println("1) Camión");
		System.out.println("2) Coche");
		int opcion = teclado.nextInt();
		

		

		while(opcion != 1 && opcion != 2) {

			System.out.println("No has introducido correctamente tu eleccion.");
			System.out.println("Porfavor, introduce el vehiculo que vas a pintar");
			System.out.println("1) Camión");
			System.out.println("2) Coche");
			opcion = teclado.nextInt();
		}
		String matricula;
		String nuevoColor;
		if(opcion==1) {
				
				System.out.println("Introduce la matricula del camion que deseas pintar");
				matricula = teclado.nextLine();
				matricula = teclado.nextLine();
				System.out.println("Introduce el nuevo color");
				nuevoColor = teclado.nextLine();
				conexion.cambiarColor(conexion.consultaCamion(matricula),nuevoColor);
				conexion.pintarVehiculo(conexion.consultaCamion(matricula));
			}
			else{
				
				System.out.println("Introduce la matricula del coche que deseas pintar");
				matricula = teclado.nextLine();
				matricula = teclado.nextLine();
				System.out.println("Introduce el nuevo color");
				nuevoColor = teclado.nextLine();
				conexion.cambiarColor(conexion.consultaCoche(matricula),nuevoColor);
				conexion.pintarVehiculo(conexion.consultaCoche(matricula));
				
			};
			
			Historico h6 = new Historico();
			h6.crearHistorico("Se ha pintado el vehiculo con matricula "+ matricula +" al color "+nuevoColor+".");
			return null;
	}
}
