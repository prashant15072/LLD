package org.example.splitwise;

import org.example.splitwise.entities.User;
import org.example.splitwise.models.Expense;
import org.example.splitwise.models.ExpenseType;

public interface SplitWiseInterface {
    boolean addExpense(Expense expense);
    Expense fetchExpense(User user, ExpenseType expenseType);
    int balanceCalculation(User user);
}
