package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //create a StringBuilder object
        StringBuilder address = new StringBuilder();

        //initial intro
        System.out.println("Please provide the following information.");

        //prompt values
        System.out.print("Full name: ");
        String Name = scanner.nextLine();

        System.out.print("Billing Street: ");
        String bStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String bCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String bState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String bZip = scanner.nextLine();

        System.out.print("Shipping Street: ");
        String  sStreet= scanner.nextLine();

        System.out.print("Shipping City: ");
        String sCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String sState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String sZip = scanner.nextLine();

        //append string

        address.append("Address information");
        address.append("\n");
        address.append("-------------------");
        address.append("\n");
        address.append(Name);
        address.append("\n");
        address.append("\n");
        address.append("Billing Address:");
        address.append("\n");
        address.append(bStreet);
        address.append("\n");
        address.append(bCity + ", " + bState + " " + bZip);
        address.append("\n");
        address.append("\n");
        address.append("Shipping Address:");
        address.append("\n");
        address.append(sStreet);
        address.append("\n");
        address.append(sCity + ", " + sState + " " + sZip);

        // retrieve result as string with toString() from string builder
        String infoResult = address.toString();

        //Print result
        System.out.println(infoResult);









    }



}
