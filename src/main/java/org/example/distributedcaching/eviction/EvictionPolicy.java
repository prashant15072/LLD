package org.example.distributedcaching.eviction;

import org.example.distributedcaching.cache.Cache;

public interface EvictionPolicy<K, V> {
    void evict(Cache<K,V> cache);
    void notifyAccess(K key);
}
