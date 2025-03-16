package org.example.distributedQueue.pubsub;

public interface TopicObserver<M> {
    void update(M message);
}
