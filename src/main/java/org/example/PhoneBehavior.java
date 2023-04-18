package org.example;

import java.util.List;

public interface PhoneBehavior {
    void addContact(Contact contact);
    Contact getFirstContact();
    Contact getLastContact();
    void sendMessage(Contact contact, String message);
    Message getFirstMessage(Contact contact);
    Message getSecondMessage(Contact contact);
    void call(Contact contact);
    List<Call> viewCallHistory();
    List<Contact> viewContacts();

}

