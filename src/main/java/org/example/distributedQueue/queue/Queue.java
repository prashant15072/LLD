package org.example.distributedQueue.queue;

import org.example.distributedQueue.models.Message;
import org.example.distributedQueue.pubsub.Subscriber;

public interface Queue<T, M> {
    boolean publishMessage(T topic, Message<M> message);
    boolean subscribeTopic(T topic, Subscriber<M> subscriber);

}
