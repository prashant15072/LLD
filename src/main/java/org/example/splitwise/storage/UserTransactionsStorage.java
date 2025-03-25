package org.example.splitwise.storage;

import org.example.splitwise.entities.Transaction;
import org.example.splitwise.entities.User;

public interface UserTransactionsStorage {

    boolean addTransaction(Transaction transaction);

    boolean getUserBalance(User user);
}
