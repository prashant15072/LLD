package org.example.distributedQueue.queue;

import org.example.distributedQueue.models.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapPersistentStorage<T,M> implements PersistentStorage<T,M> {
    HashMap<T, List<Message<M>>> persistentStorage = new HashMap<>();


    @Override
    public synchronized boolean persist(T topic, Message<M> message) {
        if (!persistentStorage.containsKey(topic)){
            persistentStorage.put(topic, new ArrayList<>());
        }

        return persistentStorage.get(topic).add(message);
    }

    @Override
    public synchronized boolean delete(T topic, String id) {
        List<Message<M>> messageList = persistentStorage.get(topic);
        for (int i=0;i<messageList.size();i++){
            if (messageList.get(i).id().equals(id)){
                messageList.remove(i);
                break;
            }
        }
        return true;
    }
}
