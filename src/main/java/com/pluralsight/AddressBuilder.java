package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {

        // names new scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the following information: ");

        // prompts user for full name first
        System.out.println("Full name: ");
        String name = input.nextLine();

        // starts with billing address, then calls addressFormatter method to format
        System.out.println("Let's start with your billing address.");
        String billingAddress = addressFormatter(input);

        // asks if shipping address is the same as billing address
        System.out.println("Let's enter your shipping address. Is it the same as your billing address? Y/N");
        char addressesSame = Character.toLowerCase(input.nextLine().charAt(0));

        // based on that answer, either copies billing address or runs addressFormatter again
        String shippingAddress = "";
        if (addressesSame == 'y') {
            shippingAddress = billingAddress;
        }
        else {
            System.out.println("Let's enter your shipping address.");
            shippingAddress = addressFormatter(input);
        }

        // prints final result with name, billing address, and shipping address
        System.out.printf("""
                Here is your information:
                %s
                
                Billing Address:
                %s
                
                Shipping Address:
                %s""",
                name, billingAddress, shippingAddress);

    }

    public static String addressFormatter(Scanner input) {

        // starts a string builder
        StringBuilder buildingAddress = new StringBuilder();

        // after each prompt, adds the user input to string builder with appropriate spacing and formatting
        System.out.println("Street: ");
        buildingAddress.append(input.nextLine());
        buildingAddress.append("\n");

        System.out.println("City: ");
        buildingAddress.append(input.nextLine());
        buildingAddress.append(", ");

        System.out.println("State: ");
        buildingAddress.append(input.nextLine().toUpperCase());
        buildingAddress.append(" ");

        System.out.println("ZIP: ");
        buildingAddress.append(input.nextLine());

        // returns the formatted address by converting the string builder to a string
        return buildingAddress.toString();
    }

}
