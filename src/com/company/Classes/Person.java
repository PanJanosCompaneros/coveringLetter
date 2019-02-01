package com.company.Classes;

import com.company.Interfaces.IPerson;

import java.util.Scanner;

public class Person implements IPerson {

    private String firstName;
    private String surname;
    private String phoneNumber;
    private String email;

    public Person(boolean hasToBeInitiated){
        this.askForCredentials();
    }
    public Person(){
        this.firstName = "N/A_NAME";
        this.surname = "N/A_SURNAME";
        this.phoneNumber = "N/A_PHONENUMBER";
    }
    public Person(String firstName, String surname, String phoneNumber, String email){
        this.firstName = firstName;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    @Override
    public void askForCredentials() {
        Scanner reader = new Scanner(System.in);
        System.out.println("What's your first name?");
        if(reader.hasNext()) this.firstName = new String(reader.next());
        System.out.println("What's your last name?");
        if(reader.hasNext()) this.surname = new String(reader.next());
        System.out.println("What's your phone number?");
        if(reader.hasNext()) this.phoneNumber = new String(reader.next());
        System.out.println("What's your phone e-mail adress?");
        if(reader.hasNext()) this.email = new String(reader.next());
        reader.close();
    }
    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void  setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setSurname(String surname) {
        this.surname=surname;
    }

    @Override
    public void  setPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;

    }

}
