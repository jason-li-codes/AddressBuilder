package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the following information: ");

        System.out.println("Full name: ");
        String name = input.nextLine();
        System.out.println("Billing Street: ");
        String billingStreet = input.nextLine();
        System.out.println("Billing City: ");
        String billingCity = input.nextLine();
        System.out.println("Billing State: ");
        String billingState = input.nextLine();
        System.out.println("Billing ZIP: ");
        String billingZIP = input.nextLine();

        StringBuilder billingAddress = new StringBuilder();

        System.out.println("Is your shipping address different from your billing address? Y/N");
        char diffAddresses = Character.toLowerCase(input.nextLine().charAt(0));

        if (diffAddresses == 'y') {
            System.out.println("Shipping Street: ");
            String shippingStreet = input.nextLine();
            System.out.println("Shipping City: ");
            String shippingCity = input.nextLine();
            System.out.println("Shipping State: ");
            String shippingState = input.nextLine();
            System.out.println("Shipping ZIP: ");
            String shippingZIP = input.nextLine();
        }





    }




}
