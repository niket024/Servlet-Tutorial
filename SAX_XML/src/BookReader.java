import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookReader extends DefaultHandler
{
	private Book book = null;
	private String content = null;

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException
	{
		if (qName.equals("book"))
		{
			book = new Book();
			String id = attributes.getValue("id");
			book.setId(Integer.parseInt(id));
		}
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException
	{
		content = new String(ch, start, length);
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException
	{
		if (qName.equals("book"))
		{
			System.out.println(book.toString());
		} else if (qName.equals("title"))
		{
			book.setTitle(content);
		} else if (qName.equals("author"))
		{

			book.setAuthor(content);
		}

	}
}
