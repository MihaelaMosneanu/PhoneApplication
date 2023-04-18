package org.example;

public class Message {
    private Contact contact;
    private String message;

    public Message(Contact contact, String message){
        this.contact= contact;
        this.message = message;
    }

    public Contact getContact() {
        return contact;
    }

    public void setNumber(Contact contact) {
        this.contact = contact;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "contact='" + contact.getFirstName() + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

