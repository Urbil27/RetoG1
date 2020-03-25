package acciones;
import java.util.Scanner;
import vehiculos.*;
	public class Compra {
		
		float precio;
		String matricula;
		
		Compra(){
	
		}
		public comunicacion.ComBD conexion = new comunicacion.ComBD();
		// Mediante este metodo se comprará un vehiculo introducido por el usuario.
		String comprar(){
			Scanner teclado = new Scanner(System.in);


			System.out.println("Vehiculo a comprar:");
			System.out.println("1) Camión");
			System.out.println("2) Coche");
			int opcion = teclado.nextInt();
			if(opcion == 1) {
				System.out.println("Inserta el precio:");
				float precio = teclado.nextFloat();
				System.out.println("Inserte la matricula:");
				String matricula = teclado.nextLine();
				System.out.println("Inserte el numero de bastidor");
				int numBastidor = teclado.nextInt();
				System.out.println("Inserta el color:");
				String color = teclado.nextLine();
				System.out.println("Inserta el numero de asientos:");
				int numAsientos=teclado.nextInt();
				System.out.println("Inserta el numero de serie");
				int numSerie = teclado.nextInt();
				System.out.println("¿Este camion ha sido pintado?");
				System.out.println("0) NO");
				System.out.println("1) SI");
				int pint = teclado.nextInt();
				boolean pintado = false;
				if(pint==0) {
					pintado=false;
				}
				else if(pint ==1) {
					pintado=true;
				}
				System.out.println("¿Cuanta carga soporta este camion?");
				float carga = teclado.nextFloat();
				System.out.println("Tipo de carga:");
				System.out.println("1) A");
				System.out.println("2) B");
				System.out.println("3) C");
				int tipo = teclado.nextInt();
				char tipoCarga = 0;
				if(tipo==1) {
					tipoCarga = 'A';
				}
				else if(tipo == 2) {
					tipoCarga = 'B';
				}
				else if(tipo == 3) {
					tipoCarga = 'C';
				}
				
				
			Camion camion = new Camion(carga, tipoCarga, matricula, numBastidor, color, numAsientos, numSerie, precio,pintado);
			conexion.meteVehiculo(camion);
			}
			else if(opcion == 2) {
				System.out.println("Inserte el precio:");
				float precio = teclado.nextFloat();
				System.out.println("Inserte la matricula:");
				String matricula = teclado.nextLine();
				System.out.println("Inserte el numero de bastidor:");
				int numBastidor = teclado.nextInt();
				System.out.println("Inserta el color:");
				String color = teclado.nextLine();
				System.out.println("Inserte el numero de asientos:");
				int numAsientos = teclado.nextInt();
				System.out.println("Inserta el numero de serie:");
				int numSerie = teclado.nextInt();
				System.out.println("Inserte el numero de puertas:");
				int numPuertas = teclado.nextInt();
				System.out.println("introduzca la capacidad del maletero en Litros");
				float capacidadMaletero = teclado.nextFloat();
				
				System.out.println("¿Este coche ha sido pintado?");
				System.out.println("0) NO");
				System.out.println("1) SI");
				int pint = teclado.nextInt();
				boolean pintado = false;
				if(pint == 0) {
					pintado=false;
				}
				else if(pint == 1) {
					pintado =true;
				}
				Coche coche = new Coche(numPuertas,capacidadMaletero,matricula,numBastidor,color,numAsientos,numSerie,precio,pintado);
				conexion.meteVehiculo(coche);
			}
			

			return "Se ha realizado correctamente la compra del vehículo.";
		}

		public float getPrecio() {
			return precio;
		}

		public void setPrecio(float precio) {
			this.precio = precio;
		}

		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
}
