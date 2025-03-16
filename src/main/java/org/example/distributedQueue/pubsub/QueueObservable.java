package org.example.distributedQueue.pubsub;

import org.example.distributedQueue.models.Message;

public interface QueueObservable<T,M> {
    void registerSubscriberOnTopic(T topic, Subscriber<M> subscriber);
    void deleteSubscriberFromTopic(T topic, Subscriber<M> subscriber);
    void notifySubscribers(T topic);
}
