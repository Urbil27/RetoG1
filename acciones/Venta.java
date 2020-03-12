package acciones;

public class Venta {
	
	vehiculos.Vehiculo v1;
	
	Venta(vehiculos.Vehiculo v){
		v1=v;
	}
	
	String vender(){
		
		return "Se ha realizado correctamente la venta del vehículo.";
	}
}
