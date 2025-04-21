package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void  main(String[] args){
        CellPhone myPhone = new CellPhone();
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the serial number?: ");
        String number = scanner.nextLine();
        scanner.nextLine();
        myPhone.setSerialNumber(number);

        System.out.print("What model is the phone?: ");
        String model = scanner.nextLine();
        myPhone.setModel(model);

        System.out.print("Who is the carrier?: ");
        String carrier = scanner.nextLine();
        myPhone.setCarrier(carrier);

        System.out.print("What is the phone number?: ");
        String phoneNumber = scanner.nextLine();
        myPhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone?: ");
        String owner = scanner.nextLine();
        myPhone.setOwner(owner);

        // Display the phone details using getters
        System.out.println("\nPhone Information:");
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());
    }

}
