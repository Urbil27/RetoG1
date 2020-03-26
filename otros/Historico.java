package otros;
import java.io.*;
import java.util.Calendar;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Historico {
	public Historico(){
		
	}
	
	String cogerHora() {
		Calendar calendario = Calendar.getInstance();
		int ano, mes, dia, hora, minutos, segundos;
		
		ano = calendario.get(Calendar.YEAR);
		mes = calendario.get(Calendar.MONTH);
		dia = calendario.get(Calendar.DAY_OF_MONTH);
		
		hora =calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		
		String momento = ("Fecha: " + dia +"/"+ mes +"/"+ ano + " ->a las "+hora+":"+minutos);
		return momento;
	} 
	
	
	public void crearHistorico(String dat){
		File archivo;// para manipular
		FileWriter escribir;//para escribir
		PrintWriter linea;// para escrubur en el archivo
		
		archivo = new File("Historico.txt");//preparando archivo
		String dato =dat;
		
		//se comprueba si existe
		if(!archivo.exists()) {
			try {
				
				archivo.createNewFile();

				escribir = new FileWriter(archivo,true);
				linea = new PrintWriter(escribir);
				// escribimos en el archivo
				linea.println(cogerHora()+"->"+dato);
				linea.close();
				escribir.close();
				
				}
			catch(IOException ex){System.out.println("error");}
		}
		else {
			try {
			
				escribir = new FileWriter(archivo,true);
				linea = new PrintWriter(escribir);
				// escribimos en eSl archivo
				linea.println(cogerHora()+" ->"+dato);
				linea.close();
				escribir.close();
				
				}
			catch(IOException ex){System.out.println("error");}
		}
}
}