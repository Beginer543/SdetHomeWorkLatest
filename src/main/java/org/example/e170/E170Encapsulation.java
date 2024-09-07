package org.example.e170;

class Customer {
    private String customerName;
    private int customerAge;
    private String customerEmail;
    private String phoneNumber;


    public String getCustomerName() {
        return customerName;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public int getCustomerAge() {
        return customerAge;
    }


    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }


    public String getCustomerEmail() {
        return customerEmail;
    }

    // Сеттер для email
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class E170Encapsulation {
    public static void main(String[] args) {

        Customer customer = new Customer();


        customer.setCustomerName("Mario");
        customer.setCustomerAge(32);


        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Age: " + customer.getCustomerAge());


    }
}
