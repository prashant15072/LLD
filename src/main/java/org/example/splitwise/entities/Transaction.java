package org.example.splitwise.entities;

import lombok.Builder;
import org.example.splitwise.entities.User;

@Builder
public record Transaction (
        String id,
        User fromUser,
        User toUser,
        String transactionNotes,
        int amount
){
}
