package org.example;

import org.example.publishers.impl.PublisherImpl;
import org.example.subscribers.impl.SubscriberImpl;

import java.util.List;

public class Main
{
	public static void main (String[] args)
	{
		NotificationCenter center = NotificationCenter.getInstance();
		PublisherImpl publisher = new PublisherImpl();
		SubscriberImpl subscriber1 = new SubscriberImpl("subscriber1");
		SubscriberImpl subscriber2 = new SubscriberImpl("subscriber2");
		SubscriberImpl subscriber3 = new SubscriberImpl("subscriber3");
		SubscriberImpl subscriber4 = new SubscriberImpl("subscriber4");
		SubscriberImpl subscriber5 = new SubscriberImpl("subscriber5");
		List.of(subscriber1, subscriber2, subscriber3, subscriber4, subscriber5).forEach(publisher::subscribe);
		publisher.notificate(2024);
		center.displayNotifications();
		publisher.unsubscribe(subscriber2);
		publisher.unsubscribe(subscriber5);
		publisher.notificate(2024);
		center.displayNotifications();
	}
}
