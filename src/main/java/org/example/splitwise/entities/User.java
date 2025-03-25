package org.example.splitwise.entities;

import lombok.Builder;

@Builder
public record User (
        String id,
        String name
){
}
