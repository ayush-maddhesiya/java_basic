import java.util.Scanner;

public class ZeroandOne {
    static void printArray(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print( array[i] + " ");
        }
    }

    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static  void sort(int[] arr){
        int n = arr.length;
        int zeros = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                zeros++;

            }
        }
        for (int i = 0; i < zeros-1; i++) {
            arr[i] = 0;
        }
        for (int i = zeros; i < n; i++) {
            arr[i] = 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of element : ");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + "element of array  : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
        }
        System.out.println("Orignal array : ");
        printArray(arr);
        System.out.println();
        System.out.println();

        sort(arr);
        printArray(arr);

    }
}
