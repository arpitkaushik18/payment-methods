package org.designpatterns.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayWithPaytm implements PayStrategy {

    private boolean isSigned;
    private String email;
    private String passWord;

    private static final Map<String, String> DATA_BASE = new HashMap<>();

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static {
        DATA_BASE.put("okok", "akok@gmail.com");
    }

    public boolean payAmount(Integer payment) {
        if(isSigned){
            System.out.println("Paying amount " + payment + "using paytm");
            return true;
        }else{
            System.out.println("Please first signed in paytm");
            return false;
        }
    }

    public void collectPaymentDetails() {

        try {
            while (!isSigned){
                System.out.print("Enter the user's email: ");
                email = reader.readLine();
                System.out.print("Enter the user's password: ");
                passWord = reader.readLine();
                if (verify()) {
                    System.out.println("Data verification has been successful.");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(passWord)));
        return isSigned;
    }

    private void setSignedIn(boolean signedIn) {
        this.isSigned = signedIn;
    }

}
