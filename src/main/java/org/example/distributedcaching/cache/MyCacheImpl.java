package org.example.distributedcaching.cache;

import org.example.distributedcaching.eviction.EvictionPolicy;

import java.util.HashMap;

public class MyCacheImpl<K,V> implements Cache<K,V>{
    private final EvictionPolicy<K,V> evictionPolicy;
    private final HashMap<K,V> realCache;
    private final Integer size;

    public MyCacheImpl(int size, EvictionPolicy<K,V> evictionPolicy) {
        this.evictionPolicy = evictionPolicy;
        this.size = size;
        this.realCache = new HashMap<>();
    }

    @Override
    public synchronized void put(K key, V value) {
        if (realCache.size() >= size){
            evictionPolicy.evict(this);
        }
        realCache.put(key,value);
        evictionPolicy.notifyAccess(key);
    }

    @Override
    public V get(K key) {
        evictionPolicy.notifyAccess(key);
        return realCache.getOrDefault(key, null);
    }

    @Override
    public synchronized void delete(K key) {
        realCache.computeIfPresent(key, (k, v) -> null);
    }
}
