package comunicacion;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComBD conexion = new ComBD();
		conexion.conectar();
		//conexion.muestraStockCoche();
		System.out.println(conexion.consultaCoche("1234ifg"));
	}

}
