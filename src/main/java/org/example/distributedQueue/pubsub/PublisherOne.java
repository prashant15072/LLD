package org.example.distributedQueue.pubsub;

import org.example.distributedQueue.models.Message;
import org.example.distributedQueue.queue.Queue;

import java.util.UUID;

public class PublisherOne<T,M> implements Publisher<T,M> {
    private final Queue<T,M> queue;

    public PublisherOne(Queue<T, M> queue) {
        this.queue = queue;
    }

    @Override
    public boolean publish(T topic, M message, boolean shouldPersist) {

        return queue.publishMessage(topic, new Message<M>(UUID.randomUUID().toString(), message));
    }

}
