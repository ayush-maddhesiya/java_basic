import java.util.Scanner;
public class lastOccur{
    public static boolean cheak(int[] arr) {
        int n = arr.length - 1;
        for (int j = 0; j < n; j++) {
            if (arr[j] > arr[j + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ; ");

        int n = sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter value of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the X : ");
        int x = sc.nextInt();
        System.out.println("LAst occur is : " + cheak(arr));
    }
}
