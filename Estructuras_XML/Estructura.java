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
 
            
            // Crearemos los elementos de coche, objeto y serie donde se guardarán
            Element serie = documento.createElement("serie"); 
            Element coche = documento.createElement("coche");
            Element camion = documento.createElement("camion"); 
            
            
            // Creo la etiqueta series
            Element series = documento.createElement("series"); 
            
            // Creo los elementos de la etiqueta series  
            Element codSerie = documento.createElement("codSerie");
            Element modelo = documento.createElement("modelo");
            Element marca = documento.createElement("marca");
            Element añoFabricacion = documento.createElement("añoFabricacion");
            
            
            // Se crea una etiqueta XML
            Element coches = documento.createElement("coches");
            
            // Creo los elementos de la etiqueta coches
            Element numBastidorCoche = documento.createElement("numBastidorCoche");
            Element colorCoche = documento.createElement("colorCoche");
            Element numAsientosCoche = documento.createElement("numAsientosCoche");
            Element precioCoche = documento.createElement("precioCoche");
            Element pintadoCoche = documento.createElement("pintadoCoche");
            Element codSerieCoche = documento.createElement("codSerieCoche");
            
            Element matriculaCoche = documento.createElement("matriculaCoche");
            Text textMatricula = documento.createTextNode("1111AAA");
            matriculaCoche.appendChild(textMatricula);
            coche.appendChild(matriculaCoche);
            
            Element numPuertasCoche = documento.createElement("numPuertasCoche");
            Element capacidadMaleteroCoche = documento.createElement("capacidadMaleteroCoche");

            
            // Creo la siguiente etiqueta Camiones
            Element camiones = documento.createElement("camiones");
            
            // Creo los elementos de la etiqueta coches
            Element numBastidor = documento.createElement("numBastidor");
            Element colorCamion = documento.createElement("colorCamion");
            Element numAsientosCamion = documento.createElement("numAsientosCamion");
            Element precioCamion = documento.createElement("precioCamion");
            Element pintadoCamion = documento.createElement("pintadoCamion");
            Element codSerieCamion = documento.createElement("codSerieCamion");
            Element matriculaCamion = documento.createElement("matriculaCamion");
            Element cargaCamion = documento.createElement("cargaCamion");
            Element tipoMercanciaCamion = documento.createElement("tipoMercanciaCamion");
            
            // Añado al root el elemento coches
            documento.getDocumentElement().appendChild(series);
            documento.getDocumentElement().appendChild(camiones);
            documento.getDocumentElement().appendChild(coches);
            
            
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