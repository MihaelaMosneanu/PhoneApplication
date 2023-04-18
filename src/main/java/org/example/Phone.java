package org.example;

import java.util.ArrayList;
import java.util.List;

class Phone extends PhoneProperties {


    private List<Contact> contacts = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();
    private List<Call> calls = new ArrayList<>();
    private String callHistory;
    private int remainingBatteryLife;


    public Phone(int batteryLife, String color, String material, String IMEI, String name) {
        super(batteryLife, color, material, IMEI, name);
        this.remainingBatteryLife = batteryLife;

    }

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }


    @Override
    public Contact getFirstContact() {
        try {
            Contact firstContact = contacts.get(0);
            return firstContact;
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("This phone does not have any contacts.");
        }
        return null;
    }

    @Override
    public Contact getLastContact() {
        try {
            Contact lastContact = contacts.get(contacts.size() - 1);
            return lastContact;
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("This phone does not have any contacts.");
        }
        return null;
    }

    @Override
    public void sendMessage(Contact contact, String messageText) {
        if (messageText.length() <= 100) {
            messages.add(new Message(contact, messageText));
            remainingBatteryLife -= 1;
        } else {
            System.out.println("Message too long. Max 100 characters allowed.");
        }
    }

    @Override
    public Message getFirstMessage(Contact contact) {
        try {
            List<Message> messagesFromNumber = new ArrayList<>();
            for (Message message : messages) {
                if (message.getContact().equals(contact)) {
                    messagesFromNumber.add(message);
                }
            }
            return messagesFromNumber.get(0);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Message not found from " + contact);

        }
        return null;

    }


    @Override
    public Message getSecondMessage(Contact contact) {
        try {
            List<Message> messagesFromNumber = new ArrayList<>();
            for (Message message : messages) {
                if (message.getContact().equals(contact)) {
                    messagesFromNumber.add(message);
                }
            }
            return messagesFromNumber.get(1);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("There is not a second message from contact " + contact);
        }
        return null;
    }


    @Override
    public void call(Contact contact) {
        Call call = new Call(contact);
        calls.add(call);
        remainingBatteryLife -= 2;

    }

    @Override
    public List<Call> viewCallHistory() {
        return calls;
    }

    @Override
    public List<Contact> viewContacts() {
        return contacts;
    }

    public int calculateRemainingBatteryLife() {
        return remainingBatteryLife;
    }
}
