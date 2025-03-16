package org.example.distributedQueue.models;

import lombok.Builder;

@Builder
public record Message<M> (
        String id,
        M data
){
}
