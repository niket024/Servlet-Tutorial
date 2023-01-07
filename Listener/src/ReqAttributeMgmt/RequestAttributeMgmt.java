package ReqAttributeMgmt;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class RequestAttributeMgmt implements ServletRequestAttributeListener
{
	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0)
	{
		System.out.println("attribute added");

	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0)
	{
		System.out.println("attribute replaced");

	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0)
	{
		System.out.println("attribute removed");

	}

}
