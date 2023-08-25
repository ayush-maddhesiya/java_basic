//package java;
import java.util.Scanner;


public class addTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the Frist number :");
         int num_1 = sc.nextInt();

         System.out.print("Enter the Second number :");
         int num_2 = sc.nextInt();

         int num  = num_1 + num_2;

         System.out.println("Sum : " + num);

    }    
}
