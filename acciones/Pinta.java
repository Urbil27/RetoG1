package acciones;

import java.util.Scanner;

public class Pinta {

	vehiculos.Vehiculo p1;
	
	public Pinta(){
		
	}
	
	public comunicacion.ComBD conexion = new comunicacion.ComBD();
	// Primero y gracias al siguiente metodo se cambiará el color del coche
	
	public String pintar() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Vehiculo a pintar:");
		System.out.println("1) Camión");
		System.out.println("2) Coche");
		int eleccion = teclado.nextInt();
		
<<<<<<< HEAD
		while(opcion != 1 && opcion != 2) {
=======
		while(eleccion != 1 && eleccion != 2) {
>>>>>>> bd765c4794cbb22d844ebb8983df64049ed2cc8c
			System.out.println("No has introducido correctamente tu eleccion.");
			System.out.println("Porfavor, introduce el vehiculo que vas a pintar");
			System.out.println("1) Camión");
			System.out.println("2) Coche");
			eleccion = teclado.nextInt();
		}
			if(eleccion==1) {
				
				System.out.println("Introduce la matricula del camion que deseas pintar");
				String matricula = teclado.nextLine();
				matricula = teclado.nextLine();
				System.out.println("Introduce el nuevo color");
				String nuevoColor = teclado.nextLine();
				conexion.cambiarColor(conexion.consultaCamion(matricula),nuevoColor);
				conexion.pintarVehiculo(conexion.consultaCamion(matricula));
			}
			else{
				
				System.out.println("Introduce la matricula del coche que deseas pintar");
				String matricula = teclado.nextLine();
				matricula = teclado.nextLine();
				System.out.println("Introduce el nuevo color");
				String nuevoColor = teclado.nextLine();
				conexion.cambiarColor(conexion.consultaCoche(matricula),nuevoColor);
				conexion.pintarVehiculo(conexion.consultaCoche(matricula));
				
			};
		return null;}
}
