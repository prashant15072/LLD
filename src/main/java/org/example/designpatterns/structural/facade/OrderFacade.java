package org.example.designpatterns.structural.facade;

public class OrderFacade {
    private final PaymentGateway paymentGateway;
    private final Storage storage;
    private final NotificationService notificationService;
    public OrderFacade(PaymentGateway paymentGateway, Storage storage, NotificationService notificationService) {
        this.paymentGateway = paymentGateway;
        this.storage = storage;
        this.notificationService = notificationService;
    }

    public void createOrder(){
        paymentGateway.initPayment();
        storage.save();
    }

    public void makePayment(){
        paymentGateway.makePayment();
        storage.save();
        notificationService.snedNotification();
    }
}
