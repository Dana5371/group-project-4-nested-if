package com.devxschool.student;

import com.devxschool.test.Validation;

import java.util.Scanner;

public class CoachingWithLoveDaycare {
    public static void main(String[] args) {

        /**
         *
         * Write a java program for Coaching with Love Daycare.
         * Follow acceptance criteria:
         * age should be older than 1.5 but younger than 6 (inclusively)  if(age >= 1.5 || age <= 6)
         * if age is less than 3 years -> class name is Star and fee is 2000 if ( age < 3) print(star 200)
         * if age is less than 6 years -> class name is Sun and fee is 1500 if (age < 6) print (Sum 1500)
         * if they agree with the price -> print child is accepted. if (agree = 'yes') print accapted
         * otherwise child should not have a class and print he/she is not accepted.esle(print not acceppted)
         *
         *
         *
         * 1)example output - positive:
         * Enter child's name
         * Elsa
         * Enter age:
         * 2
         * Daycare fee is 2000
         * Would you like to apply?
         * true
         * Congratulations! Elsa is accepted!
         * Elsa's class is Star
         *
         * 2)example output - negative:
         * Enter child's name
         * Anna
         * Enter age:
         * 3
         * Daycare fee is 1500
         * Would you like to apply?
         * false
         * Anna is not accepted.
         *
         * 3)example output - negative:
         * Enter child's name
         * Christoph
         * Enter age:
         * 1
         * Christoph is not accepted.
         *
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter child's name");
        String name = sc.next();
        System.out.println("Enter age:");
        double age = sc.nextDouble();
        int price = 0;
        String childClass = "Star";
        boolean agreement = false;
        if (age >= 1.5 && age <= 3) {
            price = 2000;
            childClass = "Star";
            System.out.println("Daycare fee is " + price);
            System.out.println("Would you like to apply? ");
            agreement = sc.nextBoolean();
            if (agreement == true) {
                System.out.println("Congratulations!" + name + " is accepted!\n" +
                        name + "'s class is " + childClass);
            } else {
                childClass = null;
                System.out.println(name + " is not accepted");
            }
        } else if (age >= 3 && age <= 6) {
            childClass = "Sun";
            price = 1500;
            System.out.println("Daycare fee is " + price);
            System.out.println("Would you like to apply? ");
            agreement = sc.nextBoolean();

            if (agreement == true) {
                System.out.println("Congratulations!" + name + " is accepted!\n" +
                        name + "'s class is " + childClass);
            } else {
                childClass = null;
                System.out.println(name + " is not accepted");
            }
        } else {
            childClass = null;
            System.out.println("Your child's age is not acceptable!");
        }


        // TODO WRITE YOUR CODE HERE


        //ignore this
        Validation.testDaycare(age, agreement, childClass);

    }
}
