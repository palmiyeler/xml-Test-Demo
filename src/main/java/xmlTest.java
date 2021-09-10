import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;


public class xmlTest {
    public static void main(String[] args) {
        /*
        Document doc = null;
        File file = new File("C:\\Users\\Alperen\\Desktop\\test.xml");
        try{
            SAXBuilder builder = new SAXBuilder();
            doc = builder.build(file);
            XMLOutputter fmt = new XMLOutputter();
            // fmt.output(doc, System.out);            //complete doc outputted

            Element root = doc.getRootElement();
            //System.out.println("Root Element: "+root.getName());

           List allProducts = root.getChildren();
           System.out.println("Products: "+ ((Element)allProducts.get(0)).getName());
            //for (Object allProduct : allProducts) {
            //    System.out.println(((Element) allProduct).getAttribute("id").getValue());
            //}
            List knownChild = root.getChildren();
            System.out.println(((Element)knownChild.get(0)).getName());

        } catch (JDOMException | IOException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            System.out.println("output is IndexOutOfBoundsException");
        }
        */
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = (Document) builder.parse(new File("C:\\Users\\Alperen\\Desktop\\test.xml"));
            Schema schema = null;
            try {
                String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
                SchemaFactory factory = SchemaFactory.newInstance(language);
             //   schema = factory.newSchema(doc);
            } catch (Exception e) {
         //       e.printStackStrace();
            }
            Validator validator = schema.newValidator();
           // validator.validate(new DOMSource(document));




        } catch (ParserConfigurationException | SAXException | IOException e){
            System.out.println("Error occurred.");
        }
    }

}
