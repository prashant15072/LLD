package org.example.splitwise.storage;

import org.example.splitwise.entities.Transaction;
import org.example.splitwise.entities.User;

import java.util.List;
import java.util.Map;

public class MapStorage implements UserTransactionsStorage{
    Map<String, List<Transaction>> transactionHistory;
    Map<String, Map<String, Integer>> userToUserBalance;
    @Override
    public boolean addTransaction(Transaction transaction) {
        return false;
    }

    @Override
    public boolean getUserBalance(User user) {
        return false;
    }
}
