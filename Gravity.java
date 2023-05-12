package Assign1;

import java.util.Scanner;

//Aileen Dong (ydong8@toromail.csudh.edu)
public class Gravity {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double xi, xt, vi, t, a;

        System.out.println("Enter the initial height in meters: ");
        xi = input.nextDouble();

        System.out.println("Time in seconds: ");
        t = input.nextDouble();

        vi = 0;
        a = 9.81;
        xt = -0.5 * a * t * t + (vi * t) + xi;


        if (xi >=0 && t >=0){
            if(xt>0){
                System.out.println("After being dropped from "  + String.format("%.2f",xi)  +" meters, the object fell " +  String.format("%.2f",xt) + " meters in " + t +
                        " seconds. The distance from the ground at the time was "+String.format("%.2f",xi-xt) +" meters. ");
            } else if (xt == 0){
                //when the object is already on the ground
                System.out.println("After being dropped from " + String.format("%.2f",xi)+ " meters, the object fell " + String.format("%.2f",xt)+ " meters in " + t +
                        " seconds. The distance from the ground at the time was 0 meter. ");
            }else{
                System.out.println("The object is already on the ground");
            }
        } else {
            System.out.println("invalid input of xi and t, they should not be negative");
        }
    }

}
