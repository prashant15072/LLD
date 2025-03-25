package org.example.designpatterns.structural.bridge;

public class UpiPayment extends Payment{
    protected UpiPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    void handlePayment() {
        System.out.println("Initiated Payment for upi");
        paymentGateway.processPayment();
    }
}
