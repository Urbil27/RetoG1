package comunicacion;
import java.util.Scanner;

import acciones.Compra;
import acciones.Pinta;
import acciones.Venta;

public class Menu {
	public static void main(String args[]) {
		
		//Utilizaremos el Scanner para poder leer y que el usuario introduzca los valores.
		Scanner teclado= new Scanner(System.in);
		
		//Para entrar en un bucle en el que se muestre el menú para realizar las acciones, crearemos una variable que sea distinta a 8 a no ser que se quiera salir.
		int opcion = 0; 
		
		// creamos la conexion con la base de datos, es decir llamamos a la clase comBD
		ComBD conexion = new ComBD();
		conexion.conectar();
		
		System.out.println("Bienvenido, pongamonos a trabajar.");
		System.out.println();
		
		do {
			
			//En este menú se muestra las opciones que se ofrecen para realizar en el trabajo.
			System.out.println("1.-Mostrar Stock de los coches disponibles.");
			System.out.println("2.-Mostrar Stock de los camiones disponibles.");
			System.out.println("3.-Mostrar coches por color.");
			System.out.println("4.-Mostrar camiones por color.");
			System.out.println("5.-Mostrar Series.");
			System.out.println("6.-Pintar vehículo.");
			System.out.println("7.-Comprar Vehículo.");
			System.out.println("8.-Vender Vehículo.");
			System.out.println("9.-Exportar Datos.");
			System.out.println("10.-Importar Datos.");
			System.out.println("11.-Salir.");
			
			System.out.println();
			
			//Para seleccionar una de las opciones pregunaremos al usuario que desea realizar, metiendo un numero. Dependiendo del numero entrará en una opción u otra; Además se preguntará si esta seguro.
			System.out.println("¿Que actividad deseas realizar?");
			opcion = teclado.nextInt();
			
			//comprobaremos que el usuario introduce un valor por el cual pueda elegir una opción.
			while(opcion <= 0 || opcion > 11) {
				System.out.println("");
				System.out.println("Parece que ha habido un error; Asegúrate de introducir una opción que esté disponible.");
				System.out.println("(un número entre 1 y 9.)");
				System.out.println("¿Que actividad deseas realizar?");
				opcion = teclado.nextInt();
			}

			//Ahora nos dedicaremos a las funciones del menu.
			//Mediante las siguientes líneas de comadno se ejecutarán las funciones de las distintas clases.
			
			boolean continuar = false;
			
			switch (opcion) {
			
				// en caso de que la opción introducida sea 1;se mostrarán todos los coches que hay disponibles en la base de datos.
				case 1:
					System.out.println("1.-Mostrar Stock de los coches disponibles.");
					conexion.muestraStockCoche();
					break;
				
				// en caso de que la opcion introducida sea la 2; se mostrarán todos los camiones que hay disponibles en la base de datos.
				case 2:
					System.out.println("2.-Mostrar Stock de los camiones disponibles.");
					conexion.muestraStockCamion();
					break;
				
				// en caso de que la opcion introducida sea la 3; mostrará todos los coches de un mismo color.
				case 3:
					System.out.println("3.-Mostrar coches por color.");
					break;
				
				// en caso de que la opcion introducida sea la 4; mostrará todos los camiones de un mismo color.
				case 4:
					System.out.println("4.-Mostrar camiones por color.");
					break;
			    // en caso de que la opcion introducida sea la 5; mostrará las series que hay disponibles
				case 5:
					System.out.println("5.-Mostrar Series.");
					System.out.println("Introduce el código de la serie que quieres que te muestre:");
					int codSerie = teclado.nextInt();
					conexion.consultaSerie(codSerie);
					break;
				// en caso de que la opcion introducida sea la 6; se elegirá un vehiculo para pintarlo
				case 6:
					System.out.println("6.-Pintar vehículo.");
					Pinta p1 = new Pinta();
					p1.pintar();
					break;
				// en caso de que la opcion introducida sea la 7; se hbrirá la opción de comprar un vehiculo
				case 7:
					System.out.println("7.-Comprar Vehículo.");
					Compra c1 = new Compra();
					c1.comprar();
					break;
				// en caso de que la opcion introducida sea la 8; se habrirá la opcion de vender un vehiculo
				case 8:
					System.out.println("8.-Vender Vehículo.");
					Venta v1 = new Venta();
					System.out.println(v1.vender());
					break;
				// en caso de que la opcion introducida sea la 9; se habrirá la opcion para exportar datos
				case 9:
					System.out.println("9.-Exportar Datos.");
					break;
				// en caso de que la opcion introducida sea la 10; se habrirá la opción de importar datos. 
				case 10:
					System.out.println("10.-Importar Datos.");
					
					break;
			}
			
			System.out.println();
			System.out.println();
		}
		while(opcion != 11);
		//FIN del programa
		System.out.println("Fin del programa");
	}
}
