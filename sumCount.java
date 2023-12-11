import java.util.Scanner;

public class sumCount {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
    
            int sum = 0;
            while(number != 0){
                int temp = number%10;
                number/=10;
                sum+=temp;
            }

            System.out.println("Sum ; " + sum);
        }
    
}

