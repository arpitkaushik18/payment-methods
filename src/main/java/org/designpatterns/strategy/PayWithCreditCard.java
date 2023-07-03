package org.designpatterns.strategy;

import org.designpatterns.model.CreditCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayWithCreditCard implements PayStrategy{
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private CreditCard card;
    public boolean payAmount(Integer payment) {
        if (cardIsPresent()){
            System.out.println("Payment is completed with credit card");
            return true;
        }else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }

    public void collectPaymentDetails() {

        try {
            System.out.print("Enter the card number: ");
            String number = reader.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = reader.readLine();
            System.out.print("Enter the CVV code: ");
            String cvv = reader.readLine();
            card = new CreditCard(number, cvv, date);

            // Validate credit card number...

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
