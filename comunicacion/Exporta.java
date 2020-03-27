package comunicacion;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import java.util.Iterator;
import otros.Serie;
import vehiculos.*;
 
public class Exporta{
	
	public Exporta() {
		
	}
	
    public void crearEstructura() {
    	
    	// creamos la conexion con la base de datos, es decir llamamos a la clase comBD
    	ComBD conexion = new ComBD();
    	conexion.conectar();
    	
        try {
            // Creo una instancia de DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Creo un documentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Creo un DOMImplementation
            DOMImplementation implementation = builder.getDOMImplementation();
 
            // Creo un documento con un elemento raiz
            // Se pondrán en null puesto que no tenemos ni el nameSpace ni el doctype.
            Document documento = implementation.createDocument(null, "concesionario", null);
            documento.setXmlVersion("1.0");
 
            // --------------------------------------------------------------------
            
            // Crearemos los elementos de coche, objeto y serie donde se guardarán
            Element serie = documento.createElement("serie"); 
            Element coche = documento.createElement("coche");
            Element camion = documento.createElement("camion"); 
            
            // --------------------------------------------------------------------
            
            // Creo la etiqueta series
            Element series = documento.createElement("series"); 
            // Creo los elementos de la etiqueta series 
            
            // codigo de la serie
            Element codSerie = documento.createElement("codSerie");
            for(Serie s : conexion.getSeries()) {
            	 Text textCodSerie = documento.createTextNode(""+s.getCodSerie());
                 codSerie.appendChild(textCodSerie);
            }
           
            serie.appendChild(codSerie);
            
            // modelo de vehiculo que tiene esta serie
            Element modelo = documento.createElement("modelo");
            for(Serie s : conexion.getSeries()) {
            	 Text textModelo = documento.createTextNode(s.getModelo());
                 modelo.appendChild(textModelo);
            }
           
            serie.appendChild(modelo);
            
            // marca del vehiculo de esta serie
            Element marca = documento.createElement("marca");
            for(Serie s : conexion.getSeries()) {
            	Text textMarca = documento.createTextNode(s.getMarca());
                marca.appendChild(textMarca);
            }
            
            serie.appendChild(marca);
            
            // año de fabricacion del vehiculo de esta serie
            Element añoFabricacion = documento.createElement("añoFabricacion");
            for(Serie s : conexion.getSeries()) {
            	 Text textAñoFabricacion = documento.createTextNode(""+s.getAñoFabricacion());
                 añoFabricacion.appendChild(textAñoFabricacion);
            }
           
            serie.appendChild(añoFabricacion);
            
            
            // --------------------------------------------------------------------
            
            
            // Se crea una etiqueta XML
            Element coches = documento.createElement("coches");
            // Creo los elementos de la etiqueta coches
            
            //numero de bastidor
            Element numBastidorCoche = documento.createElement("numBastidorCoche");
            for(Coche c : conexion.getCoches()) {
            	Text textNumBastidorCoche = documento.createTextNode(""+c.getNumBastidor());
                numBastidorCoche.appendChild(textNumBastidorCoche);
            }
            
            coche.appendChild(numBastidorCoche);
            
            // color del coche
            Element colorCoche = documento.createElement("colorCoche");
            for(Coche c : conexion.getCoches()) {
            	 Text textColorCoche = documento.createTextNode(c.getColor());
                 colorCoche.appendChild(textColorCoche);
            }
           
            coche.appendChild(colorCoche);
            
            // numero de asientos que tiene el coche
            Element numAsientosCoche = documento.createElement("numAsientosCoche");
            for(Coche c : conexion.getCoches()) {
            	 Text textNumAsientosCoche = documento.createTextNode(""+c.getNumAsientos());
                 numAsientosCoche.appendChild(textNumAsientosCoche);
            }
           
            coche.appendChild(numAsientosCoche);
            
            // precio del coche
            Element precioCoche = documento.createElement("precioCoche");
            for(Coche c : conexion.getCoches()) {
            	 Text textPrecioCoche = documento.createTextNode(""+c.getPrecio());
                 precioCoche.appendChild(textPrecioCoche);
            }
           
            coche.appendChild(precioCoche);
            
            // si el coche esta pintado o no
            Element pintadoCoche = documento.createElement("pintadoCoche");
            for(Coche c : conexion.getCoches()) {
            	 Text textPintadoCoche = documento.createTextNode(""+c.isPintado());
                 pintadoCoche.appendChild(textPintadoCoche);
            }
           
            coche.appendChild(pintadoCoche);
            
            // el codigo de la serie en la que permanece el coche
            Element codSerieCoche = documento.createElement("codSerieCoche");
            for(Coche c : conexion.getCoches()) {
            	Text textCodSerieCoche = documento.createTextNode(""+c.getSerie());
                codSerieCoche.appendChild(textCodSerieCoche);
            }
            
            coche.appendChild(codSerieCoche);
            
            // Matricula Coche
            Element matriculaCoche = documento.createElement("matriculaCoche");
            for(Coche c : conexion.getCoches()) {
            	Text textMatriculaCoche = documento.createTextNode(c.getMatricula());
                matriculaCoche.appendChild(textMatriculaCoche);
            }
            
            coche.appendChild(matriculaCoche);
            
            // Numero de puertas del coche
            Element numPuertasCoche = documento.createElement("numPuertasCoche");
            for(Coche c: conexion.getCoches()) {
            	 Text textNumPuertasCoche = documento.createTextNode(""+c.getNumPuertas());
                 numPuertasCoche.appendChild(textNumPuertasCoche);
            }
           
            coche.appendChild(numPuertasCoche);
            
            // Capacidad maletero
            Element capacidadMaleteroCoche = documento.createElement("capacidadMaleteroCoche");
            for(Coche c : conexion.getCoches()) {
            	Text textCapacidadMaleteroCoche = documento.createTextNode(""+c.getCapacidadMaletero());
                numPuertasCoche.appendChild(textCapacidadMaleteroCoche);
            }
            
            coche.appendChild(capacidadMaleteroCoche);
            
            
            // --------------------------------------------------------------------
            
            
            // Creo la siguiente etiqueta Camiones
            Element camiones = documento.createElement("camiones");
            // Creo los elementos de la etiqueta camiones
            
            // numero de bastidor del camion
            Element numBastidor = documento.createElement("numBastidor");
            for(Camion c :conexion.getCamiones()) {
            	Text textNumBastidor = documento.createTextNode(""+c.getNumBastidor());
                numBastidor.appendChild(textNumBastidor);
            }
            
            camion.appendChild(numBastidor);
            
            // color del camion
            Element colorCamion = documento.createElement("colorCamion");
            for(Camion c : conexion.getCamiones()) {
            	Text textColorCamion = documento.createTextNode(c.getColor());
                colorCamion.appendChild(textColorCamion);
            }
            
            camion.appendChild(colorCamion);
            
            // numero de asientos de los que dispone el camion
            Element numAsientosCamion = documento.createElement("numAsientosCamion");
            for(Camion c : conexion.getCamiones()) {
            	 Text textNumAsientosCamion = documento.createTextNode(""+c.getNumAsientos());
                 numAsientosCamion.appendChild(textNumAsientosCamion);
            }
           
            camion.appendChild(numAsientosCamion);
            
            // precio que tiene el camion para su venta
            Element precioCamion = documento.createElement("precioCamion");
            for(Camion c : conexion.getCamiones()) {
            	Text textPrecioCamion = documento.createTextNode(""+c.getPrecio());
                precioCamion.appendChild(textPrecioCamion);
            }
            
            camion.appendChild(precioCamion);
            
            // si el camion ha sido pintado o no
            Element pintadoCamion = documento.createElement("pintadoCamion");
            for(Camion c : conexion.getCamiones()) {
            	 Text textPintadoCamion = documento.createTextNode(""+c.isPintado());
                 pintadoCamion.appendChild(textPintadoCamion);
            }
           
            camion.appendChild(pintadoCamion);
            
            // el codigo de la serie de la que pertenece el camion
            Element codSerieCamion = documento.createElement("codSerieCamion");
            for(Camion c : conexion.getCamiones()) {
            	  Text textCodSerieCamion = documento.createTextNode(""+c.getSerie());
                  codSerieCamion.appendChild(textCodSerieCamion);
            }
          
            camion.appendChild(codSerieCamion);
            
            // matricula del camion
            Element matriculaCamion = documento.createElement("matriculaCamion");
            for(Camion c : conexion.getCamiones()) {
            	Text textMatriculaCamion = documento.createTextNode(c.getMatricula());
                matriculaCamion.appendChild(textMatriculaCamion);
            }
            
            camion.appendChild(matriculaCamion);
            
            // cuanta carga que puede llevar el camion
            Element cargaCamion = documento.createElement("cargaCamion");
            for(Camion c : conexion.getCamiones()) {
            	 Text textCargaCamion = documento.createTextNode(""+c.getCarga());
                 cargaCamion.appendChild(textCargaCamion);
            }
           
            camion.appendChild(cargaCamion);
            
            // el tipo de mercancia que puede llevar el camion
            Element tipoMercanciaCamion = documento.createElement("tipoMercanciaCamion");
            for(Camion c : conexion.getCamiones()) {
            	Text textTipoMercanciaCamion = documento.createTextNode(""+c.getTipoMercancia());
                tipoMercanciaCamion.appendChild(textTipoMercanciaCamion);
            }
            
            camion.appendChild(tipoMercanciaCamion);
            
            // --------------------------------------------------------------------
            
            
            // Añado al root el elemento coches
            documento.getDocumentElement().appendChild(series);
            documento.getDocumentElement().appendChild(camiones);
            documento.getDocumentElement().appendChild(coches);
            
            // --------------------------------------------------------------------
            
            // Asocio el source con el Document
            Source source = new DOMSource(documento);
            // Creo el Result, indicado que fichero se va a crear
            Result result = new StreamResult(new File("pruebaMARKII.xml"));
 
            // Creo un transformer, se crea el fichero XML
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
 
        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }
 
    }
 
}