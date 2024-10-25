package org.meicode.recycler;

public class Message {
    private String text;
    private boolean isSentByUser;

    public Message(String text, String isSentByUser) {
        this.text = text;
        this.isSentByUser = Boolean.parseBoolean(isSentByUser);
    }

    public String getText() {
        return text;
    }

    public boolean isSentByUser() {
        return isSentByUser;
    }
}
