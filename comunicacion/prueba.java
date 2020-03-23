package comunicacion;

public class prueba {

	public static void main(String[] args) {


		ComBD conexion = new ComBD();
		conexion.conectar();
		//conexion.muestraStockCoche();
		//System.out.println(conexion.consultaCoche("1234ihg"));
		vehiculos.Coche c5 = new vehiculos.Coche(5,200,"8387ctf",463746,"Negro",6,1,1560,false);
		//conexion.borraCoche(c5);
		conexion.muestraStockCoche();
		//conexion.consultaCoche("1234ifg");
		conexion.cambiarColor(conexion.consultaCoche("1234ifg"), "Rojo");
		System.out.println("cambio color");
		conexion.muestraStockCoche();
		
	}

}
