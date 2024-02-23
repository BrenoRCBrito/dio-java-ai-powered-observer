package org.example.publishers;

import org.example.subscribers.Subscriber;

public interface Publisher
{

	public void subscribe (Subscriber subscriber);

	public void unsubscribe (Subscriber subscriber);

	public void notificate (Integer data);
}
