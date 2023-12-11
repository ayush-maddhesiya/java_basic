import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
    
            int new_number = 0;  //this will contain new number,which is reverse/.
            while (number != 0) {
                int temp = number%10;
                new_number = new_number*10 + temp;
                number/=10;
            }
            System.out.println("this will number : " + new_number);

            sc.close();
    }
}
