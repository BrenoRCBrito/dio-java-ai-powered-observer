package org.example.publishers.impl;

import org.example.publishers.Publisher;
import org.example.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl
		implements Publisher
{
	List<Subscriber> subscribers = new ArrayList<>();

	@Override
	public void subscribe (Subscriber subscriber)
	{
		subscribers.add(subscriber);
	}

	@Override
	public void unsubscribe (Subscriber subscriber)
	{
		subscribers.remove(subscriber);
	}

	@Override
	public void notificate (Integer data)
	{
		subscribers.forEach(sub -> sub.update(data));
	}
}
