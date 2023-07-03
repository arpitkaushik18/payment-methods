package org.designpatterns.strategy;

public interface PayStrategy {

    boolean payAmount(Integer payment);

    void collectPaymentDetails();
}
