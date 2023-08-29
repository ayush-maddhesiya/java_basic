import java.util.Scanner;

public class binary_to_dicemal {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int bin_number = cs.nextInt();
        int num = bin_number;
        int power = 1;
        int aswer = 0;
        while( bin_number > 0){
            int digit = bin_number % 10;
            aswer += digit*power;
            bin_number /= 10;
            power *= 2;
        }

        System.out.println("Dicmal number of " + num + " is " + aswer);
    }
}
