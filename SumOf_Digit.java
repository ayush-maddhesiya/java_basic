import java.util.Scanner;

public class SumOf_Digit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int number  = num;
        int sum = 0;
        while(num != 0){
            sum = sum + num%10;
            num /= 10;
        }
    }
}
