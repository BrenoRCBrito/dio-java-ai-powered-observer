package org.example.subscribers.impl;

import org.example.subscribers.Subscriber;

public class SubscriberImpl
		implements Subscriber
{
	private String name;

	public SubscriberImpl (String name)
	{
		this.name = name;
	}

	@Override
	public void update (Integer data)
	{
		center.getNotifications().add(() -> {
			try
			{
				int randomMillis = (rand.nextInt(5) + 1) * 1000;
				Thread.sleep(randomMillis);
				System.out.println(name + ": " + "Year is " + data + "; Notification after " + randomMillis);
			}
			catch (InterruptedException e)
			{
				throw new RuntimeException(e);
			}
		});
	}
}
