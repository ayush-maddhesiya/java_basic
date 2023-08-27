import java.util.Scanner;

public class count_number_of_digit {
    public static void main(String[] args) {
        Scanner sss = new Scanner(System.in);
        int num = sss.nextInt();
        int number = num;
        int digit = 0;
        while (num != 0){
            num/=10;
            digit++;

        }
        System.out.println("Number of digit in " + number  + " is " + digit);
    }
}
