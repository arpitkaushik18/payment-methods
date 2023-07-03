package org.designpatterns.model;

public class CreditCard {

    private String cardNumber;
    private Integer amount = 100_000;

    private String cvvNumber;

    private String expiryDate;

    public CreditCard(String cardNumber, String cvvNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvvNumber = cvvNumber;
        this.expiryDate = expiryDate;
    }
}
