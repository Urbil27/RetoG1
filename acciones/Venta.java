package acciones;
import java.util.Scanner;
public class Venta {
		
	String vender(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Que vehículo quieres vender?");
		System.out.println("0) NO");
		System.out.println("1) SI");
		int tipo = teclado.nextInt();
		if(tipo == 0) {
			
		}
		return "Se ha realizado correctamente la venta del vehículo.";
	}
}
