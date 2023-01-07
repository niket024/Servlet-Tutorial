package lifecyclelistener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionLifeCycleListeners implements HttpSessionListener
{
	@Override
	public void sessionCreated(HttpSessionEvent arg0)
	{
		System.out.println("session created");

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0)
	{
		System.out.println("session destroyed");

	}
}
