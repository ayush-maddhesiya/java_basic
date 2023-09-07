import java.util.Scanner;

public class PrefixofRange {
    static void printArray(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print( array[i] + " ");
        }
    }
    static  void sum(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
    }
    static int range(int[] arr , int l, int r){
        int ans  = arr[r] - arr[l];
        return  ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the value of " + n + " ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array : ");
        printArray(arr);

        sum(arr);
        System.out.println("After ");
        printArray(arr);

        System.out.println("Enter the range  : ");
        int l = sc.nextInt();
        l--;
        int r = sc.nextInt();
        r--;
        System.out.println();
        System.out.println(range(arr, l, r));
    }
}
