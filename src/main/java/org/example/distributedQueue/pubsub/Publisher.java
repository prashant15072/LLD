package org.example.distributedQueue.pubsub;

public interface Publisher<T, M> {
    boolean publish(T topic, M message, boolean shouldPersist);
}
