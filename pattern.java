import java.util.Scanner;

public class pattern {
    //123456
    //123456
    //123456
    //123456
    //123456
    //123456
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int k = 1; k <= num; k++) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i);

            }
            System.out.println();
        }
    }
}
