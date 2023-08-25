//package java;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter yr princpal : ");
        float p = sc.nextFloat();

        System.out.println("Enter Rate : ");
        float r = sc.nextFloat();

        System.out.println("Enter Time : ");
        float t  = sc.nextFloat();

        float result = p*r*t;

        System.out.println("Total amount be will be : " + result);
    }
}
