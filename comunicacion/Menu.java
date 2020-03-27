package comunicacion;
/*
 * Importamos lo necesario para que el programa funcione.
 */
import java.util.Scanner;
import java.io.*;

/*
 * Importamos las clases de los distintos paquetes para acceder a sus metodos. 
 */
import acciones.Compra;
import acciones.Pinta;
import acciones.Venta;
import otros.Serie;
import otros.Historico;

public class Menu {
	public static void main(String args[]) {
		
		//Utilizaremos el Scanner para poder leer y que el usuario introduzca los valores.
		Scanner teclado= new Scanner(System.in);
		
		/*
		 * Para entrar en un bucle en el que se muestre el men� para realizar las acciones, crearemos una variable que sea distinta a 8 a no ser que se quiera salir.
		 */
		int opcion = 0;
		
		// creamos la conexion con la base de datos, es decir llamamos a la clase comBD
		ComBD conexion = new ComBD();
		conexion.conectar();
		Historico h0 = new Historico();
		h0.crearHistorico("Se ha abierto la conexi�n con la base de datos.");
		
		System.out.println("Bienvenido, pongamonos a trabajar.");
		System.out.println();
		System.out.println("SELECCIONE EL M�MERO DE LA OPCION QUE DESEAS");
		System.out.println();
		
		do {
			
			//En este men� se muestra las opciones que se ofrecen para realizar en el trabajo.
			System.out.println("1.-Mostrar Stock de los coches disponibles.");
			System.out.println("2.-Mostrar Stock de los camiones disponibles.");
			System.out.println("3.-Mostrar coches por color.");
			System.out.println("4.-Mostrar camiones por color.");
			System.out.println("5.-Mostrar Series.");
			System.out.println("6.-Pintar veh�culo.");
			System.out.println("7.-Comprar Veh�culo.");
			System.out.println("8.-Vender Veh�culo.");
			System.out.println("9.-Exportar Datos.");
			System.out.println("10.-Importar Datos.");
			System.out.println("11.-Meter una serie.");
			System.out.println("12.-Salir.");
			
			System.out.println();
			
			//Para seleccionar una de las opciones pregunaremos al usuario que desea realizar, metiendo un numero. Dependiendo del numero entrar� en una opci�n u otra; Adem�s se preguntar� si esta seguro.
			System.out.println("�Que actividad deseas realizar?");
			opcion = teclado.nextInt();
			
			//comprobaremos que el usuario introduce un valor por el cual pueda elegir una opci�n.
			while(opcion <= 0 || opcion > 12) {
				System.out.println("");
				System.out.println("Parece que ha habido un error; Aseg�rate de introducir una opci�n que est� disponible.");
				System.out.println("(un n�mero entre 1 y 9.)");
				System.out.println("�Que actividad deseas realizar?");
				opcion = teclado.nextInt();
			}

			//Ahora nos dedicaremos a las funciones del menu.
			//Mediante las siguientes l�neas de comadno se ejecutar�n las funciones de las distintas clases.
			
			boolean continuar = false;
			
			switch (opcion) {
			
				// en caso de que la opci�n introducida sea 1;se mostrar�n todos los coches que hay disponibles en la base de datos.
				case 1:
					System.out.println("1.-Mostrar Stock de los coches disponibles.");
					System.out.println("");
					conexion.muestraStockCoche();
					Historico h1 = new Historico();
					h1.crearHistorico("Se han mostrado los coches que hay en Stock.");
					break;
				
				// en caso de que la opcion introducida sea la 2; se mostrar�n todos los camiones que hay disponibles en la base de datos.
				case 2:
					System.out.println("2.-Mostrar Stock de los camiones disponibles.");
					System.out.println("");
					conexion.muestraStockCamion();
					Historico h2 = new Historico();
					h2.crearHistorico("Se han mostrado los camiones que hay en Stock.");
					break;
				
				// en caso de que la opcion introducida sea la 3; mostrar� todos los coches de un mismo color.
				case 3:
					System.out.println("3.-Mostrar coches por color.");
					System.out.println("");
					System.out.println("Introduce el color que quieres buscar.");
					String colo = teclado.nextLine();
					colo = teclado.nextLine();
					conexion.muestraColorCoche(colo);
					Historico h3 = new Historico();
					h3.crearHistorico("Se han mostrado los coches que hay en color "+colo+".");
					break;
				
				// en caso de que la opcion introducida sea la 4; mostrar� todos los camiones de un mismo color.
				case 4:
					System.out.println("4.-Mostrar camiones por color.");
					System.out.println("");
					System.out.println("Introduce el color que quieres buscar.");
					String col = teclado.nextLine();
					col = teclado.nextLine();
					conexion.muestraColorCamion(col);
					Historico h4 = new Historico();
					h4.crearHistorico("Se han mostrado los camiones que hay en color "+col+".");
					break;
			    // en caso de que la opcion introducida sea la 5; mostrar� las series que hay disponibles
				case 5:
					System.out.println("5.-Mostrar Series.");
					System.out.println("");
					System.out.println("Introduce el c�digo de la serie que quieres que te muestre:");
					int codSerie = teclado.nextInt();
					System.out.println( "Marca: "+conexion.consultaSerie(codSerie).getMarca());
					System.out.println( "Modelo: "+conexion.consultaSerie(codSerie).getModelo());
					System.out.println( "A�o de fabricacion: "+conexion.consultaSerie(codSerie).getA�oFabricacion());
					Historico h5 = new Historico();
					h5.crearHistorico("Se han mostrado los datos de la serie "+codSerie+".");
					break;
				// en caso de que la opcion introducida sea la 6; se elegir� un vehiculo para pintarlo
				case 6:
					System.out.println("6.-Pintar veh�culo.");
					System.out.println("");
					Pinta p1 = new Pinta(conexion);
					p1.pintar();
					break;
				// en caso de que la opcion introducida sea la 7; se hbrir� la opci�n de comprar un vehiculo
				case 7:
					System.out.println("7.-Comprar Veh�culo.");
					System.out.println("");
					Compra c1 = new Compra(conexion);
					c1.comprar();
					break;
				// en caso de que la opcion introducida sea la 8; se habrir� la opcion de vender un vehiculo
				case 8:
					System.out.println("8.-Vender Veh�culo.");
					System.out.println("");
					Venta v1 = new Venta(conexion);
					System.out.println(v1.vender());
					break;
				// en caso de que la opcion introducida sea la 9; se habrir� la opcion para exportar datos
				case 9:
					System.out.println("9.-Exportar Datos.");
					System.out.println("");
					Exporta e = new Exporta();
					e.crearEstructura();
					Historico h9 = new Historico();
					h9.crearHistorico("Se han exportado los datos de la base de datos.");
					break;
				// en caso de que la opcion introducida sea la 10; se habrir� la opci�n de importar datos. 
				case 10:
					System.out.println("10.-Importar Datos.");
					System.out.println("");
					Importa pr = new Importa();
					pr.importar();
					Historico h10 = new Historico();
					h10.crearHistorico("Se han importado los datos de la base de datos.");
					break;
				// en caso de que la opcion introducida sea la 11; se habrir� la opci�n para crear una serie.
				case 11:
					System.out.println("11.- Crear serie.");
					System.out.println("");
					System.out.println("Dime el c�digo de la serie");
					int codSerie1 = teclado.nextInt();
					System.out.println("Dime el modelo para introducirlo a la serie.");
					String modelo = teclado.nextLine();
					modelo = teclado.nextLine();
					System.out.println("Dime la marca para introducirla a la serie.");
					String marca = teclado.nextLine();
					System.out.println("Dime el a�o de fabricaci�n para introducirlo a la serie.");
					int a�oFabricacion = teclado.nextInt();
					Serie s1 = new Serie(codSerie1, modelo, marca, a�oFabricacion);
					conexion.meteSerie(s1);
					Historico h11 = new Historico();
					h11.crearHistorico("Se ha creado la serie de c�digo:"+codSerie1);
					break;
			}
			
			System.out.println();
			System.out.println();
		}
		while(opcion != 12);
		//FIN del programa

		conexion.desconectar();
		System.out.println("Fin del programa");
		Historico h12 = new Historico();
		h12.crearHistorico("Se ha cerrado la conexi�n con la base de datos.");
		h12.crearHistorico("Fin del programa.");
		h12.crearHistorico("----------------------------------------------------------------");

	}
}
