package org.example.designpatterns.structural.bridge;

public class PaytmPg implements PaymentGateway{
    @Override
    public void processPayment() {
        System.out.println("Payment made using payment gateway!");
    }
}
