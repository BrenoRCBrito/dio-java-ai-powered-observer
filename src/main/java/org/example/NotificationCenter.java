package org.example;

import java.util.ArrayList;
import java.util.List;

public class NotificationCenter
{
	private static NotificationCenter instance;
	private List<Runnable> notifications = new ArrayList<>();

	private NotificationCenter ()
	{
	}

	public static NotificationCenter getInstance ()
	{
		if (instance == null)
		{
			instance = new NotificationCenter();
		}
		return instance;
	}

	public void displayNotifications ()
	{
		List<Thread> threads = new ArrayList<>();
		for (Runnable notification : notifications)
		{
			Thread thread = new Thread(notification);
			threads.add(thread);
			thread.start();
		}

		for (Thread thread : threads)
		{
			try
			{
				thread.join();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

		notifications = new ArrayList<>();
		System.out.println("////////////////////////////////////////////////////////////");
	}

	public List<Runnable> getNotifications ()
	{
		return notifications;
	}

	public void setNotifications (List<Runnable> notifications)
	{
		this.notifications = notifications;
	}
}
