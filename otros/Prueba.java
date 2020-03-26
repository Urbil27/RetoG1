package otros;

import java.util.Calendar;

public class Prueba {
	public static void main(String args[]) {
		Calendar calendario = Calendar.getInstance();
		int ano, mes, dia, hora, minutos, segundos;
		
		ano = calendario.get(Calendar.YEAR);
		mes = calendario.get(Calendar.MONTH);
		dia = calendario.get(Calendar.DAY_OF_MONTH);
		
		hora =calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		
		System.out.println("Fecha: " + dia +"/"+ mes +"/"+ ano + ". A las: "+hora+":"+minutos);

	}
}
