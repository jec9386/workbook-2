package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservations {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Please enter your last name: ");
        String lastName = scanner.nextLine();



        System.out.print("What date will you be coming (MM/dd/yyyy)?: ");
        String date = scanner.nextLine();// Reads user input (a date as a string)

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");// creates the format rule for the date.

        //date is user input as a string
        //formatter defines expected pattern for the date.- set of rules for expected pattern.
        //LocalDate.parse() uses the formatter to convert the string into object == real date.
        LocalDate visitDate = LocalDate.parse(date, formatter);//visitDate is like a real calender date.
        //what does it mean by object.
        //An object is like a custom, smart container that holds:
        //Data (like numbers, words, or dates)
        //Actions (things you can do with that data, like compare, format, or calculate).


        System.out.print("How many tickets would you like?: ");
        int ticketNumber = scanner.nextInt();


        String ticketText = ticketNumber > 1 ? "tickets": "ticket";


        System.out.printf("%d %s reserved for %s under %s, %s.", ticketNumber, ticketText, visitDate, lastName, firstName);


    }
}
