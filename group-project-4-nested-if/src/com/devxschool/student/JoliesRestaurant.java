package com.devxschool.student;

import com.devxschool.test.Validation;

import java.util.Scanner;

public class JoliesRestaurant {
    public static void main(String[] args) {
        /**
         *
         * Write a check to a customer based on their input
         * - how many people?
         * - what is the total amount?
         *      * automatically add 10% tax fee
         * - provide check together or split?
         *      * split - divide amount per person
         *      * together - one total amount for all
         * - how was the restaurant's service?
         *      * bad - 10%
         *      * ok - 15%
         *      * good - 20%
         *      * perfect - 25%
         *
         *
         * example output:
         * out: Welcome to Jolie's Restaurant!!!
         * out: Enter number of guests:
         *  in: 5
         * out: Enter a restaurant bill amount:
         *  in: 200
         * out: Is your check split?
         *  in: true
         * out: How was the restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%)
         *  in: perfect
         * out: Number of guests: 5
         * out: Total amount: $275.0
         * out: Total per guest: $55.0
         */


        int numberOfGuests = 0;
        double billAmount = 0;
        double taxFee = 0;
        boolean isSplit = false;
        String serviceQuality = "";
        double totalAmount = 0;
        double totalAmountPerGuest = 0;


        //TODO write your code here
        Scanner scanner = new Scanner(System.in);
        numberOfGuests = scanner.nextInt();
        billAmount = scanner.nextDouble();
        isSplit = scanner.nextBoolean();
        serviceQuality = scanner.next();

        totalAmount +=( billAmount * 0.1) + billAmount;

        if (serviceQuality.equalsIgnoreCase("bad")) {
            totalAmount += totalAmount * 0.1;
        } else if (serviceQuality.equalsIgnoreCase("ok")) {
            totalAmount += totalAmount * 0.15;
        } else if (serviceQuality.equalsIgnoreCase("good")) {
            totalAmount += totalAmount * 0.2;
        }else if (serviceQuality.equalsIgnoreCase("perfect")){
            totalAmount += totalAmount *0.25;
        }

        if (isSplit){
            totalAmountPerGuest = totalAmount / numberOfGuests;
            System.out.print("Number of guests:" + numberOfGuests + "\n" +
                    "Total amount: $" + totalAmount + "\n" +
                    "Total per guest: $" + totalAmountPerGuest);
        }else{
            System.out.print("Number of guests:" + numberOfGuests + "\n" + "Total amount: $" + totalAmount + "\n");
        }


        // ignore this
        Validation.testBill(numberOfGuests, billAmount, isSplit, serviceQuality, totalAmount, totalAmountPerGuest);

    }
}
