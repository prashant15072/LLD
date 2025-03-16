package org.example.distributedQueue.queue;

import org.example.distributedQueue.models.Message;
import org.example.distributedQueue.pubsub.QueueObservable;
import org.example.distributedQueue.pubsub.Subscriber;

public class MyQueue<T,M> implements Queue<T,M>{
    private final QueueObservable<T,M> queueObservable;
    private final Storage<T,M> storage;

    public MyQueue(QueueObservable<T,M> queueObservable, Storage<T, M> storage) {
        this.queueObservable = queueObservable;
        this.storage = storage;
    }

    @Override
    public synchronized boolean publishMessage(T topic, Message<M> message) {
        storage.put(topic, message);
        queueObservable.notifySubscribers(topic);
        return true;
    }

    @Override
    public boolean subscribeTopic(T topic, Subscriber<M> subscriber) {
        queueObservable.registerSubscriberOnTopic(topic, subscriber);
        return true;
    }
}
