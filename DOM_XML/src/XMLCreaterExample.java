import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.helpers.ParseConversionEventImpl;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;


public class XMLCreaterExample
{
 public static void main(String[] args)
{
	DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
	Document dom=null;
	try
	{
		DocumentBuilder db=dbf.newDocumentBuilder();
		dom=db.newDocument();
	}
	catch(ParserConfigurationException pce)
	{
		System.out.println("Error while trying to instantiate DocumentBuilder"+pce);
		System.exit(0);
	}
	Element rootEle=dom.createElement("books");
	dom.appendChild(rootEle);
	
	Element p1=dom.createElement("book");
	p1.setAttribute("title", "java");
	p1.setAttribute("author", "ramu");
	p1.setAttribute("subject", "study");
//	Element age=dom.createElement("price");
//	Text ageText=dom.createTextNode("22");
//	age.appendChild(ageText);
//	p1.appendChild(age);
//	Element page=dom.createElement("pages");
//	Text pageText=dom.createTextNode("2244");
//	page.appendChild(pageText);
//	p1.appendChild(page);
	rootEle.appendChild(p1);
	
		 Element p2=dom.createElement("book");
		 p2.setAttribute("title", "j2ee");
		 p2.setAttribute("author", "raj");
			p2.setAttribute("subject", "deep study");
//		 Element age1=dom.createElement("price");
//		 Text ageText1=dom.createTextNode("45");
//		 age1.appendChild(ageText1);
//		 p2.appendChild(age1);
		 rootEle.appendChild(p2);
	try
	{
		OutputFormat format=new OutputFormat(dom);
		format.setIndenting(true);
		XMLSerializer serializer=new XMLSerializer(new FileOutputStream(new File("books.xml")),format);
		serializer.serialize(dom);
	}
	catch(IOException ex)
	{
		ex.printStackTrace();
	}
	System.out.println("done");
}
}
