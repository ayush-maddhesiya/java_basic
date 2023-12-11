import java.util.Scanner;

public class factioral {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
    
            long sum = 1;
            if (number< 0) {
                System.out.println("this is invalid number ");
            }
            else{
                while (number > 0) {
                sum*=number;
                number--;
            }
            System.out.println("factorial is :- " + sum);
            }
    sc.close();

    }
}
