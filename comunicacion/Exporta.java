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
            // Crearemos los elementos de coche, camion y serie donde se guardarán
            Element series = documento.createElement("series");
            Element coches = documento.createElement("coches");
            Element camiones = documento.createElement("camiones");
            // --------------------------------------------------------------------
            
            // Creo la etiqueta series
            
            // Creo los elementos de la etiqueta series 
            for(Serie s : conexion.getSeries()) {
            	Element serie = documento.createElement("serie");
                series.appendChild(serie);
            // codigo de la serie
                
            Element codSerie = documento.createElement("codSerie");
            Iterator it = conexion.getSeries().iterator();
            Text textCodSerie = documento.createTextNode(""+s.getCodSerie());
            codSerie.appendChild(textCodSerie);
            serie.appendChild(codSerie);
            
            // modelo de vehiculo que tiene esta serie
            Element modelo = documento.createElement("modelo");
            Text textModelo = documento.createTextNode(s.getModelo());
            modelo.appendChild(textModelo);
            serie.appendChild(modelo);
            
            // marca del vehiculo de esta serie
            Element marca = documento.createElement("marca");
            Text textMarca = documento.createTextNode(s.getMarca());
            marca.appendChild(textMarca);
            serie.appendChild(marca);
            
            // año de fabricacion del vehiculo de esta serie
            Element añoFabricacion = documento.createElement("añoFabricacion");
            Text textAñoFabricacion = documento.createTextNode(""+s.getAñoFabricacion());
            añoFabricacion.appendChild(textAñoFabricacion);
            serie.appendChild(añoFabricacion);
            
            }
            // --------------------------------------------------------------------
            
            for(Coche c : conexion.getCoches()) {
            // Se crea una etiqueta XML
            // Creo los elementos de la etiqueta coches
            Element coche = documento.createElement("coche");
            coches.appendChild(coche);
            	
            //numero de bastidor
            Element numBastidorCoche = documento.createElement("numBastidorCoche");
            Text textNumBastidorCoche = documento.createTextNode(""+c.getNumBastidor());
            numBastidorCoche.appendChild(textNumBastidorCoche);
            coche.appendChild(numBastidorCoche);
            
            // color del coche
            Element colorCoche = documento.createElement("colorCoche");
            Text textColorCoche = documento.createTextNode(c.getColor());
            colorCoche.appendChild(textColorCoche);
            coche.appendChild(colorCoche);
            
            // numero de asientos que tiene el coche
            Element numAsientosCoche = documento.createElement("numAsientosCoche");
            Text textNumAsientosCoche = documento.createTextNode(""+c.getNumAsientos());
            numAsientosCoche.appendChild(textNumAsientosCoche);
            coche.appendChild(numAsientosCoche);
            
            // precio del coche
            Element precioCoche = documento.createElement("precioCoche");
            Text textPrecioCoche = documento.createTextNode(""+c.getPrecio());
            precioCoche.appendChild(textPrecioCoche);
            coche.appendChild(precioCoche);
            
            // si el coche esta pintado o no
            Element pintadoCoche = documento.createElement("pintadoCoche");
            Text textPintadoCoche = documento.createTextNode(""+c.isPintado());
            pintadoCoche.appendChild(textPintadoCoche);
            coche.appendChild(pintadoCoche);
            
            // el codigo de la serie en la que permanece el coche
            Element codSerieCoche = documento.createElement("codSerieCoche");
            Text textCodSerieCoche = documento.createTextNode(""+c.getSerie());
            codSerieCoche.appendChild(textCodSerieCoche);
            coche.appendChild(codSerieCoche);
            
            // Matricula Coche
            Element matriculaCoche = documento.createElement("matriculaCoche");
            Text textMatriculaCoche = documento.createTextNode(c.getMatricula());
            matriculaCoche.appendChild(textMatriculaCoche);
            coche.appendChild(matriculaCoche);
            
            // Numero de puertas del coche
            Element numPuertasCoche = documento.createElement("numPuertasCoche");
            Text textNumPuertasCoche = documento.createTextNode(""+c.getNumPuertas());
            numPuertasCoche.appendChild(textNumPuertasCoche);
            coche.appendChild(numPuertasCoche);
            
            // Capacidad maletero
            Element capacidadMaleteroCoche = documento.createElement("capacidadMaleteroCoche");
            Text textCapacidadMaleteroCoche = documento.createTextNode(""+c.getCapacidadMaletero());
            numPuertasCoche.appendChild(textCapacidadMaleteroCoche);
            coche.appendChild(capacidadMaleteroCoche);
            
            }
            // --------------------------------------------------------------------
            
            
            for(Camion c :conexion.getCamiones()) {
	            // Creo la siguiente etiqueta Camion
	            Element camion = documento.createElement("camion");
	            camiones.appendChild(camion);
	            // Creo los elementos de la etiqueta camiones
	            
	            // numero de bastidor del camion
	            Element numBastidor = documento.createElement("numBastidor");
	            Text textNumBastidor = documento.createTextNode(""+c.getNumBastidor());
	            numBastidor.appendChild(textNumBastidor);
	            camion.appendChild(numBastidor);
	            
	            // color del camion
	            Element colorCamion = documento.createElement("colorCamion");
	            Text textColorCamion = documento.createTextNode(c.getColor());
	            colorCamion.appendChild(textColorCamion);
	            camion.appendChild(colorCamion);
	            
	            // numero de asientos de los que dispone el camion
	            Element numAsientosCamion = documento.createElement("numAsientosCamion");
	            Text textNumAsientosCamion = documento.createTextNode(""+c.getNumAsientos());
	            numAsientosCamion.appendChild(textNumAsientosCamion);
	            camion.appendChild(numAsientosCamion);
	            
	            // precio que tiene el camion para su venta
	            Element precioCamion = documento.createElement("precioCamion");
	            Text textPrecioCamion = documento.createTextNode(""+c.getPrecio());
	            precioCamion.appendChild(textPrecioCamion);
	            camion.appendChild(precioCamion);
	            
	            // si el camion ha sido pintado o no
	            Element pintadoCamion = documento.createElement("pintadoCamion");
	            Text textPintadoCamion = documento.createTextNode(""+c.isPintado());
	            pintadoCamion.appendChild(textPintadoCamion);
	            camion.appendChild(pintadoCamion);
	            
	            // el codigo de la serie de la que pertenece el camion
	            Element codSerieCamion = documento.createElement("codSerieCamion");
	            Text textCodSerieCamion = documento.createTextNode(""+c.getSerie());
	            codSerieCamion.appendChild(textCodSerieCamion);
	            camion.appendChild(codSerieCamion);
	            
	            // matricula del camion
	            Element matriculaCamion = documento.createElement("matriculaCamion");
	            Text textMatriculaCamion = documento.createTextNode(c.getMatricula());
	            matriculaCamion.appendChild(textMatriculaCamion);
	            camion.appendChild(matriculaCamion);
	            
	            // cuanta carga que puede llevar el camion
	            Element cargaCamion = documento.createElement("cargaCamion");
	            Text textCargaCamion = documento.createTextNode(""+c.getCarga());
	            cargaCamion.appendChild(textCargaCamion);
	            camion.appendChild(cargaCamion);
	            
	            // el tipo de mercancia que puede llevar el camion
	            Element tipoMercanciaCamion = documento.createElement("tipoMercanciaCamion");
	            Text textTipoMercanciaCamion = documento.createTextNode(""+c.getTipoMercancia());
	            tipoMercanciaCamion.appendChild(textTipoMercanciaCamion);
	            camion.appendChild(tipoMercanciaCamion);
            }
            // --------------------------------------------------------------------
            
            
            // Añado al root el elemento coches
            documento.getDocumentElement().appendChild(series);
            documento.getDocumentElement().appendChild(camiones);
            documento.getDocumentElement().appendChild(coches);
            
            // --------------------------------------------------------------------
            
            // Asocio el source con el Document
            Source source = new DOMSource(documento);
            // Creo el Result, indicado que fichero se va a crear
            Result result = new StreamResult(new File("Exportar.xml"));
 
            // Creo un transformer, se crea el fichero XML
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
 
        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }
 
    }
 
}