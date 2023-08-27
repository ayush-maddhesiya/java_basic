import java.util.Scanner;

public class sumIn_odd_ever {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of Element to make Sum : ");
        int num = sc.nextInt();
        System.out.println("Enter the each element one by one :");
        for (int i =0; i < num;i++){
            int number = sc.nextInt();
            sum += (number %2 == 0)? -number:number;
        }
        System.out.println("Sum : "+ sum);
    }
}
