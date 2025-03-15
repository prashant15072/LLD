package org.example.distributedcaching.db;

public interface Database<K,V> {
    void put(K key, V value);
    V get(K key);
    void delete(K key);
}
