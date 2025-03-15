package org.example.distributedcaching.cache;

public interface CachingStrategy<K,V> {
    void put(K key, V value);
    V get(K key);
    void delete(K key);
}
