package archivos_ad17;

import archivos_ad13.Product;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author dam2
 */
public class Archivos_AD17 {

    public static void main(String[] args) throws IOException, XMLStreamException {
     
        //Para escribir el xml damos el archivo escribir de arriba
        XMLInputFactory imput = XMLInputFactory.newInstance();
        XMLStreamReader leer = imput.createXMLStreamReader(new FileReader("/home/oracle/Desktop/Archivos/products.xml"));
        
        Product obj = new Product();
        ArrayList<String> listaProduct = new ArrayList<>();
        
        while (leer.hasNext()) {
           leer.next();

           if (leer.getEventType() == XMLStreamReader.CHARACTERS) { //Cogemos lo que hay dentro de las etiquetas
             listaProduct.add(leer.getText());
           }   
           }
            for(int x=0;x<listaProduct.size();x++) {
      System.out.println(listaProduct.get(x));
    }
    }
}
    
