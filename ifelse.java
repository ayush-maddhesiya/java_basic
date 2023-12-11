import java.util.Scanner;

class ifelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("EVEN");
        }
        else{
            System.out.println("odd");
        }

    }
}