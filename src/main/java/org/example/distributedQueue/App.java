package org.example.distributedQueue;

import org.example.distributedQueue.pubsub.*;
import org.example.distributedQueue.queue.*;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> topics = List.of("Topic1", "Topic2");
        PersistentStorage<String,String> persistentStorage = new HashMapPersistentStorage<>();
        Storage<String, String> storage = new QueueStorage<>(topics, topics.size(), persistentStorage);
        QueueObservable<String, String> queueObservable = new QueueNotifier<>(topics, topics.size(), storage);
        Queue<String,String> queue = new MyQueue<>(queueObservable, storage);

        PublisherOne<String, String> publisher1 = new PublisherOne<>(queue);
        PublisherOne<String, String> publisher2 = new PublisherOne<>(queue);

        Subscriber<String> subscriber = new SubscriberOne<>();
        queueObservable.registerSubscriberOnTopic("Topic1", subscriber);
        queueObservable.registerSubscriberOnTopic("Topic2", subscriber);

        publisher1.publish("Topic1", "published message on Topic 1", false);
        publisher2.publish("Topic1", "published message on Topic 1", false);

    }
}
