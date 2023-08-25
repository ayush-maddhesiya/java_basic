//package java;
import java.util.Scanner;


public class takingInputs{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Lucky number:");
        int num = sc.nextInt();
        System.out.println("Your Lucky number is : " + num);
        System.out.println("Enter you r name :");
        String  name = sc.nextLine();
       System.out.println("Name is :" + name);

    }
}
