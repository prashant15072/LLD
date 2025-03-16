package org.example.distributedQueue.pubsub;

import org.example.distributedQueue.models.Message;

public class SubscriberOne<M> implements Subscriber<M> {
    @Override
    public boolean readMessageFromTopic(Message<M> message) {
        System.out.println(STR."Read the message\{message.data()}");
        return true;
    }
}
