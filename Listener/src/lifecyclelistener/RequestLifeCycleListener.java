package lifecyclelistener;

import java.io.PrintWriter;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestLifeCycleListener implements ServletRequestListener
{
	int count=0;
	@Override
	public void requestInitialized(ServletRequestEvent arg0)
	{
		count++;

		System.out.println("requestInitialized......");

	}

	@Override
	public void requestDestroyed(ServletRequestEvent arg0)
	{
		System.out.println("requestDestroyed");

	}
	// here run the hello.html
}
