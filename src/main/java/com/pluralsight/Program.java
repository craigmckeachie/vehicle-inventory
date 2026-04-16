package com.pluralsight;

import java.util.Scanner;

public class Program {

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        boolean programIsRunning = true;

        while (programIsRunning) {
            System.out.print("""
                    What do you want to do?
                     1 - List all vehicles
                     2 - Search by make/model
                     3 - Search by price range
                     4 - Search by color
                     5 - Add a vehicle
                     6 - Quit
                    Enter your command: """);


            int command = input.nextInt();

            switch (command) {
                case 1 -> listAllVehicles();
                case 2 -> findVehiclesByMakeModel();
                case 3 -> findVehiclesByPriceRange();
                case 4 -> findVehiclesByColor();
                case 5 -> addAVehicle();
                case 6 -> programIsRunning = false;
                default -> System.out.println("Invalid command. Please try again.");
            }
        }

    }

    private static void findVehiclesByMakeModel() {
        System.out.println("findVehiclesByMakeModel");
    }

    private static void findVehiclesByPriceRange() {
        System.out.println("findVehiclesByPriceRange");
    }

    private static void findVehiclesByColor() {
        System.out.println("findVehiclesByColor");
    }

    private static void addAVehicle() {
        System.out.println("addAVehicle");
    }

    private static void listAllVehicles() {
        Vehicle[] vehicles = getVehicles();

        //for loop
//        for (int index = 0; index < vehicles.length; index++) {
//            Vehicle vehicle = vehicles[index];
//            System.out.println(vehicle);
//        }

        int count = 0;
        //new style (for each)
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null) {
                System.out.println(vehicle);
                count++;
            }
        }
        System.out.printf("There are %d vehicles.", count);
        System.out.println();
    }

    private static Vehicle[] getVehicles() {
        Vehicle[] vehicles = new Vehicle[20];
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        vehicles[6] = new Vehicle(101127, "Tesla Model 3", "Silver", 25000, 35000);
        vehicles[7] = new Vehicle(101128, "BMW 3 Series", "Grey", 40000, 28000);
        vehicles[8] = new Vehicle(101129, "Hyundai Elantra", "Blue", 15000, 19500);
        vehicles[9] = new Vehicle(101130, "Mazda CX-5", "Soul Red", 32000, 24000);
        vehicles[10] = new Vehicle(101131, "Volkswagen Golf", "White", 58000, 12000);
        return vehicles;
    }


}
