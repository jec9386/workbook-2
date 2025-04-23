package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //use vehicle class and create an array that holds vehicle objects.
        Vehicle[] car = new Vehicle[20];

        //preload array with 6 variables
        car[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        car[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        car[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        car[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        car[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        car[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        int numOfCars = 0;
        // better way to iterate through index using for each
        //for (Type variableName(placeholder) : arrayName)
        for (Vehicle i : car) {
            if (i != null) {
                numOfCars++;
            }
        }

//  attempt 1 DRAFT!!!
//        for(int i = 0; i < car.length; i++) {
//            if (car[i] != null) {// check if the object in that index is equal to null
//                numOfCarsInArray++;// if there is something there add 1 to counter(numOfCarsInArray)
//            }
//        }


        //prompt user first
        System.out.print("What do you want to do?\n" +
                "1 - List all vehicles\n" +
                "2 - Search by make/model\n" +
                "3 - Search by price range\n" +
                "4 - Search by color\n" +
                "5 - Add a vehicle\n" +
                "6 - Quit\n" +
                "Enter your command: ");

        //prompt a response from the use
        int selection = scanner.nextInt();
        scanner.nextLine();

        switch (selection) {
            case 1:
                listAllVehicles(car, numOfCars);
                break;

            case 2:
                findVehicleByPrice(car, numOfCars);
                break;

            case 5:
                addAVehicle(car, numOfCars);
                break;

        }


    }

    //create listAllVehicle method for selection 1
    //add parameter to accept car and numOfCars variable.
    //when calling in future. listAllVehicles(car, numOfCars); You're basically saying:“Hey method, here’s the array of cars and the number of cars inside it. Go use them.”
    public static void listAllVehicles(Vehicle[] car, int numOfCars){
        System.out.println("List of all available vehicle.");
        System.out.println("------------------------------");
        for (int i = 0; i < numOfCars; i++) {
            //use getter method to get the information per index(car)
            System.out.printf("Car %d:Vehicle ID: %d, Make/Model: %s, Color: %s, Odometer: %d, Price: $%.2f\n",
                    i + 1,
                    car[i].getVehicleId(),
                    car[i].getMakeModel(),
                    car[i].getColor(),
                    car[i].getOdometerReading(),
                    car[i].getPrice());
        }
    }
    public static void findVehicleByPrice(Vehicle [] car, int numOfCars){
        System.out.print("What make/model are you looking for?: ");
        String makeModel = scanner.nextLine();
        for (int i = 0; i < numOfCars; i++) {
            if (car[i].getMakeModel().equalsIgnoreCase(makeModel)) {
                System.out.printf("Car %d-\nVehicle ID: %d\nMake/Model: %s\nColor: %s/nOdometer: %d\nPrice: $%.2f\n",
                        i + 1,
                        car[i].getVehicleId(),
                        car[i].getMakeModel(),
                        car[i].getColor(),
                        car[i].getOdometerReading(),
                        car[i].getPrice());
            }

        }


    }

    public static int addAVehicle(Vehicle [] car, int numOfCars){
        // Prompt user for each piece of vehicle data
        System.out.print("Enter Vehicle ID: ");
        int vehicleId = scanner.nextInt();  // Expecting an integer for Vehicle ID

        scanner.nextLine();  // Consume newline left by nextInt()

        System.out.print("Enter Make/Model: ");
        String makeModel = scanner.nextLine();  // Expecting a string for make/model

        System.out.print("Enter Color: ");
        String color = scanner.nextLine();  // Expecting a string for color

        System.out.print("Enter Odometer Reading: ");
        int odometerReading = scanner.nextInt();  // Expecting an integer for odometer reading

        System.out.print("Enter Price: ");
        float price = scanner.nextFloat();  // Expecting a double for price

        // Create the new vehicle using the input data
        Vehicle myCar = new Vehicle(vehicleId, makeModel, color, odometerReading, price);

        // Add vehicle to array (this part depends on how your array and logic are set up)
        car[numOfCars] = myCar;



        // Display the added vehicle
        System.out.println("Your car has been added:");
        System.out.println("#: " + numOfCars);
        System.out.println("Vehicle ID: " + myCar.getVehicleId());
        System.out.println("Make/Model: " + myCar.getMakeModel());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Odometer Reading: " + myCar.getOdometerReading());
        System.out.println("Price: $" + myCar.getPrice());

        return numOfCars + 1;
    }


//        System.out.print("Add a vehicle(vehicleId,makeModel,color,odometerReading,price): ");
//        String newCar = scanner.nextLine();
//        Vehicle myCar = new Vehicle(newCar);
//        System.out.println("Your car is: " + );
//        System.out.println("Vehicle ID: " + myCar.getVehicleId());
//        System.out.println("Make/Model: " + myCar.getMakeModel());
//        System.out.println("Color: " + myCar.getColor());
//        System.out.println("Odometer Reading: " + myCar.getOdometerReading());
//        System.out.println("Price: $" + myCar.getPrice());

    }





//ATTEMPT 1 DRAFT!!!!
//code I was writing until I found a better method in the textbook pg 95 workbook 2
//        //loop for prompt
//        int selection;
//        do{
//            //prompt user for input
//            System.out.print("Enter your command: ");
//            //get input from user
//            selection = scanner.nextDouble();
//            //print what the user selected
//            System.out.printf("You chose #: %d", selection);
//            //if user chooses 6 print-
//            System.out.println("Thank you see you soon!");
//            if (selection == 1) {
//                System.out.println("List of all available vehicle.");
//                System.out.println("------------------------------");
//                for (int i = 0; i < numOfCars; i++) {
//                    System.out.printf(car[i]);
//                }
//            }
//            else if (selection == 2){
//                System.out.println("What make/model are you looking for?: ");
//                String makeModel = scanner.nextLine();
//                for (int i = 0; i < numOfCars; i++) {
//                    if(car[i].getMakeModel().equals(makeModel)){
//                        System.out.printf("");
//                    };
//                }
//            }
//
//        } while (selection != 6);
//
//
//
//        //process user input
//
//        //create a for loop to go through the array
//        //for(int i = 0; i < numOfCars; i++ ){
//
//            if (selection == 1){
//                System.out.println(car[i]);
//            }
//            else if(selection == 2){
//                System.out.print("What make/model are you looking for: ");
//                String makeModel = scanner.nextLine();
//                if makeModel
//            }
//
//    }
//}
