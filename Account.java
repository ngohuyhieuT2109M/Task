package com.company;

public class Account {
    private static int accountID;
    private String holderName;
    private static String accountType;


    {
        accountID = 100;
        holderName = "John Anderson";
        accountType = "Savings";
    }

    public static void displayAccountDetails() {
        System.out.println("Account Details");
        System.out.println("================");
        System.out.println("Account ID:"+ accountID + "\nAccount Type:" + accountType);
    }
}
