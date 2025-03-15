package org.example.distributedcaching.distributed;

import org.example.distributedcaching.exception.InternalServerError;
import org.example.distributedcaching.model.Node;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class ConsistentHashing implements DistributedCache{
    TreeMap<Integer, Node> nodes = new TreeMap<>();

    public ConsistentHashing(List<Node> nodeList) {
        nodeList.forEach(node -> nodes.put(node.hashCode(), node));
    }

    @Override
    public Node getNodeFromKey(int hash) {
        if (nodes.isEmpty()){
            throw new InternalServerError("No node found!");
        }

        SortedMap<Integer, Node> tailMap = nodes.tailMap(hash);
        return tailMap.isEmpty() ? nodes.firstEntry().getValue() :
                tailMap.firstEntry().getValue();
    }
}
