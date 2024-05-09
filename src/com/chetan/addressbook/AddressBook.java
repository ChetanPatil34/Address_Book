package com.chetan.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);
   // Contact contact = new Contact();
    ArrayList<Contact>contactList=new ArrayList<>();
    public void addContact(){

        Contact contact = new Contact();
        System.out.println("Enter the First Name :");
        contact.setFirstName(sc.next());
        System.out.println("Enter the Last Name :");
        contact.setLastName(sc.next());
        System.out.println("Enter the Address :");
        sc.nextLine();
        contact.setAddress(sc.nextLine());
        System.out.println("Enter the City :");
        contact.setCity(sc.next());
        System.out.println("Enter the State :");
        contact.setState(sc.next());
        System.out.println("Enter the Zip Code :");
        contact.setZip(sc.next());
        System.out.println("Enter the Phone Number :");
        contact.setPhoneNumber(sc.next());
        System.out.println("Enter the Email ID :");
        contact.setEmail(sc.next());
        contactList.add(contact);
    }
    public void display(){

        if (!contactList.isEmpty()) {

            for(int i = 0; i < contactList.size(); i++) {
                Contact contact = contactList.get(i);
                System.out.println("\n" + contact.toString());
            }
        }
        else {
            System.out.println("Contacts are not available in AddressBook");
        }
        }
        //System.out.println("First Name :"+contact.getFirstName());
       // System.out.println("Last Name :"+contact.getLastName());
       // System.out.println("Address :"+contact.getAddress());
       // System.out.println("City :"+contact.getCity());
        //System.out.println("State :"+contact.getState());
       // System.out.println("Zip Code :"+contact.getZip());
       // System.out.println("Phone Number :"+contact.getPhoneNumber());
       // System.out.println("Email id :"+contact.getEmail());


    public void editContact() {
        System.out.println("Enter the First Number to Edit Contact :");
        String fName = sc.next();

        Contact contact = null;

        boolean flag = false;

        for (int i = 0; i < contactList.size(); i++) {

            contact = contactList.get(i);
            if (fName.equals(contact.getFirstName())) {

                flag = true;

                System.out.println("Contact Found.");

                System.out.println("Enter the Last Name :");
                contact.setLastName(sc.next());
                System.out.println("Enter the Address :");
                contact.setAddress(sc.next());
                System.out.println("Enter the City :");
                contact.setCity(sc.next());
                System.out.println("Enter the State :");
                contact.setState(sc.next());
                System.out.println("Enter the Zip Code :");
                contact.setZip(sc.next());
                System.out.println("Enter the Phone Number :");
                contact.setPhoneNumber(sc.next());
                System.out.println("Enter the Email ID :");
                contact.setEmail(sc.next());
            }
        }
        if (!flag) {
            System.out.println("Contact is Not Found");
        }
    }
    public void deleteContact() {
        System.out.println("Enter the First Name delete the Contact");
        String fName = sc.next();

        boolean flag = false;

        for (int i = 0; i < contactList.size(); i++) {

            Contact contact = contactList.get(i);

            if (fName.equals(contact.getFirstName())) {

                flag = true;
                contactList.remove(contact);
                System.out.println("Contact is Found");
            }
        }
        if (!flag) {
            System.out.println("Contact not Found");

        }
    }
    public static void main(String []args) {

        System.out.println("Wel Come to Address Book Project ");

        AddressBook addressBook = new AddressBook();
        int choice = 0;
           do {
               System.out.println("*********ADDRESS BOOK***********");
               System.out.println("1. ADD CONTACT \n2. EDIT CONTACT \n3. DELETE CONTACT \n4. DISPLAY CONTACT \n5. EXIT");
               System.out.println("Enter the Opration Number :");
               choice = addressBook.sc.nextInt();
               switch (choice) {
                   case 1:
                       addressBook.addContact();
                       break;
                   case 2:
                       addressBook.editContact();
                       break;
                   case 3:
                       addressBook.deleteContact();
                       break;
                   case 4:
                       addressBook.display();
                       break;
               }
           }while (choice<5);





    }
}
