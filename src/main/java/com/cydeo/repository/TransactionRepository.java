package com.cydeo.repository;

import com.cydeo.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {

    public static List<Transaction> transactionList = new ArrayList<>();
    public Transaction save(Transaction transaction){
        transactionList.add(transaction);
        return transaction;
    }

    public List<Transaction> findAll() {
        return transactionList;
    }
}
