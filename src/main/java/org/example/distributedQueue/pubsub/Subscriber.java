package org.example.distributedQueue.pubsub;

import org.example.distributedQueue.models.Message;

public interface Subscriber<M> {
    boolean readMessageFromTopic(Message<M> message);
}
