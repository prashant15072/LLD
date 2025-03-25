package org.example.splitwise.models;

import lombok.Builder;
import org.example.splitwise.entities.User;

import java.util.HashMap;


@Builder
public record Expense (
        ExpenseType expenseType,
        User paidBy,
        HashMap<User, Integer> participants,
        String comment

){

}
