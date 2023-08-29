import java.util.Scanner;

public class number_bin {
    public static void main(String[] args) {
        System.out.println("Enter decimal value to change to binary: ");
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary = "";

        while (decimal > 0) {
            int digit = decimal % 2;
            binary = digit + binary;
            decimal /= 2;
        }

        System.out.println("Binary representation: " + binary);
    }
}
