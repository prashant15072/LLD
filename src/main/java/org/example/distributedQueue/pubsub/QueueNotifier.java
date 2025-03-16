package org.example.distributedQueue.pubsub;

import org.example.distributedQueue.exceptions.InvalidTopicException;
import org.example.distributedQueue.models.Message;
import org.example.distributedQueue.queue.Queue;
import org.example.distributedQueue.queue.Storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QueueNotifier<T,M> implements QueueObservable<T,M>{
    private final HashMap<T, List<Subscriber<M>>> subscriberList = new HashMap<>();
    private final Storage<T,M> storage;

    public QueueNotifier(List<T> topics, int queueSize, Storage<T, M> storage) {
        this.storage = storage;
        for(int i=0;i<queueSize; i++){
            subscriberList.put(topics.get(i), new ArrayList<>());
        }
    }

    @Override
    public void registerSubscriberOnTopic(T topic, Subscriber<M> subscriber) {
        if (!subscriberList.containsKey(topic)){
            throw new InvalidTopicException();
        }
        subscriberList.get(topic).add(subscriber);
    }

    @Override
    public void deleteSubscriberFromTopic(T topic, Subscriber<M> subscriber) {
        //TODO
    }

    @Override
    public void notifySubscribers(T topic) {
        List<Subscriber<M>> subscribers = subscriberList.get(topic);
        Message<M> message = storage.getFromTopic(topic);
        for (int i=0;i<subscribers.size();i++){
            subscribers.get(i).readMessageFromTopic(message);
        }
    }
}
