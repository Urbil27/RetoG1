package acciones;
import java.util.Scanner;
	public class Compra {
		
		float precio;
		String matricula;
		
		Compra(vehiculos.Vehiculo c){
		matricula=c.getMatricula();
		}
		
		// Mediante este metodo se comprará un vehiculo introducido por el usuario.
		String comprar(){
			System.out.println("Introduce la matricula del vehiculo que quieres comprar.");
			Scanner teclado = new Scanner(System.in);
			
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
