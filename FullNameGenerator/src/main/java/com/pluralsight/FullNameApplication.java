package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get all known values...

        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String firstname = scanner.nextLine().trim();

        System.out.print("Middle name: ");
        String middlename = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastname = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        //compute the unknown
        String fullname = "";

        if(middlename.isBlank()){
            fullname = firstname + " " + lastname;
        }
        else{
            fullname = firstname + " " + middlename + " " + lastname;
            //fullname = String.format("%s %s %s", firstname, middlename, lastname);
        }

        if(!suffix.isBlank()){
            fullname += ", " + suffix;
        }

        System.out.println("Full name: " + fullname);

    }
}