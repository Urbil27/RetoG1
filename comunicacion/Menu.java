package comunicacion;
import java.util.Scanner;

public class Menu {
	public static void main(String args[]) {
		
		//Utilizaremos el Scanner para poder leer y que el usuario introduzca los valores.
		Scanner teclado= new Scanner(System.in);
		
		//Para entrar en un bucle en el que se muestre el menú para realizar las acciones, crearemos una variable que sea distinta a 8 a no ser que se quiera salir.
		int opcion = 0; 
		
		System.out.println("Bienvenido, pongamonos a trabajar.");
		System.out.println();
		
		do {
			
			//En este menú se muestra las opciones que se ofrecen para realizar en el trabajo.
			System.out.println("1.-Mostrar Stock.");
			System.out.println("2.-Mostrar Series.");
			System.out.println("3.-Mostrar Vehiculos por color.");
			System.out.println("4.-Exportar Datos.");
			System.out.println("5.-Importar Datos.");
			System.out.println("6.-Comprar Vehículo.");
			System.out.println("7.-Vender Vehículo.");
			System.out.println("8.-Pintar vehículo.");
			System.out.println("9.-Salir.");
			
			System.out.println();
			
			//Para seleccionar una de las opciones pregunaremos al usuario que desea realizar, metiendo un numero. Dependiendo del numero entrará en una opción u otra; Además se preguntará si esta seguro.
			System.out.println("¿Que actividad deseas realizar?");
			opcion = teclado.nextInt();
			
			//comprobaremos que el usuario introduce un valor por el cual pueda elegir una opción.
			while(opcion <= 0 || opcion > 9) {
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
			
				//en caso de que la opción introducida sea 1(en estecaso, se ejecutará el siguiente código; de esta forma se realizarán las acciones para el trabajo)
				case 1:
					System.out.println("opcion 1");
					break;
				case 2:
					System.out.println("opcion 2");
					break;
				case 3:
					System.out.println("opcion 3");
					break;
				case 4:
					System.out.println("opcion 4");
					break;
				case 5:
					System.out.println("opcion 5");
					break;
				case 6:
					System.out.println("opcion 6");
					break;
				case 7:
					System.out.println("opcion 7");
					break;
				case 8:
					System.out.println("opcion 8");
					break;
			}
			
			System.out.println();
			System.out.println();
		}
		while(opcion != 9);
		//FIN del programa
		System.out.println("Fin del programa");
	}
}
