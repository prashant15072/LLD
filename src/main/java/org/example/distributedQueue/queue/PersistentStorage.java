package org.example.distributedQueue.queue;

import org.example.distributedQueue.models.Message;

public interface PersistentStorage<T, M> {
    boolean persist(T topic, Message<M> message);
    boolean delete(T topic, String id);
}
