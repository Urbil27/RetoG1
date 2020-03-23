package acciones;
import java.util.Scanner;
public class Compra {
	float precio;
	String matricula;
	Compra(vehiculos.Vehiculo c){
	matricula=c.getMatricula();
	}
	
	String comprar(){
		Scanner teclado = new Scanner(System.in);
		
		return "Se ha realizado correctamente la compra del vehículo.";
	}
}
