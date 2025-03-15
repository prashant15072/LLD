package org.example.distributedcaching;

import org.example.distributedcaching.distributed.ConsistentHashing;
import org.example.distributedcaching.eviction.EvictionPolicy;
import org.example.distributedcaching.eviction.LRUEvictionPolicy;
import org.example.distributedcaching.model.Node;

import java.util.List;

public class DistributedCacheApp {

    public static void main(String[] args) {
        List<Node> nodeList = List.of(new Node("k") , new Node("z"));
        EvictionPolicy<String, String> evictionPolicy = new LRUEvictionPolicy<>();
        DistributedCacheManagement<String, String> cache= new DistributedCacheManagement<>(nodeList, 1, evictionPolicy
                , new ConsistentHashing(nodeList));
        cache.put("b" , "lalala");
        cache.put("y" , "lalala");
        cache.put("b" , "Hahaha");

        System.out.println(cache.get("YoYo"));
    }
}
