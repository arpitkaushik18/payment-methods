package org.designpatterns.model;

import org.designpatterns.strategy.PayStrategy;

public class Order {

    private Integer totalCost;

    private boolean isClosed = false;

    public void processOrder(PayStrategy payStrategy){
        payStrategy.collectPaymentDetails();
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
