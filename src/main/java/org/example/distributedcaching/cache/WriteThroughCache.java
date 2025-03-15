package org.example.distributedcaching.cache;

import org.example.distributedcaching.db.Database;
import org.example.distributedcaching.exception.NotFoundException;

import java.util.Objects;
import java.util.Optional;

public class WriteThroughCache<K,V> implements CachingStrategy<K,V>{

    private final Database<K,V> database;
    private final Cache<K,V> cache;

    public WriteThroughCache(Database<K,V> database, Cache<K, V> cache) {
        super();
        this.database = database;
        this.cache = cache;
    }
    public synchronized void put(K key, V value){
        database.put(key, value);
        cache.put(key, value);
    }

    public V get(K key){
        V cacheValue = cache.get(key);
        if (Objects.isNull(cacheValue)){
            return Optional.ofNullable(database.get(key))
                    .map(val -> {
                        cache.put(key, val);
                        return val;
                    })
                    .orElseThrow(NotFoundException::new);
        }
        return cacheValue;
    }

    public void delete(K key){
        cache.delete(key);
    }
}
