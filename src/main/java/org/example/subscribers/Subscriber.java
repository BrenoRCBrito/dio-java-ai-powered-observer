package org.example.subscribers;

import org.example.NotificationCenter;

import java.util.Random;

public interface Subscriber
{
	NotificationCenter center = NotificationCenter.getInstance();
	Random rand = new Random();

	void update (Integer data);
}
