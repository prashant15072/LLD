package org.example.distributedQueue.queue;

import org.example.distributedQueue.models.Message;

public interface Storage<T, M> {
    default boolean put(T topic, Message<M> message){
        return put(topic, message, false);
    }

    boolean put(T topic, Message<M> message, boolean shouldPersist);
    Message<M> getFromTopic(T topic);
}
