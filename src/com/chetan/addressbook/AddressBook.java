package com.chetan.addressbook;

import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);
    Contact contact = new Contact();

    public void addContact(){

        System.out.println("Enter the First Name :");
        contact.setFirstName(sc.next());
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
    public void display(){

        System.out.println("First Name :"+contact.getFirstName());
        System.out.println("Last Name :"+contact.getLastName());
        System.out.println("Address :"+contact.getAddress());
        System.out.println("City :"+contact.getCity());
        System.out.println("State :"+contact.getState());
        System.out.println("Zip Code :"+contact.getZip());
        System.out.println("Phone Number :"+contact.getPhoneNumber());
        System.out.println("Email id :"+contact.getEmail());

    }
    public void editContact(){
        System.out.println("Enter the First Number to Edit Contact :");
        String fName = sc.next();
        if(fName.equals(contact.getFirstName())){
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
        else {
            System.out.println("Given Name of Contact is Not Found.");
        }
    }
    public static void main(String []args)
    {

        System.out.println("Wel Come to Address Book Project ");

        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.display();
        addressBook.editContact();
        addressBook.display();
    }
}
