import java.util.Scanner;

public class print_rectangular
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hight = sc.nextInt();
        int width = sc.nextInt();

        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //for triangle

        for (int i = 1; i < hight; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("$");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        //for revesve triangle

        for (int j = hight; j > 0; j--){
            for (int i = 1; i <  j; i++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
