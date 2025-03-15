package org.example.distributedcaching.distributed;

import org.example.distributedcaching.model.Node;

public interface DistributedCache {
    Node getNodeFromKey(int hash);
}
