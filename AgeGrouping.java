import java.util.Scanner;

public class AgeGrouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age = sc.nextInt();

        if(age < 12){
            System.out.println("YOu r child");
        }
        else if(age > 12 && age < 18){
            System.out.println("Teenager");

        }
        else{
                System.out.println("Adult :");
        }

        //using ternary opertor
    String ans;
    ans = (age % 2 == 0)? "even ":"odd";
    System.out.println(ans);
    }   

    

}
