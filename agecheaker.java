import java.util.Scanner;

public class agecheaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age >18){
            System.out.println("Adult");
        }
        else if(age < 12){
            System.out.println("child");
        }
        else{
            System.out.println("teenager");
        }
    }
}
