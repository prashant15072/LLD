package org.example.distributedQueue.queue;

import org.example.distributedQueue.exceptions.InvalidTopicException;
import org.example.distributedQueue.models.Message;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class QueueStorage<T,M> implements Storage<T,M>{
    private final HashMap<T, LinkedList<Message<M>>> queue= new HashMap<>();
    private final PersistentStorage<T,M> persistentStorage;
    public QueueStorage(List<T> topics, int queueSize, PersistentStorage<T, M> persistentStorage) {
        this.persistentStorage = persistentStorage;
        for (int i=0;i<queueSize;i++){
            queue.put(topics.get(i), new LinkedList<>());
        }
    }


    @Override
    public synchronized boolean put(T topic, Message<M> message, boolean shouldPersist) {
        if (!queue.containsKey(topic)){
            throw new InvalidTopicException();
        }

        if(shouldPersist){
            persistentStorage.persist(topic, message);
        }

        return queue.get(topic).add(message);
    }

    @Override
    public synchronized Message<M> getFromTopic(T topic) {
        if (!queue.containsKey(topic)){
            throw new InvalidTopicException();
        }
        return queue.get(topic).poll();
    }
}
