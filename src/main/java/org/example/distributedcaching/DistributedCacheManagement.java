package org.example.distributedcaching;

import org.example.distributedcaching.cache.CachingStrategy;
import org.example.distributedcaching.cache.MyCacheImpl;
import org.example.distributedcaching.cache.WriteThroughCache;
import org.example.distributedcaching.db.DatabaseImpl;
import org.example.distributedcaching.distributed.DistributedCache;
import org.example.distributedcaching.eviction.EvictionPolicy;
import org.example.distributedcaching.model.Node;

import java.util.HashMap;
import java.util.List;

public class DistributedCacheManagement<K,V> implements CachingStrategy<K,V> {
    private final HashMap<Node, CachingStrategy<K,V>> caches = new HashMap<>();
    private final DistributedCache distributedCache;

    public DistributedCacheManagement(List<Node> nodes,
                                      int size,
                                      EvictionPolicy<K,V> evictionPolicy,
                                      DistributedCache distributedCache) {
        nodes.forEach(node -> caches.put(node,
                new WriteThroughCache<K, V>(new DatabaseImpl<K, V>(), new MyCacheImpl<K, V>(size, evictionPolicy))));
        this.distributedCache = distributedCache;
    }

    @Override
    public void put(K key, V value) {
        Node node = distributedCache.getNodeFromKey(key.hashCode());
        caches.get(node).put(key, value);
    }

    @Override
    public V get(K key) {
        Node node = distributedCache.getNodeFromKey(key.hashCode());
        return caches.get(node).get(key);
    }

    @Override
    public void delete(K key) {
        Node node = distributedCache.getNodeFromKey(key.hashCode());
        caches.get(node).delete(key);
    }
}
