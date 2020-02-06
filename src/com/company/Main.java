package com.company;

public class Main {

    public static void main(String[] args) {


        double myFistNumber = 20;

        double mySecondNumber = 80;

        double numbersMultiplied = (myFistNumber + mySecondNumber) * 100.00;

        double myRemainder = numbersMultiplied % 40.00;

        boolean isTrue = myRemainder == 0 ? true:false;

        if (isTrue != true) {
            System.out.println("Got some remainder!");
        }

        System.out.println(numbersMultiplied);
        System.out.println(myRemainder);
        System.out.println(isTrue);
    }
}
