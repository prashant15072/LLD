package org.example.distributedcaching.model;

import lombok.Builder;

@Builder
public record Node(
        String name
) {
}
