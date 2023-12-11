import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daz = sc.nextInt();

        switch (daz) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUEDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THUSDAY");
                break;

            case 5:
                System.out.println("FRIDAY");
                break;

            case 6:
                System.out.println("SATURDAY");
                break;

            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
