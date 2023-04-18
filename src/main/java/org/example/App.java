package org.example;
import java.util.*;


public class App {


    public static void main(String[] args) {

        Contact contact1 = new Contact("1", "1234567", "John", "Doe");
        Contact contact2 = new Contact("2", "7654321", "Joe", "Donald");


        Phone phone = new SamsungGalaxyS6();
        Phone phone1 = new SamsungGalaxyS7();
        Phone phone2 = new iPhone6S();
        Phone phone3 = new iPhone7();



        phone.addContact(contact1);

        phone.addContact(contact2);



        Contact c1 = phone.getFirstContact();
        System.out.println("First contact : " + c1);

        Contact c2 = phone.getLastContact();
        System.out.println("Last contact: " + c2);

        phone.sendMessage(contact1, "Mesajele text, sau trimiterea de mesaje text, reprezintă actul de compunere și trimitere de mesaje electronice, care constau de obicei din caractere alfabetice și numerice, între doi sau mai mulți utilizatori de dispozitive mobile, desktop-uri/laptop-uri sau alt tip de computer compatibil.");
        System.out.println("Message sent to"  +" " + contact1.getFirstName());

        phone.sendMessage(contact1, "Mesaje alfabetice și numerice,");
        System.out.println("Message sent to"  +" " + contact1.getFirstName());

        Message m1 = phone.getFirstMessage(contact1);
        System.out.println("First message from contact " + contact1 + " is " + m1.getMessage());

        //There is no second message so i will receive an IndexOutOfBoundsException so it will be printed what we have on the catch block.
        phone.getSecondMessage(contact2);
      //  System.out.println("Second message from contact " + contact2 + " is " + m2.getMessage());

        phone.call(contact2);
        System.out.println("Called " + contact2.getFirstName());

        phone.call(contact1);
        System.out.println("Called " + contact1.getFirstName());

        List<Call> callList = phone.viewCallHistory();
        System.out.println("This is the call history for " +  phone.getName() + ":" + callList);


        int remainingBattery = phone.calculateRemainingBatteryLife();
        System.out.println("Remaining battery for phone " + phone.getName() + " is " + remainingBattery);


        List<Contact> contacts = phone.viewContacts();
        System.out.println("Contacts from phone " + phone.getName() + " : " +  phone.viewContacts());


        phone1.getFirstContact();

        phone2.addContact(contact1);
        phone2.getLastContact();
        System.out.println(phone2.getLastContact());

        phone3.getFirstMessage(contact1);
        System.out.println();
        }

    }
