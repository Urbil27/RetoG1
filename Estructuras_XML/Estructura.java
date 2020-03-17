package Estructuras_XML;

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
 
public class Estructura{
 
    public static void main(String[] args) {
 
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
            Text textCodSerie = documento.createTextNode("400");
            codSerie.appendChild(textCodSerie);
            serie.appendChild(codSerie);
            
            // modelo de vehiculo que tiene esta serie
            Element modelo = documento.createElement("modelo");
            Text textModelo = documento.createTextNode("400");
            modelo.appendChild(textModelo);
            serie.appendChild(modelo);
            
            // marca del vehiculo de esta serie
            Element marca = documento.createElement("marca");
            Text textMarca = documento.createTextNode("400");
            marca.appendChild(textMarca);
            serie.appendChild(marca);
            
            // año de fabricacion del vehiculo de esta serie
            Element añoFabricacion = documento.createElement("añoFabricacion");
            Text textAñoFabricacion = documento.createTextNode("400");
            añoFabricacion.appendChild(textAñoFabricacion);
            serie.appendChild(añoFabricacion);
            
            
            // --------------------------------------------------------------------
            
            
            // Se crea una etiqueta XML
            Element coches = documento.createElement("coches");
            // Creo los elementos de la etiqueta coches
            
            //numero de bastidor
            Element numBastidorCoche = documento.createElement("numBastidorCoche");
            Text textNumBastidorCoche = documento.createTextNode("400");
            numBastidorCoche.appendChild(textNumBastidorCoche);
            coche.appendChild(numBastidorCoche);
            
            // color del coche
            Element colorCoche = documento.createElement("colorCoche");
            Text textColorCoche = documento.createTextNode("400");
            colorCoche.appendChild(textColorCoche);
            coche.appendChild(colorCoche);
            
            // numero de asientos que tiene el coche
            Element numAsientosCoche = documento.createElement("numAsientosCoche");
            Text textNumAsientosCoche = documento.createTextNode("400");
            numAsientosCoche.appendChild(textNumAsientosCoche);
            coche.appendChild(numAsientosCoche);
            
            // precio del coche
            Element precioCoche = documento.createElement("precioCoche");
            Text textPrecioCoche = documento.createTextNode("400");
            precioCoche.appendChild(textPrecioCoche);
            coche.appendChild(precioCoche);
            
            // si el coche esta pintado o no
            Element pintadoCoche = documento.createElement("pintadoCoche");
            Text textPintadoCoche = documento.createTextNode("400");
            pintadoCoche.appendChild(textPintadoCoche);
            coche.appendChild(pintadoCoche);
            
            // el codigo de la serie en la que permanece el coche
            Element codSerieCoche = documento.createElement("codSerieCoche");
            Text textCodSerieCoche = documento.createTextNode("400");
            codSerieCoche.appendChild(textCodSerieCoche);
            coche.appendChild(codSerieCoche);
            
            // Matricula Coche
            Element matriculaCoche = documento.createElement("matriculaCoche");
            Text textMatriculaCoche = documento.createTextNode("1111AAA");
            matriculaCoche.appendChild(textMatriculaCoche);
            coche.appendChild(matriculaCoche);
            
            // Numero de puertas del coche
            Element numPuertasCoche = documento.createElement("numPuertasCoche");
            Text textNumPuertasCoche = documento.createTextNode("4");
            numPuertasCoche.appendChild(textNumPuertasCoche);
            coche.appendChild(numPuertasCoche);
            
            // Capacidad maletero
            Element capacidadMaleteroCoche = documento.createElement("capacidadMaleteroCoche");
            Text textCapacidadMaleteroCoche = documento.createTextNode("400");
            numPuertasCoche.appendChild(textCapacidadMaleteroCoche);
            coche.appendChild(capacidadMaleteroCoche);
            
            
            // --------------------------------------------------------------------
            
            
            // Creo la siguiente etiqueta Camiones
            Element camiones = documento.createElement("camiones");
            // Creo los elementos de la etiqueta camiones
            
            // numero de bastidor del camion
            Element numBastidor = documento.createElement("numBastidor");
            Text textNumBastidor = documento.createTextNode("400");
            numBastidor.appendChild(textNumBastidor);
            camion.appendChild(numBastidor);
            
            // color del camion
            Element colorCamion = documento.createElement("colorCamion");
            Text textColorCamion = documento.createTextNode("400");
            colorCamion.appendChild(textColorCamion);
            camion.appendChild(colorCamion);
            
            // numero de asientos de los que dispone el camion
            Element numAsientosCamion = documento.createElement("numAsientosCamion");
            Text textNumAsientosCamion = documento.createTextNode("400");
            numAsientosCamion.appendChild(textNumAsientosCamion);
            camion.appendChild(numAsientosCamion);
            
            // precio que tiene el camion para su venta
            Element precioCamion = documento.createElement("precioCamion");
            Text textPrecioCamion = documento.createTextNode("400");
            precioCamion.appendChild(textPrecioCamion);
            camion.appendChild(precioCamion);
            
            // si el camion ha sido pintado o no
            Element pintadoCamion = documento.createElement("pintadoCamion");
            Text textPintadoCamion = documento.createTextNode("400");
            pintadoCamion.appendChild(textPintadoCamion);
            camion.appendChild(pintadoCamion);
            
            // el codigo de la serie de la que pertenece el camion
            Element codSerieCamion = documento.createElement("codSerieCamion");
            Text textCodSerieCamion = documento.createTextNode("400");
            codSerieCamion.appendChild(textCodSerieCamion);
            camion.appendChild(codSerieCamion);
            
            // matricula del camion
            Element matriculaCamion = documento.createElement("matriculaCamion");
            Text textMatriculaCamion = documento.createTextNode("400");
            matriculaCamion.appendChild(textMatriculaCamion);
            camion.appendChild(matriculaCamion);
            
            // cuanta carga que puede llevar el camion
            Element cargaCamion = documento.createElement("cargaCamion");
            Text textCargaCamion = documento.createTextNode("400");
            cargaCamion.appendChild(textCargaCamion);
            camion.appendChild(cargaCamion);
            
            // el tipo de mercancia que puede llevar el camion
            Element tipoMercanciaCamion = documento.createElement("tipoMercanciaCamion");
            Text textTipoMercanciaCamion = documento.createTextNode("400");
            tipoMercanciaCamion.appendChild(textTipoMercanciaCamion);
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
            Result result = new StreamResult(new File("pruebaMARKI.xml"));
 
            // Creo un transformer, se crea el fichero XML
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
 
        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }
 
    }
 
}