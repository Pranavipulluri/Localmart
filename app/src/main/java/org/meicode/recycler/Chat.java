package org.meicode.recycler;
public class Chat {
    private String customerName;
    private String lastMessage;
    private String CustomerId;

    public Chat(String customerName, String lastMessage,String CustomerID) {
        this.customerName = customerName;
        this.lastMessage = lastMessage;
        this.CustomerId=CustomerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getLastMessage() {
        return lastMessage;
    }
    public String getCustomerId(){
        return CustomerId;
    }
}