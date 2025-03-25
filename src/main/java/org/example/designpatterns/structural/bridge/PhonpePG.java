package org.example.designpatterns.structural.bridge;

public class PhonpePG implements PaymentGateway{
    @Override
    public void processPayment() {
        System.out.println("Transaction got completed using phonepePG!");
    }
}
