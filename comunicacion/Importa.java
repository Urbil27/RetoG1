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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
 

public class Importa {
	/*
	public static void importar() {
		try {
			File archivo = new File("prueba.xml");
			DocumentBuilderFactory = new DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = factory.newDocumentBuilder();
			Document document = documentBuilder.parse(archivo);
			
			document.getDocumentElement().normalize();
			
			System.out.println("Elemento raiz: "+document.getDocumentElement().getNodeName());
			
			NodeList listaPrueba = document.getElementsByTagName("prueba");
			
			for(int i = 0; i< listaPrueba.getLength();i++) {
				Node nodo = listaPrueba.item(i);
				//System.out.println("Elemento: "+nodo.getNodoName());
				
				if(nodo.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) nodo;
					System.out.println("ID: "+element.getElementsByTagName("ID").item(0).getTextContent());
					System.out.println("Name: "+element.getElementsByTagName("Name").item(0).getTextContent());
					System.out.println("TLF: "+element.getElementsByTagName("TLF").item(0).getTextContent());
					System.out.println("");
				}
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
*/
}
