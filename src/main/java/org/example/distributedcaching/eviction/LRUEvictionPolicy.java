package org.example.distributedcaching.eviction;

import org.example.distributedcaching.cache.Cache;

import java.util.LinkedHashSet;

public class LRUEvictionPolicy<K,V> implements EvictionPolicy<K,V>{
    LinkedHashSet<K> set = new LinkedHashSet<>();
    @Override
    public void evict(Cache<K,V> cache) {
        if(!set.isEmpty()){
            K key = set.removeFirst();
            cache.delete(key);
        }
    }
    @Override
    public void notifyAccess(K key) {
        set.addLast(key);
    }
}
