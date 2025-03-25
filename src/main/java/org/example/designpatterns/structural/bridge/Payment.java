package org.example.designpatterns.structural.bridge;

public abstract class Payment {
    final PaymentGateway paymentGateway;

    protected Payment(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    abstract void handlePayment();
}
