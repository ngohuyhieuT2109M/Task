package com.company;

public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    void changeCustomerAddress(String address,int age, int id){
        customerAge = age;
        customerAddress = address;
        customerID = id;
    }

    void displayCustomerInformation(){
        System.out.println("Customer Identification Number: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Customer Age: " + customerAge);
    }
}
