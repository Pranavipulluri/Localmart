package org.meicode.recycler;

public class Chat {
    private String customerName;
    private String lastMessage;
    private String customerId; // Changed to camelCase

    public Chat(String customerName, String lastMessage, String customerId) { // Changed parameter name to match variable
        this.customerName = customerName;
        this.lastMessage = lastMessage;
        this.customerId = customerId; // Fixed this assignment
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public String getCustomerId() {
        return customerId; // Ensured method name is correct
    }
}
