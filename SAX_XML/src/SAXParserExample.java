import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXParserExample
{
public static void main(String[] args)
{
	SAXParserFactory spf=SAXParserFactory.newInstance();
	try
	{
		SAXParser sp=spf.newSAXParser();
		//BookReader b1=new BookReader();
		sp.parse("books.xml",new BookReader());
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
}
}
