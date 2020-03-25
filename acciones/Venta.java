package acciones;
import java.util.Scanner;
import comunicacion.ComBD;
public class Venta {
		
	public String vender(){
		ComBD conexion = new ComBD();
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Que vehículo quieres vender?");
		System.out.println("0) Camion");
		System.out.println("1) Coche");
		int tipo = teclado.nextInt();
		if(tipo == 0) {
			System.out.println("Has elegido la opcion CAMION");
			System.out.println("Inserte la matricula del camion:");
			String matricula = teclado.nextLine();
			System.out.println("¿Está seguro de que desea vendereste camion?");
			System.out.println("Matricula: "+ conexion.consultaCamion(matricula).getMatricula());
			System.out.println("Numero de bastidor: "+ conexion.consultaCamion(matricula).getNumBastidor());
			System.out.println("Color: "+ conexion.consultaCamion(matricula).getColor());
			System.out.println("ESTA OPERACION NO SE PUEDE DESHACER ¿CONTINUAR?");
			System.out.println("0) NO");
			System.out.println("1) SI");
			int opcion = teclado.nextInt();
			if(opcion == 0) {
				return "Venta cancelada";
			}
			else if(opcion == 1) {
				conexion.borraVehiculo(conexion.consultaCamion(matricula));
				return "Se ha realizado correctamente la venta del vehículo.";
			}
			
		}
		
		else if(tipo == 1) {
			System.out.println("Has elegido la opcion COCHE");
			System.out.println("Inserte la matricula del coche:");
			String matricula =teclado.nextLine();
			matricula =teclado.nextLine();
			System.out.println("¿Está seguro de que desea vender este coche?");
			System.out.println("Matricula: "+conexion.consultaCoche(matricula).getMatricula());
			System.out.println("Numero de bastidor: "+ conexion.consultaCoche(matricula).getNumBastidor());
			System.out.println("Color: "+conexion.consultaCoche(matricula).getColor());
			System.out.println("ESTA OPERACIÓN NO SE PUEDE DESHACER, ¿CONTINUAR?");
			System.out.println("0) NO");
			System.out.println("1) SI");
			int opcion = teclado.nextInt();
			if(opcion == 0) {
				return "Venta cancelada";
			}
			else if (opcion == 1) {
				conexion.borraVehiculo(conexion.consultaCoche(matricula));
				return "Se ha realizado correctamente la venta del vehículo.";
			}
			
		}
		
		return "";
	}
}
