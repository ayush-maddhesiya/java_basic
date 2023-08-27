import java.util.Scanner;

public class factioal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 1;
        for (int n = 1; n < number; n++) {
            fact = fact*n;
            System.out.println("Factoial of " + n + " is : " + fact);
        }
    }
}
