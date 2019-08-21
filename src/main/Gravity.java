package main;
/*
@ Author : Sahas Bansal
@ Version : 12.0.2
 */

import java.util.Scanner;

public class Gravity {
    public static void main(String[] args) {
        double g = 9.8;

        Scanner myObj = new Scanner(System.in);

        double t = myObj.nextDouble();
        /* Calculation */
        double speed = g * t;
        double distance = 0.5 * g * t * t;

        System.out.println("The speed of the object at " + t + " seconds after its release is " + speed + " and the distance the object has travelled in the " + t + " seconds after the relase is " + distance);
    }
}




