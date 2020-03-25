package otros;

import java.io.IOException;
import java.io.FileWriter;

public class Historicop1 {
    public static void main(String args[]) throws IOException{
    	FileWriter fichero = new FileWriter ("C:/Users/Zaballuko/Desktop/Miguel/Miguel Zabal Ciclo/RetoPrograma/Programa/pruebahistorico2.txt");
    	String contenido;
    	for(int x = 0; x<10;x++) {
    		contenido="esta es la prueba"+x+"\n";
    		fichero.write(contenido);	
    	}

    	fichero.close();
    }

}