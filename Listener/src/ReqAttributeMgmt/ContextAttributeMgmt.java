package ReqAttributeMgmt;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ContextAttributeMgmt implements ServletContextAttributeListener
{
	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0)
	{
		System.out.println("context attribute added");

	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0)
	{
		System.out.println("context attribute replaced");

	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0)
	{
		System.out.println("context attribute removed");

	}
}
