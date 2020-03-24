package acciones;
import java.util.Scanner;
	public class Compra {
		
		float precio;
		String matricula;
		
		Compra(vehiculos.Vehiculo c, float pre){
		matricula=c.getMatricula();
		precio=pre;
		}
		
		// Mediante este metodo se comprará un vehiculo introducido por el usuario.
		String comprar(){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Vehiculo a comprar:");
			System.out.println("1) Camión");
			System.out.println("2) Coche");
			int opcion = teclado.nextInt();
			if(opcion == 1) {
				
			}
			if(opcion == 2) {
				
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
