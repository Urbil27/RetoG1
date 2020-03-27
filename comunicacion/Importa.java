package comunicacion;


import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import otros.Serie;
import vehiculos.Coche;


public class Importa {
public void importar( ) {
		
		
		try {
			// Creo una instancia de DocumentBuilderFactory
	        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	        // Creo un documentBuilder
	        DocumentBuilder builder;
			builder = factory.newDocumentBuilder();
			Document documento = builder.parse("prueba.xml");
			// Se crean las listas de donde se guardaran los elementos que haya en el xml
			NodeList listaSeries = documento.getElementsByTagName("serie");
			NodeList listaCoches = documento.getElementsByTagName("coche");
			NodeList listaCamiones = documento.getElementsByTagName("camion");
			  
			//Se entra en un bucle donde se recorrerá todo el xml mientras hayan atributos
			for(int c=0; c< listaSeries.getLength(); c++) {
				Node nodo = listaSeries.item(c);
				if(nodo.getNodeType() == Node.ELEMENT_NODE) {
					Element e = (Element) nodo;
					NodeList hijos = e.getChildNodes();
					for(int x=0; x < hijos.getLength(); x++) {
						Node hijo = hijos.item(x);
						if(hijo.getNodeType() == Node.ELEMENT_NODE) {
							Element eHijo = (Element)hijo;
							System.out.println(hijo.getTextContent());
						}
					}
					System.out.println("---------------------------------------");
				}
				
			}
			
			for(int c=0; c< listaCoches.getLength(); c++) {
				Node nodo = listaCoches.item(c);
				if(nodo.getNodeType() == Node.ELEMENT_NODE) {
					Element e = (Element) nodo;
					NodeList hijos = e.getChildNodes();
					for(int x=0; x < hijos.getLength(); x++) {
						Node hijo = hijos.item(x);
						if(hijo.getNodeType() == Node.ELEMENT_NODE) {
							Element eHijo = (Element)hijo;
							System.out.println(hijo.getTextContent());
						}
					}
					System.out.println("---------------------------------------");
				}
				
			}
			
			for(int c=0; c< listaCamiones.getLength(); c++) {
				Node nodo = listaCamiones.item(c);
				if(nodo.getNodeType() == Node.ELEMENT_NODE) {
					Element e = (Element) nodo;
					NodeList hijos = e.getChildNodes();
					for(int x=0; x < hijos.getLength(); x++) {
						Node hijo = hijos.item(x);
						if(hijo.getNodeType() == Node.ELEMENT_NODE) {
							Element eHijo = (Element)hijo;
							System.out.println(hijo.getTextContent());
						}
					}
					System.out.println("---------------------------------------");
				}
				
			}
			  
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     
	}
}