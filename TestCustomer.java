package com.company;

public class TestCustomer {
    public static void main(String[] args) {

        Customer objCustomer = new Customer();

        objCustomer.customerID = 100;
        objCustomer.customerName = "Jack";
        objCustomer.customerAddress = "123 Stress";
        objCustomer.customerAge = 30;

        objCustomer.displayCustomerInformation ();
        objCustomer.changeCustomerAddress ("123 Fort, Main Street", 35, 1000);
        objCustomer.displayCustomerInformation ();

    }
}
