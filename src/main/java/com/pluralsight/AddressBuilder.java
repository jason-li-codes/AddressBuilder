package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StringBuilder billingAddress = new StringBuilder();

        System.out.println("Please provide the following information: ");

        System.out.println("Full name: ");
        billingAddress.append(input.nextLine());
        billingAddress.append("\n \nBuilding Address: \n");

        System.out.println("Billing Street: ");
        billingAddress.append(input.nextLine());
        billingAddress.append("\n");

        System.out.println("Billing City: ");
        billingAddress.append(input.nextLine());
        billingAddress.append(", ");

        System.out.println("Billing State: ");
        billingAddress.append(input.nextLine());
        billingAddress.append(" ");

        System.out.println("Billing ZIP: ");
        billingAddress.append(input.nextLine());

        System.out.println(billingAddress.toString());

        StringBuilder shippingAddress = new StringBuilder();

        System.out.println("Is your shipping address different from your billing address? Y/N");
        char diffAddresses = Character.toLowerCase(input.nextLine().charAt(0));

        if (diffAddresses == 'y') {

            System.out.println("Shipping Street: ");
            shippingAddress.append("Shipping Address: \n");
            shippingAddress.append(input.nextLine());
            shippingAddress.append("\n");

            System.out.println("Shipping City: ");
            shippingAddress.append(input.nextLine());

            System.out.println("Shipping State: ");
            String shippingState = input.nextLine();

            System.out.println("Shipping ZIP: ");
            String shippingZIP = input.nextLine();
        }
        else {
            shippingAddress.append(billingAddress);
        }




    }




}
