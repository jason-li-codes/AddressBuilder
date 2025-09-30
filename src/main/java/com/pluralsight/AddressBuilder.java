package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the following information: ");

        System.out.println("Full name: ");
        String name = input.nextLine();

        System.out.println("Let's start with your billing address.");
        String billingAddress = addressFormatter(input);

        System.out.println("Let's enter your shipping address. Is it the same as your billing address? Y/N");
        char addressesSame = Character.toLowerCase(input.nextLine().charAt(0));

        String shippingAddress = "";
        if (addressesSame == 'y') {
            shippingAddress = billingAddress;
        }
        else {
            shippingAddress = addressFormatter(input);
        }

        System.out.printf("""
                %s
                
                %s
                
                %s""",
                name, billingAddress, shippingAddress);

    }

    public static String addressFormatter(Scanner input) {

        StringBuilder buildingAddress = new StringBuilder();

        buildingAddress.append(input.nextLine());
        buildingAddress.append("\n \n Address: \n");

        System.out.println("Billing Street: ");
        buildingAddress.append(input.nextLine());
        buildingAddress.append("\n");

        System.out.println("Billing City: ");
        buildingAddress.append(input.nextLine());
        buildingAddress.append(", ");

        System.out.println("Billing State: ");
        buildingAddress.append(input.nextLine());
        buildingAddress.append(" ");

        System.out.println("Billing ZIP: ");
        buildingAddress.append(input.nextLine());

        System.out.println(buildingAddress.toString());



        return address;
    }



}
